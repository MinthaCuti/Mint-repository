/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package java1.de1;

import Services.QLSV;
import Models.SinhVienUDPM;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class De1 {

    public static Scanner scan = new Scanner(System.in);
    public static QLSV quanly = new QLSV();

    public static void main(String[] args) {
        int option = 0;
        
        do {
            System.out.println("\n------------ MENU QUẢN LÝ ------------");
            System.out.println("1. Nhập sinh viên");
            System.out.println("2. Xuất danh sách");
            System.out.println("3. Xuất danh sách các Sinh viên qua môn");
            System.out.println("4. Tìm sinh viên theo mã");
            System.out.println("5. Kế thừa");
            System.out.println("0. Thoát");
            System.out.println("---------------------------------------");
            System.out.println("Vui lòng nhập giá trị cần làm"
                    + ": ");

            option = Integer.parseInt(scan.nextLine());
            switch (option) {
                case 1 ->  {
                    int option1 = 0;
                    quanly.input(scan);
                    do {
                        System.out.println("Bạn có muốn nhập tiếp?");
                        System.out.println("1. Có");
                        System.out.println("2. Không");
                        System.out.println("Vui lòng chọn: ");

                        option1 = Integer.parseInt(scan.nextLine());
                        switch (option1) {
                            case 1:
                                quanly.input(scan);
                                break;
                            case 2:
                                break;
                            default:
                                System.out.println("Vui lòng nhập lại!");
                        }
                    } while (option1 != 2);
                }
                case 2 ->  {
                    quanly.output();
                }
                case 3 ->  {
                    quanly.passOutput();
                }
                case 4 ->  {
                    quanly.findID(scan);
                }
                case 5 -> {
                    System.out.println("--- Thực thi kế thừa ---");
                    System.out.println("Đã tạo SinhVienUDPM");
                    SinhVienUDPM svUdpm = new SinhVienUDPM(9.6,123,"Verdelle Mintha",2008,10);
                    svUdpm.inThongTin();
                }
                default -> System.out.println("Nhập sai! Vui lòng nhập lại.");
            }
        } while (option != 0);
    }
}
