package response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor   // contructor full tham so 
@NoArgsConstructor // contructor k tham so 
@Getter 
@Setter 
@ToString
@Builder // contructor tùy chọn tham số
public class SanPham_BH_Response {
    private int idSanPham; 
    private String maSanPham; 
    private String tenSanPham; 
    private int soLuong;
    private Float giaBan; 
    private int idMauSac; 
    private String mauSac; 
    private int trangThai;  
    private int tongImeiSP;
    //
    private int idImei;
    private String MaImei;
    private int trangThaiImei;
}
