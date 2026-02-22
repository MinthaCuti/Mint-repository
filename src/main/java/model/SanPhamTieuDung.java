package model;

public class SanPhamTieuDung extends SanPham {

    private double giamGia;

    public SanPhamTieuDung() {
    }

    // Getter & Setter
    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    // Y3: Ghi đè phương thức tính tiền (Thành tiền = (Đơn giá * SL) - Giảm giá)
    @Override
    public double thanhTien() {
        return super.thanhTien() - giamGia;
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println(" | Giảm giá: " + giamGia + " | Thực thu: " + thanhTien());
    }
}
