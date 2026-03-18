/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package View;

import Models.Employee;
import Services.EmployeeServices;
import java.util.Scanner;

/**
 *
 * @author huyhk
 */
public class LAB3_BAI2_MOB1024_SD2001_TV00385 {

    public static void main(String[] args) {
        EmployeeServices service = new EmployeeServices();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Loc salary >= 15tr");
            System.out.println("4. Sap xep salary giam dan");
            System.out.println("5. Lay danh sach ten");
            System.out.println("6. Dem ten bat dau bang A");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Nhap ten: ");
                    String name = sc.nextLine();

                    System.out.print("Nhap salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Nhap id: ");
                    String id = sc.nextLine();
                    service.add(new Employee(id, name, salary));
                    break;

                case 2:
                    service.getAll().forEach(System.out::println);
                    break;

                case 3:
                    service.filterSalary();
                    break;

                case 4:
                    service.sortSalaryDesc();
                    break;

                case 5:
                    service.getAllNames().forEach(System.out::println);
                    break;

                case 6:
                    System.out.println("So luong: " + service.countNameStartWithA());
                    break;

                case 0:
                    System.out.println("Thoat!");
                    return;

                default:
                    System.out.println("Nhap sai!");
            }
        }
    }
}
