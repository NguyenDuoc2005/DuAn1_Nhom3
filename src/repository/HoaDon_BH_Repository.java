package repository;

import config.DBConnect;
import entity.HoaDon_;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import response.HoaDon_BH_Response;

public class HoaDon_BH_Repository {

    public ArrayList<HoaDon_BH_Response> getAllByStatus() {
        String sql = """
       SELECT    dbo.HoaDon.ID_Hoa_Don, dbo.HoaDon.Ma_Hoa_Don, CONVERT(date, dbo.HoaDon.Ngay_Tao) as'NgayTao',
       dbo.HoaDon.Tong_Gia, dbo.HoaDon.ID_Khach_Hang, dbo.HoaDon.ID_Nhan_Vien, dbo.HoaDon.Trang_Thai, dbo.NhanVien.Ma_NV, 
        dbo.NhanVien.Ho_Ten, dbo.KhachHang.Ma_Khach_Hang, dbo.KhachHang.Ten ,dbo.KhachHang.SĐT
       FROM         dbo.HoaDon INNER JOIN
       dbo.NhanVien ON dbo.HoaDon.ID_Nhan_Vien = dbo.NhanVien.ID_Nhan_Vien left JOIN
       dbo.KhachHang ON dbo.HoaDon.ID_Khach_Hang = dbo.KhachHang.ID_Khach_Hang
                     where HoaDon.Trang_Thai = 0
                     order by HoaDon.Ngay_Tao desc
                     """;
        ArrayList<HoaDon_BH_Response> lists = new ArrayList<>();
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon_BH_Response response = HoaDon_BH_Response.builder()
                        .idHoaDon(rs.getInt(1))
                        .maHoaDon(rs.getString(2))
                        .ngayTao(rs.getDate(3))
                        .tongGia(rs.getFloat(4))
                        .idKhachHang(rs.getInt(5))
                        .idNhanVien(rs.getInt(6))
                        .trangThai(rs.getInt(7))
                        .maNhanVien(rs.getString(8))
                        .tenNhanVien(rs.getString(9))
                        .maKhachHang(rs.getString(10))
                        .tenKhachHang(rs.getString(11))
                        .sdtKhachHang(rs.getString(12))
                        .build();
                lists.add(response);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out); // nem loi khi xay ra 
        }
        return lists;
    }
    
    public boolean taoHoaDon(HoaDon_ hoaDon) {

        int check = 0;

        String sql = """
                    INSERT INTO [dbo].[HoaDon]
                               (
                               [ID_Nhan_Vien]
                    		   ,[Tong_Gia]          
                    		   ,[Trang_Thai])
                         VALUES
                               (?,0,0)
                    """;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
        
            ps.setObject(1, hoaDon.getIdNhanVien()); // Nhan vien lay tu login
            
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        return check > 0;
    }
}
