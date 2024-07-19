package repository;

import config.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import response.SanPham_Response;

public class SanPham_Repository {

    public ArrayList<SanPham_Response> getAll_SP_Moi() {
        ArrayList<SanPham_Response> listSP = new ArrayList<>();
        listSP.clear();
        String sql = """
                    SELECT    dbo.SanPham.ID_San_Pham, dbo.SanPham.Ma_San_Pham, dbo.SanPham.Ten_San_Pham, dbo.SanPham.Mo_Ta, CONVERT(date,dbo.SanPham.Ngay_Tao) as'NgayTao', dbo.SanPham.So_Luong, dbo.SanPham.Gia_Nhap, dbo.SanPham.Gia_Ban, 
                                          dbo.SanPham.Hinh_Anh, dbo.SanPham.Trang_Thai, dbo.Rom.ID_Rom, dbo.Rom.Rom, dbo.MauSac.ID_Mau_Sac, dbo.MauSac.Mau_Sac, dbo.Ram.ID_Ram, dbo.Ram.Ram, dbo.KichThuoc.ID_Kich_Thuoc, 
                                          dbo.KichThuoc.Kich_Thuoc, dbo.PhanLoai.ID_Phan_Loai, dbo.PhanLoai.Phan_Loai, dbo.DungLuongPin.ID_Dung_Luong_Pin, dbo.DungLuongPin.Dung_Luong_Pin, dbo.XuatXu.ID_Xuat_Xu, dbo.XuatXu.Xuat_Xu, 
                                          dbo.CPU.ID_CPU, dbo.CPU.CPU
                    FROM         dbo.SanPham INNER JOIN
                                          dbo.Rom ON dbo.SanPham.ID_Rom = dbo.Rom.ID_Rom INNER JOIN
                                          dbo.Ram ON dbo.SanPham.ID_Ram = dbo.Ram.ID_Ram INNER JOIN
                                          dbo.PhanLoai ON dbo.SanPham.ID_Phan_Loai = dbo.PhanLoai.ID_Phan_Loai INNER JOIN
                                          dbo.XuatXu ON dbo.SanPham.ID_Xuat_Xu = dbo.XuatXu.ID_Xuat_Xu INNER JOIN
                                          dbo.MauSac ON dbo.SanPham.ID_Mau_Sac = dbo.MauSac.ID_Mau_Sac INNER JOIN
                                          dbo.KichThuoc ON dbo.SanPham.ID_Kich_Thuoc = dbo.KichThuoc.ID_Kich_Thuoc INNER JOIN
                                          dbo.DungLuongPin ON dbo.SanPham.ID_Dung_Luong_Pin = dbo.DungLuongPin.ID_Dung_Luong_Pin INNER JOIN
                                          dbo.CPU ON dbo.SanPham.ID_CPU = dbo.CPU.ID_CPU
                    WHERE SanPham.Trang_Thai = 0 order by SanPham.Ma_San_Pham desc
                     """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham_Response sp = SanPham_Response.builder()
                        .idSanPham(rs.getInt(1))
                        .maSanPham(rs.getString(2))
                        .tenSanPham(rs.getString(3))
                        .moTa(rs.getString(4))
                        .ngayTao(rs.getDate(5))
                        .soLuong(rs.getInt(6))
                        .giaNhap(rs.getFloat(7))
                        .giaBan(rs.getFloat(8))
                        .hinhAnh(rs.getString(9))
                        .trangThai(rs.getInt(10))
                        .idRom(rs.getInt(11))
                        .rom(rs.getString(12))
                        .idMauSac(rs.getInt(13))
                        .mauSac(rs.getString(14))
                        .idRam(rs.getInt(15))
                        .ram(rs.getString(16))
                        .idKichThuoc(rs.getInt(17))
                        .kichThuoc(rs.getString(18))
                        .idPhanLoai(rs.getInt(19))
                        .phanLoai(rs.getString(20))
                        .idDungLuongPin(rs.getInt(21))
                        .dungLuongPin(rs.getString(22))
                        .idXuatXu(rs.getInt(23))
                        .xuatXu(rs.getString(24))
                        .idCPU(rs.getInt(25))
                        .CPU(rs.getString(26))
                        .build();
                listSP.add(sp);
            }
            return listSP;
        } catch (Exception e) {
            return null;
        }
        
    }
    
}
