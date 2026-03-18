/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author huyhk
 */
public class EmployeeServices {

    ArrayList<Employee> list = new ArrayList<>();

    public void add(Employee e) {
        list.add(e);
    }

    public ArrayList<Employee> getAll() {

        return list;

    }

    public void filterSalary() {
        list.stream()
                .filter(e -> e.getSalary() >= 15_000_000)
                .forEach(System.out::println);
    }

    public void sortSalaryDesc() {
        list.stream()
                .sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary()))
                .forEach(System.out::println);
    }

    public List<String> getAllNames() {
        return list.stream()
                .map(e -> e.getName())
                .collect(Collectors.toList());

    }

    public long countNameStartWithA() {
        return list.stream()
                .filter(e -> e.getName().toLowerCase().startsWith("a"))
                .count();
    }
}
