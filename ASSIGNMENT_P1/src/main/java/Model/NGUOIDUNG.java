/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class NGUOIDUNG {

    String TenNguoiDung;
    String MaNguoiDung;
//  chi co the chon nam hoac nu
    boolean GioiTinh;
    String DienThoai;
    String DiaChi;
    String Quan;
    String Email;

    public NGUOIDUNG() {
    }

    public NGUOIDUNG(String TenNguoiDung, String MaNguoiDung, boolean GioiTinh, String DienThoai, String DiaChi, String Quan, String Email) {
        this.TenNguoiDung = TenNguoiDung;
        this.MaNguoiDung = MaNguoiDung;
        this.GioiTinh = GioiTinh;
        this.DienThoai = DienThoai;
        this.DiaChi = DiaChi;
        this.Quan = Quan;
        this.Email = Email;
    }

    public String getTenNguoiDung() {
        return TenNguoiDung;
    }

    public void setTenNguoiDung(String TenNguoiDung) {
        this.TenNguoiDung = TenNguoiDung;
    }

    public String getMaNguoiDung() {
        return MaNguoiDung;
    }

    public void setMaNguoiDung(String MaNguoiDung) {
        this.MaNguoiDung = MaNguoiDung;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getQuan() {
        return Quan;
    }

    public void setQuan(String Quan) {
        this.Quan = Quan;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "NGUOIDUNG{" + "TenNguoiDung=" + TenNguoiDung + ", MaNguoiDung=" + MaNguoiDung + ", GioiTinh=" + GioiTinh + ", DienThoai=" + DienThoai + ", DiaChi=" + DiaChi + ", Quan=" + Quan + ", Email=" + Email + '}';
    }

}
