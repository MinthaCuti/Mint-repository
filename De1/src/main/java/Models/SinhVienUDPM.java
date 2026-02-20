/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author acer
 */
public class SinhVienUDPM extends SinhVien {

    private double DiemJava;

    public SinhVienUDPM() {
    }
    
    public SinhVienUDPM(double DiemJava, int MaSV, String name, int NamSinh, double DiemC) {
        super(MaSV, name, NamSinh, DiemC);
        this.DiemJava = DiemJava;
    }

    public double getDiemJava() {
        return DiemJava;
    }

    public void setDiemJava(double DiemJava) {
        this.DiemJava = DiemJava;
    }
    

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Điểm Java: " + DiemJava);
    }

}
