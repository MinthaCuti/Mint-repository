/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package java1.de2;

import Services.Service;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class De2 {

    public static Scanner scan = new Scanner(System.in);
    public static Service service = new Service();

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("---------------------- MENU ----------------------");
            System.out.println("1. Nhập danh sách Sách");
            System.out.println("2. Xuất danh sách Sách theo khoảng năm xuất bản");
            System.out.println("3. Tìm các sách có ký tự đầu của tên là 'Lập trình'");
            System.out.println("4. Cập nhật lại sách theo mã sách");
            System.out.println("5. Sắp xếp danh sách Sách theo tên (A - Z)");
            System.out.println("6. Xóa Sách theo Mã sách");
            System.out.println("7. Kế thừa");
            System.out.println("8. Đưa ra sách có năm xuất bản trước năm được nhập");
            System.out.println("0. Thoát chương trình");
            System.out.println("--------------------------------------------------");
            System.out.println("Vui lòng chọn chức năng" + ":");
            option = Integer.parseInt(scan.nextLine());
            switch (option) {
                case 1: {
                    String check;
                    do {
                        service.input(scan);
                        System.out.println("Bạn có muốn nhập tiếp không? (Y/N)");
                        check = scan.nextLine();
                    } while (check.equalsIgnoreCase("Y"));
                    break;
                }
                case 2:{
                    service.output(scan);
                    break;
                }
                case 3:{
                    service.find();
                    break;
                }
                case 4:{
                    service.update(scan);
                    break;
                }
                case 5:{
                    service.sortByName();
                    break;
                }
                case 6:{
                    service.delete(scan);
                    break;
                }
                case 7: {
                    service.keThua();
                    break;
                }
                case 8:{
                    service.beforeYear(scan);
                    break;
                }
                default: System.out.println("Nhập sai! Vui lòng nhập lại.");
                break;
            }
        } while (option != 0);
    }
}
