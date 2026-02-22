package Services;

import java.util.ArrayList;
import java.util.Scanner;
import model.SanPham;
import model.SanPhamDienTu;
import model.SanPhamTieuDung;
import java.util.Comparator;
import java.util.Collections;

public class Service {

    // Khởi tạo danh sách
    private ArrayList<SanPham> ds = new ArrayList<>();

    // Constuctor
    public Service() {
    }

    // Getter & setter
    public ArrayList<SanPham> getDs() {
        return ds;
    }

    public void setDs(ArrayList<SanPham> ds) {
        this.ds = ds;
    }

    // Y5: Phương thức bắt lỗi mã sản phẩm
    private String nhapMaSP(Scanner scan) {

        String mauRegex = "SP\\d{3}";

        while (true) {
            System.out.print("Nhập mã SP (Ví dụ SP001): ");
            String ma = scan.nextLine();

            if (ma.matches(mauRegex)) {
                return ma; // Đúng thì thoát hàm và trả về mã
            } else {
                System.out.println(">>> Lỗi: Mã SP phải bắt đầu bằng 'SP' và theo sau là 3 chữ số!");
            }
        }
    }

    private double nhapSoDouble(String thongBao, Scanner scan) {
        while (true) {
            try {
                System.out.print(thongBao);
                return Double.parseDouble(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lỗi! Vui lòng nhập số.");
            }
        }
    }

    private int nhapSoInt(String thongBao, Scanner scan) {
        while (true) {
            try {
                System.out.print(thongBao);
                return Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lỗi! Vui lòng nhập số nguyên.");
            }
        }
    }

    // Y1: Nhập thông tin    
    public void input(Scanner scan) {
        System.out.println("\n--- Chọn loại sản phẩm muốn thêm ---");
        System.out.println("1. Sản phẩm Điện tử");
        System.out.println("2. Sản phẩm Tiêu dùng");
        int loai = nhapSoInt("Chọn: ", scan);

        SanPham sp;
        if (loai == 1) {
            sp = new SanPhamDienTu();
        } else {
            sp = new SanPhamTieuDung();
        }

        // Nhập thông tin chung
        sp.setMaSP(nhapMaSP(scan)); // Dùng hàm check Regex đã viết
        System.out.print("Nhập tên SP: ");
        sp.setTenSP(scan.nextLine());
        sp.setDonGia(nhapSoDouble("Nhập đơn giá: ", scan));
        sp.setSoLuong(nhapSoInt("Nhập số lượng: ", scan));

        // Nhập thông tin riêng (Ép kiểu)
        if (sp instanceof SanPhamDienTu) {
            System.out.print("Nhập ngày bảo hành: ");
            ((SanPhamDienTu) sp).setNgayBaoHanh(scan.nextLine());
        } else if (sp instanceof SanPhamTieuDung) {
            ((SanPhamTieuDung) sp).setGiamGia(nhapSoDouble("Nhập mức giảm giá: ", scan));
        }

        ds.add(sp);
        System.out.println("=> Thêm sản phẩm thành công!");
    }

    // Y2: Hiển thị thông tin sản phẩm    
    public void output() {
        if (ds.isEmpty()) {
            System.out.println(">>> Danh sách đang trống!");
            return;
        }
        System.out.println("\n--- DANH SÁCH SẢN PHẨM ---");
        for (SanPham sp : ds) {
            sp.Xuat(); // Gọi hàm Xuat() của Model
        }
    }

    // Y4: Cập nhật
    public int update(Scanner scan) {
        System.out.print("Nhập mã sản phẩm cần cập nhật: ");
        String ma = scan.nextLine();
        int find = -1;
        for (SanPham sp : ds) {
            if (sp.getMaSP().equalsIgnoreCase(ma)) {
                System.out.println("Nhập tên món hàng mới");
                sp.setTenSP(scan.nextLine());
                sp.setDonGia(nhapSoDouble("Nhập đơn giá mới: ", scan));
                sp.setSoLuong(nhapSoInt("Nhập số lượng mới: ", scan));
                System.out.println("=> Cập nhật thành công!");
                find = 1;
                break;
            }
        }
        if (find == -1) {
            System.out.println("=> Không tìm thấy sản phẩm!");
        }
        return -1;
    }

    // Y6: Tìm kiếm
    public void search(Scanner scan) {
        System.out.print("Nhập mã SP cần tìm: ");
        String ma = scan.nextLine();
        for (SanPham sp : ds) {
            if (sp.getMaSP().equalsIgnoreCase(ma)) {
                sp.Xuat();
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }

// Y7: Xóa
    public void delete(Scanner scan) {
        System.out.print("Nhập mã SP cần xóa: ");
        String ma = scan.nextLine();
        boolean deleted = ds.removeIf(sp -> sp.getMaSP().equalsIgnoreCase(ma));
        if (deleted) {
            System.out.println("Đã xóa thành công!");
        } else {
            System.out.println("Không tìm thấy để xóa!");
        }
    }

    // Y8: Sắp xếp danh sách theo tên
    public void sort() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o1.getTenSP().compareToIgnoreCase(o2.getTenSP());
            }
        };
        Collections.sort(ds, comp);
        System.out.println("=> Đã sắp xếp danh sách theo tên!");
        output(); // Hiển thị luôn danh sách sau khi sắp xếp
    }
}
