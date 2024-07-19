package response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter 
@Setter 
@ToString
@Builder
public class HoaDonChiTiet_BH_Response {
    private int idHoaDonChiTiet; 
    private int soLuong ; 
    private double donGia; 
    private int idHoaDon; 
    private int idSanPham; 
    private int maSanPham; 
     
}
