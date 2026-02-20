/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author acer
 */
public class SinhVien {
    private int MaSV;
    private String name;
    private int NamSinh;
    private double DiemC;

    public SinhVien() {
    }

    public SinhVien(int MaSV, String name, int NamSinh, double DiemC) {
        this.MaSV = MaSV;
        this.name = name;
        this.NamSinh = NamSinh;
        this.DiemC = DiemC;
    }

    
    public int getMaSV() {
        return MaSV;
    }

    public void setMaSV(int MaSV) {
        this.MaSV = MaSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public double getDiemC() {
        return DiemC;
    }

    public void setDiemC(double DiemC) {
        this.DiemC = DiemC;
    }
    
    public void inThongTin(){
        System.out.println("Mã số sinh viên: " + MaSV);
        System.out.println("Tên sinh viên: " + name);
        System.out.println("Năm sinh sinh viên: " + NamSinh);
        System.out.println("Điểm môn C: " + DiemC);
    }
}
