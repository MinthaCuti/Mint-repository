/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

/**
 *
 * @author acer
 */
import Connect.DBConnect;
import Entity.Employee;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    // Lấy toàn bộ danh sách
    public List<Employee> getAll() {
        String sql = "SELECT id, name, salary FROM employee";
        List<Employee> list = new ArrayList<>();
        try (Connection conn = DBConnect.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(new Employee(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // Bài 3: Thêm nhân viên
    public boolean add(Employee emp) {
        String sql = "INSERT INTO employee (name, salary) VALUES (?, ?)";
        try (Connection conn = DBConnect.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, emp.getName());
            ps.setDouble(2, emp.getSalary());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Bài 3: Cập nhật nhân viên
    public boolean update(Employee emp) {
        String sql = "UPDATE employee SET name = ?, salary = ? WHERE id = ?";
        try (Connection conn = DBConnect.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, emp.getName());
            ps.setDouble(2, emp.getSalary());
            ps.setInt(3, emp.getId());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Bài 3: Xóa nhân viên
    public boolean delete(int id) {
        String sql = "DELETE FROM employee WHERE id = ?";
        try (Connection conn = DBConnect.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Bài 4: Tìm kiếm theo mã (ID)
    public Employee findById(int id) {
        String sql = "SELECT id, name, salary FROM employee WHERE id = ?";
        try (Connection conn = DBConnect.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Employee(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
