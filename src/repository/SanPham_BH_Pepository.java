package repository;

import config.DBConnect;
import form.SanPham_form;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import response.SanPham_BH_Response;

public class SanPham_BH_Pepository {

    public ArrayList<SanPham_BH_Response> getAll() {
        String sql = """
                 SELECT    dbo.SanPham.ID_San_Pham, dbo.SanPham.Ma_San_Pham, dbo.SanPham.Ten_San_Pham, 
                 	dbo.SanPham.So_Luong, dbo.SanPham.Gia_Ban, dbo.SanPham.Trang_Thai, dbo.MauSac.Mau_Sac, 
                     COUNT(SanPham.ID_San_Pham)as'SoLuongImei'
                 FROM         dbo.SanPham INNER JOIN
                                       dbo.MauSac ON dbo.SanPham.ID_Mau_Sac = dbo.MauSac.ID_Mau_Sac INNER JOIN
                                       dbo.Imei ON dbo.SanPham.ID_San_Pham = dbo.Imei.ID_San_Pham
                 					  where Imei.Trang_Thai = 1
                 group by	 dbo.SanPham.ID_San_Pham, dbo.SanPham.Ma_San_Pham, dbo.SanPham.Ten_San_Pham, 
                 dbo.SanPham.So_Luong, dbo.SanPham.Gia_Ban, dbo.SanPham.Trang_Thai, dbo.MauSac.Mau_Sac
                     """;
        ArrayList<SanPham_BH_Response> lists = new ArrayList<>();
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham_BH_Response sp = SanPham_BH_Response.builder()
                        .idSanPham(rs.getInt(1))
                        .maSanPham(rs.getString(2))
                        .tenSanPham(rs.getString(3))
                        .soLuong(rs.getInt(4))
                        .giaBan(rs.getFloat(5))
                        .trangThai(rs.getInt(6))
                        .mauSac(rs.getString(7))
                        .tongImeiSP(rs.getInt(8))
                        .build();
                lists.add(sp);
            }
            return lists;
        } catch (Exception e) {
            e.printStackTrace(System.out); // nem loi khi xay ra 
        }
        return lists;
    }

    public ArrayList<SanPham_BH_Response> chonImei(String maSP) {
        String sql = """
                 SELECT    dbo.Imei.ID_Imei, dbo.Imei.Ma_Imei, 
                                      dbo.Imei.Trang_Thai, dbo.SanPham.Ma_San_Pham,
                                      dbo.SanPham.Ten_San_Pham
                                  FROM         dbo.Imei INNER JOIN dbo.SanPham ON 
                                      dbo.Imei.ID_San_Pham = dbo.SanPham.ID_San_Pham
                                  where SanPham.Ma_San_Pham = ? AND Imei.Trang_Thai = 1
                     """;

        ArrayList<SanPham_BH_Response> lists = new ArrayList<>();
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, maSP);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham_BH_Response sp = SanPham_BH_Response.builder()
                        .idImei(rs.getInt(1))
                        .MaImei(rs.getString(2))
                        .trangThai(rs.getInt(3))
                        .maSanPham(rs.getString(4))
                        .tenSanPham(rs.getString(5))
                        .build();
                lists.add(sp);
            }
            return lists;
        } catch (Exception e) {
            e.printStackTrace(System.out); // nem loi khi xay ra 
        }
        return lists;
    }
    

    

}
