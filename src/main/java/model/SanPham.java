package model;

// Attributes
public class SanPham {

    public String maSP;
    public String tenSP;
    public double donGia;
    public int soLuong;

// Constructor rỗng
    public SanPham() {
    }

// Constructor có tham số
    public SanPham(String maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

// Method (Setter & Getter)
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    // Y3: Viết phương thức tính thành tiền = số lượng * đơn giá        
    public double thanhTien() {
        return donGia * soLuong;
    }

    public void Xuat() {
        System.out.println(
                maSP + " | " + tenSP
                + " | Giá: " + donGia
                + " | SL: " + soLuong
                + " | Thành tiền: " + thanhTien()
        );
    }

}
