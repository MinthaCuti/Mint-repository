/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.Sach;
import Models.MuonTra;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Service {

    ArrayList<Sach> Sach = new ArrayList<>();

    public Service() {
    }

    public ArrayList<Sach> getSach() {
        return Sach;
    }

    public void setSach(ArrayList<Sach> Sach) {
        this.Sach = Sach;
    }

    public void input(Scanner scan) {
        Sach sach = new Sach();
        System.out.println("Vui lòng nhập mã sách: ");
        String maSach = scan.nextLine();
        sach.setMaSach(maSach);
        System.out.println("Vui lòng nhập tên sách: ");
        String name = scan.nextLine();
        sach.setName(name);
        System.out.println("Vui lòng nhập năm suất bản: ");
        int year = Integer.parseInt(scan.nextLine());
        sach.setYear(year);
        this.Sach.add(sach);
    }

    public void output(Scanner scan) {
        if(Sach.isEmpty()){
            System.out.println(">>> Danh sách đang trống!");
        }
        System.out.println("Vui lòng nhập khoảng từ năm nào đến năm nào:");
        System.out.println("Từ" + ":");
        int nam1 = Integer.parseInt(scan.nextLine());
        System.out.println("Đến" + ":");
        int nam2 = Integer.parseInt(scan.nextLine());
        System.out.println("=========================");
        for (Sach sach : this.Sach) {
            if (sach.getYear() >= nam1 && sach.getYear() <= nam2) {
                System.out.println("Mã sách: " + sach.getMaSach());
                System.out.println("Tên sách: " + sach.getName());
                System.out.println("Năm xuất bản: " + sach.getYear());
                System.out.println("=========================");
            }
        }
    }

    public void find() {
        System.out.println("=========================");
        for (Sach sach : this.Sach) {
            if (sach.getName().startsWith("Lập trình")) {
                System.out.println("Mã sách: " + sach.getMaSach());
                System.out.println("Tên sách: " + sach.getName());
                System.out.println("Năm xuất bản: " + sach.getYear());
                System.out.println("=========================");
            }
        }
    }

    public int update(Scanner scan) {
        System.out.println("Nhập Mã sách cần cập nhật: ");
        String findID = scan.nextLine();
        for (Sach sach : this.Sach) {
            if (sach.getMaSach().equalsIgnoreCase(findID)) {
                System.out.println("~~~ Kết quả tìm thấy ~~~");
                System.out.println("Mã sách: " + sach.getMaSach());
                System.out.println("Tên sách: " + sach.getName());
                System.out.println("Năm xuất bản: " + sach.getYear());
                System.out.println("=========================");
                System.out.println("Nhập lại tên mới: ");
                String newName = scan.nextLine();
                sach.setName(newName);
                System.out.println("Nhập lại năm xuất bản: ");
                int newYear = Integer.parseInt(scan.nextLine());
                sach.setYear(newYear);
                System.out.println(">>> Cập nhật thành công!");
            }
        }
        return 1;
    }

    public void sortByName() {
        this.Sach.sort((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
        System.out.println("--- Đã sắp xếp danh sách theo tên (A-Z) ---");
        for (Sach sach : this.Sach) {
            System.out.println(sach.getName() + " - " + sach.getYear());
        }
    }

    public void delete(Scanner scan) {
        System.out.println("Vui lòng nhập mã sách cần xóa: ");
        String findID = scan.nextLine();
        System.out.println("=========================");
        boolean isRemoved = this.Sach.removeIf(sach -> sach.getMaSach().equalsIgnoreCase(findID));

        if (isRemoved) {
            System.out.println("Đã xóa thành công!");
        } else {
            System.out.println("Không tìm thấy mã sách " + findID + " để xóa.");
        }
    }

    public void beforeYear(Scanner scan) {
        System.out.println("Vui lòng nhập mốc năm xuất bản: ");
        int mocNam = Integer.parseInt(scan.nextLine());
        System.out.println("--- Danh sách sách xuất bản trước năm " + mocNam + " ---");

        boolean found = false;
        for (Sach sach : this.Sach) {
            if (sach.getYear() < mocNam) {
                System.out.println("Mã sách: " + sach.getMaSach());
                System.out.println("Tên sách: " + sach.getName());
                System.out.println("Năm xuất bản: " + sach.getYear());
                System.out.println("=========================");
                found = true;
            }

        }
        if (!found) {
            System.out.println("Không tìm thấy sách nào xuất bản trước năm " + mocNam);
        }
    }

    public void keThua() {
        MuonTra mt = new MuonTra("MD001", "MS001", "Lập trình Java 1", 3, 15000, 2025);
        System.out.println("--- Thông tin đối tượng MuonTra vừa tạo ---");
        mt.xuanThongTinMuonTra();
        int tongTien = mt.tinhTien();
        System.out.println("Tổng tiền cước: " + tongTien);
    }
}
