/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package View;

import Models.Student;
import Models.StudentType;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author huyhk
 */
public class LAB3_BAI4_MOB1024_SD2001_TV00385 {

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
    }
}
