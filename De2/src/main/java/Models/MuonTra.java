/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author acer
 */
public class MuonTra extends Sach{
    private String maDocGia;
    private int soLuong;
    private int cuocPhiMuonTra;

    public MuonTra() {
    }

    public MuonTra(String maDocGia, String maSach, String name, int soLuong, int cuocPhiMuonTra, int year) {
        super(maSach, name, year);
        this.maDocGia = maDocGia;
        this.soLuong = soLuong;
        this.cuocPhiMuonTra = cuocPhiMuonTra;
    }

    public String getMaDocGia() {
        return maDocGia;
    }

    public void setMaDocGia(String maDocGia) {
        this.maDocGia = maDocGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getCuocPhiMuonTra() {
        return cuocPhiMuonTra;
    }

    public void setCuocPhiMuonTra(int cuocPhiMuonTra) {
        this.cuocPhiMuonTra = cuocPhiMuonTra;
    }
    
    public int tinhTien(){
        return this.cuocPhiMuonTra * this.soLuong;
    }
    
    public void xuanThongTinMuonTra(){
        System.out.println("Mã độc giả: " + maDocGia);
        System.out.println("Mã sách: " + getMaSach());
        System.out.println("Tên sách: " + getName());
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Cước phí: " + cuocPhiMuonTra);
        System.out.println("=> Tổng tiền: " + tinhTien());
    }
    
}
