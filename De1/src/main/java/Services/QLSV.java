/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.SinhVien;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class QLSV {

    private ArrayList<SinhVien> sv = new ArrayList<>();

    public QLSV() {
    }

    public ArrayList<SinhVien> getSv() {
        return sv;
    }

    public void setSv(ArrayList<SinhVien> sv) {
        this.sv = sv;
    }

    public void input(Scanner scan) {
        SinhVien sv = new SinhVien();
        System.out.println("Vui lòng nhập MSSV: ");
        int MaSV = Integer.parseInt(scan.nextLine());
        sv.setMaSV(MaSV);
        System.out.println("Vui lòng nhập tên: ");
        String name = scan.nextLine();
        sv.setName(name);
        System.out.println("Vui lòng nhập năm sinh");
        int NamSing = scan.nextInt();
        sv.setNamSinh(NamSing);
        System.out.println("Vui lòng nhập điểm C: ");
        double DiemC = scan.nextDouble();
        sv.setDiemC(DiemC);
        scan.nextLine();
        this.sv.add(sv);
    }

    public void output() {
        if (sv.isEmpty()) {
            System.out.println("Danh sách đang trống!");
            return;
        }
        System.out.println("===============");
        for (SinhVien sv : this.sv) {
            sv.inThongTin();
//            System.out.println("MSSV: " + sv.getMaSV());
//            System.out.println("Tên: " + sv.getName());
//            System.out.println("Năm sinh: " + sv.getNamSinh());
//            System.out.println("Điểm C: " + sv.getDiemC());
              System.out.println("===============");
        }
    }

    public void passOutput() {
        System.out.println("===============");
        for (SinhVien sv : this.sv) {
            if (sv.getDiemC() >= 5) {
                sv.inThongTin();
//                System.out.println("MSSV: " + sv.getMaSV());
//                System.out.println("Tên: " + sv.getName());
//                System.out.println("Năm sinh: " + sv.getNamSinh());
//                System.out.println("Điểm C: " + sv.getDiemC());
                System.out.println("===============");
            }
        }
    }

    public int findID(Scanner scan) {
        System.out.println("Nhập MSSV Sinh Viên cần tìm: ");
        int findID = Integer.parseInt(scan.nextLine());
        
        for (int i = 0; i < this.sv.size(); i++) {
            SinhVien currentSV = this.sv.get(i);
            if (this.sv.get(i).getMaSV() == findID) {
                System.out.println("~~~ Kết quả tìm thấy ~~~");
                currentSV.inThongTin();
                System.out.println("Vị trí trong danh sách: " + i+1);
                return i;
            }

        }
        System.out.println("Không tìm thấy sinh viên có mã: " + findID);
        return -1; // Trả về -1 nếu đi hết danh sách mà không thấy
    }
}
