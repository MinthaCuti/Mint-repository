/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huyhk
 */
public class EmployeeService {

    private List<Employee> list = new ArrayList<>();

    public void add(Employee e) {
        list.add(e);
    }

    public void display() {

        if (list.isEmpty()) {
            System.out.println("Danh sach rong");
            return;
        }

        for (Employee e : list) {
            System.out.println(e);
        }
    }

    public Employee findById(String id) {

        for (Employee e : list) {
            if (e.getId().equalsIgnoreCase(id)) {
                return e;
            }
        }

        return null;
    }

    public void updateSalary(String id, double newSalary) {

        Employee e = findById(id);

        if (e != null) {
            e.setSalary(newSalary);
            System.out.println("Cap nhat thanh cong");
        } else {
            System.out.println("Khong tim thay nhan vien");
        }
    }
}
