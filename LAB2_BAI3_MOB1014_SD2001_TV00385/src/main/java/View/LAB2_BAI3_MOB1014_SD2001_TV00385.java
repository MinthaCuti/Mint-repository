/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package View;

import Model.Employee;
import Service.EmployeeService;
import java.util.Scanner;

/**
 *
 * @author huyhk
 */
public class LAB2_BAI3_MOB1014_SD2001_TV00385 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        while(true){

            System.out.println("\n===== MENU =====");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim nhan vien theo id");
            System.out.println("4. Cap nhat luong");
            System.out.println("0. Thoat");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:

                    System.out.print("Nhap id: ");
                    String id = sc.nextLine();

                    System.out.print("Nhap name: ");
                    String name = sc.nextLine();

                    System.out.print("Nhap salary: ");
                    double salary = sc.nextDouble();

                    service.add(new Employee(id,name,salary));
                    break;

                case 2:
                    service.display();
                    break;

                case 3:

                    System.out.print("Nhap id can tim: ");
                    String fid = sc.nextLine();

                    Employee e = service.findById(fid);

                    if(e != null){
                        System.out.println(e);
                    }else{
                        System.out.println("Khong tim thay");
                    }

                    break;

                case 4:

                    System.out.print("Nhap id: ");
                    String uid = sc.nextLine();

                    System.out.print("Nhap luong moi: ");
                    double newSalary = sc.nextDouble();

                    service.updateSalary(uid,newSalary);

                    break;

                case 0:
                    System.exit(0);
            }

        }
    }
}
