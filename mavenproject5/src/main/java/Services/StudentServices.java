/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.Student;
import Models.StudentType;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author huyhk
 */
public class StudentServices {

    // 1. Đếm số SV theo từng loại
    public Map<StudentType, Long> countByType(List<Student> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                        Student::getType,
                        Collectors.counting()
                ));
    }

    // 2. GPA trung bình theo từng loại
    public Map<StudentType, Double> avgGpaByType(List<Student> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                        Student::getType,
                        Collectors.averagingDouble(Student::getGpa)
                ));
    }

    // 3. Loại SV có GPA TB cao nhất
    public StudentType maxAvgGpaType(List<Student> list) {
        return avgGpaByType(list).entrySet()
                .stream()
                .max((a, b) -> Double.compare(a.getValue(), b.getValue()))
                .map(Map.Entry::getKey)
                .orElse(null);
    }

}
