/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Main;

/**
 *
 * @author acer
 */
import Entity.Employee;
import Repository.EmployeeRepository;
import java.util.List;
import java.util.Scanner;

public class MOB1024_SD2001_LAB7 {

    public static void main(String[] args) {
        EmployeeRepository repo = new EmployeeRepository();
        Scanner scan = new Scanner(System.in);

        System.out.println("========= CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN =========");

        // LẤY DANH SÁCH TOÀN BỘ NHÂN VIÊN
        System.out.println("\n1. Danh sách nhân viên hiện có trong Database:");
        showData(repo.getAll());

        // THÊM MỘT NHÂN VIÊN MỚI (BÀI 3)
        System.out.println("\n2. Đang thêm nhân viên mới...");
        Employee newEmp = new Employee(0, "Verdelle Mintha", 25000000); // ID để 0 vì SQL tự tăng
        boolean isAdded = repo.add(newEmp);
        if (isAdded) {
            System.out.println("=> Thêm thành công nhân viên: " + newEmp.getName());
        } else {
            System.out.println("=> Thêm thất bại! Vui lòng kiểm tra lại kết nối.");
        }
        
        // CẬP NHẬT NHÂN VIÊN (BÀI 3)
        System.out.println("\n3. Đang cập nhật nhân viên");
        System.out.println("Nhập ID nhân viên cần cập nhật: ");
        int updateId = Integer.parseInt(scan.nextLine());
        System.out.println("Nhập tên mới: ");
        String newName = scan.nextLine();
        System.out.println("Nhập mức lương mới: ");
        double newSalary = Double.parseDouble(scan.nextLine());
        Employee updateEmp = new Employee(updateId, newName, newSalary);
        if (repo.update(updateEmp)) {
            System.out.println("=> Cập nhật thành công!");
        } else {
            System.out.println("=> Cập nhật thất bại (Không tìm thấy ID)!");
        }
        
        // XÓA NHÂN VIÊN (BÀI 3)
        int deleteId;
        System.out.println("Vui lòng nhập ID nhân viên cần xóa: ");
        deleteId = Integer.parseInt(scan.nextLine());
        System.out.println("\n4. Đang xóa nhân viên có ID = " + deleteId + "...");
        if (repo.delete(deleteId)) {
            System.out.println("=> Xóa thành công!");
        } else {
            System.out.println("=> Xóa thất bại (Không tìm thấy ID)!");
        }

        // TÌM KIẾM THEO MÃ NHÂN VIÊN (BÀI 4)
        int searchId;
        System.out.println("Vui lòng nhập ID cần tìm: ");
        searchId = Integer.parseInt(scan.nextLine());
        System.out.println("\n5. Thực hiện tìm kiếm nhân viên có ID = " + searchId + ":");
        Employee found = repo.findById(searchId);
        if (found != null) {
            System.out.println("=> Kết quả tìm kiếm: " + found.toString());
            System.out.println("=> TRẠNG THÁI: TÌM KIẾM THÀNH CÔNG!");
        } else {
            System.out.println("=> TRẠNG THÁI: TÌM KIẾM THẤT BẠI (Không tìm thấy ID này)!");
        }

        // HIỂN THỊ LẠI DANH SÁCH SAU KHI THAO TÁC
        System.out.println("\n6. Danh sách nhân viên sau khi cập nhật:");
        showData(repo.getAll());

        System.out.println("\n================ FINISHED ================");
    }

    public static void showData(List<Employee> list) {
        if (list.isEmpty()) {
            System.out.println("(Danh sách trống)");
        } else {
            for (Employee emp : list) {
                System.out.println("   > " + emp.toString());
            }
        }
    }
}
