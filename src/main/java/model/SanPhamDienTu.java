package model;

public class SanPhamDienTu extends SanPham {

    private String ngayBaoHanh;

    public SanPhamDienTu() {
    }

    // Getter & Setter
    public String getNgayBaoHanh() {
        return ngayBaoHanh;
    }

    public void setNgayBaoHanh(String ngayBaoHanh) {
        this.ngayBaoHanh = ngayBaoHanh;
    }

    @Override
    public void Xuat() {
        super.Xuat(); // Gọi hàm xuất cơ bản của cha
        System.out.println(" | Bảo hành: " + ngayBaoHanh);
    }
}
