/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package View;

import Models.Student;
import Models.StudentType;
import Services.StudentServices;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author huyhk
 */
public class Mavenproject5 {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("S1", "An", StudentType.REGULAR, 3.0));
        list.add(new Student("S2", "Binh", StudentType.PART_TIME, 2.8));
        list.add(new Student("S3", "Cuong", StudentType.INTERNATIONAL, 3.5));
        list.add(new Student("S4", "Dung", StudentType.REGULAR, 3.2));
        list.add(new Student("S5", "Huy", StudentType.INTERNATIONAL, 3.6));
        list.add(new Student("S6", "Khanh", StudentType.PART_TIME, 2.9));
        list.add(new Student("S7", "Long", StudentType.INTERNATIONAL, 3.1));
        list.add(new Student("S8", "Minh", StudentType.REGULAR, 3.8));
        list.add(new Student("S9", "Nam", StudentType.PART_TIME, 3.0));
        list.add(new Student("S10", "Phuong", StudentType.INTERNATIONAL, 3.3));

        // =============================
        System.out.println("\n=== INTERNATIONAL GPA >= 3.2 ===");
        list.stream()
                .filter(s -> s.getType() == StudentType.INTERNATIONAL && s.getGpa() >= 3.2)
                .forEach(System.out::println);

        // =============================
        System.out.println("\n=== TOP 3 GPA ===");
        list.stream()
                .sorted((a, b) -> Double.compare(b.getGpa(), a.getGpa()))
                .limit(3)
                .forEach(System.out::println);

        // =============================
        System.out.println("\n=== TEN PART_TIME ===");
        List<String> names = list.stream()
                .filter(s -> s.getType() == StudentType.PART_TIME)
                .map(s -> s.getName())
                .collect(Collectors.toList());

        names.forEach(System.out::println);

        StudentServices service = new StudentServices();

        // 1. Đếm
        System.out.println("\n=== SO LUONG ===");
        Map<StudentType, Long> countMap = service.countByType(list);
        countMap.forEach((k, v) -> System.out.println(k + ": " + v));

        // 2. GPA TB
        System.out.println("\n=== GPA TRUNG BINH ===");
        Map<StudentType, Double> avgMap = service.avgGpaByType(list);
        avgMap.forEach((k, v) -> System.out.println(k + ": " + v));

        // 3. Max
        System.out.println("\n=== TYPE GPA CAO NHAT ===");
        System.out.println(service.maxAvgGpaType(list));
    }
}
