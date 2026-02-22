package java1.asm2;

import java.util.Scanner;
import Services.Service;

public class ASM2 {

    static Scanner scan = new Scanner(System.in);
    public static Service service = new Service();
// Y10: Menu chương trình
    public static void main(String[] args) {
        int option;
        do {
            System.out.println("\n===== MENU QUẢN LÝ =====");
            System.out.println("1. Thêm sản phẩm (Có kế thừa)");
            System.out.println("2. Xem danh sách");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Tìm kiếm sản phẩm");
            System.out.println("5. Xóa sản phẩm");
            System.out.println("6. Sắp xếp theo tên");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            
            // Bọc để quản lý việc chương trình không crash khi nhập chữ
            try {
                option = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                option = -1;
            }

            switch (option) {
                case 1 ->
                    service.input(scan);
                case 2 ->
                    service.output();
                case 3 ->
                    service.update(scan);
                case 4 ->
                    service.search(scan); 
                case 5 ->
                    service.delete(scan);
                case 6 ->
                    service.sort(); 
                case 0 ->
                    System.out.println("Tạm biệt!");
                default ->
                    System.out.println("Chọn sai, vui lòng chọn lại (0-6)!");
            }
        } while (option != 0);
    }
}
 