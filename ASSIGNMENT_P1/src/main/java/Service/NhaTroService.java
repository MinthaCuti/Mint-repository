/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NHATRO;
import java.util.ArrayList;

/**
 *
 * @author huyhk
 */
public class NhaTroService {

    // danh sach nha tro
    ArrayList<NHATRO> list = new ArrayList<>();

    // THEM
    public void add(NHATRO nt, NguoiDungService ndService) throws Exception {

        // regex: NT + so
        if (!nt.getMaNhaTro().matches("NT\\d+")) {
            throw new Exception("Ma nha tro phai co dang NT + so");
        }

        // kiem tra trung ma
        for (NHATRO x : list) {
            if (x.getMaNhaTro().equals(nt.getMaNhaTro())) {
                throw new Exception("Ma nha tro da ton tai");
            }
        }

        // kiem tra gia phong
        if (nt.getGiaPhong() <= 0) {
            throw new Exception("Gia phong phai lon hon 0");
        }

        // kiem tra nguoi dung ton tai
        ndService.findById(nt.getMaNguoiDung());

        // them vao danh sach
        list.add(nt);
    }

    // LAY TAT CA
    public ArrayList<NHATRO> getAll() {
        return list;
    }

    // TIM THEO MA
    public NHATRO findById(String ma) throws Exception {

        for (NHATRO x : list) {
            if (x.getMaNhaTro().equals(ma)) {
                return x;
            }
        }

        throw new Exception("Khong tim thay nha tro");
    }

    // CAP NHAT
    public void update(NHATRO nt) throws Exception {

        NHATRO old = findById(nt.getMaNhaTro());

        old.setDienTich(nt.getDienTich());
        old.setGiaPhong(nt.getGiaPhong());
        old.setDiaChi(nt.getDiaChi());
        old.setQuan(nt.getQuan());
        old.setMoTa(nt.getMoTa());
        old.setNgayDangTin(nt.getNgayDangTin());
        old.setMaNguoiDung(nt.getMaNguoiDung());
    }

    // XOA
    public void delete(String ma) throws Exception {

        NHATRO nt = findById(ma);

        list.remove(nt);
    }
}
