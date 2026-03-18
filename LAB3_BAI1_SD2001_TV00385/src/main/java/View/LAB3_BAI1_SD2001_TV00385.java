/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package View;

import java.util.ArrayList;

/**
 *
 * @author huyhk
 */
public class LAB3_BAI1_SD2001_TV00385 {

    public static void main(String[] args) {
        ArrayList<String> Names = new ArrayList<>();
        Names.add("Long");
        Names.add("Nam");
        Names.add("Tri");
        Names.add("Huy");
        Names.add("Ngoc Huyen");
        Names.add("Quy");
        Names.add("Quang");
        Names.add("Bao Khoa");
        Names.add("Anh Khoa");
        Names.add("Dieu Linh");
        
        System.out.println("=== Danh sach ban dau ===");
        Names.forEach(nm -> {
            System.out.println(nm);
        });
        
        System.out.println("\n=== Ten co do dai > 5 ===");
        Names.stream()
                .filter(nm -> nm.length() > 5)
                .forEach(nm -> System.out.println(nm));
        
         System.out.println("\n=== Sap xep A-Z ===");
        Names.stream()
                .sorted((a, b) -> a.compareTo(b))
                .forEach(nm -> System.out.println(nm));
        
        System.out.println("\n=== Sap xep theo do dai tang dan ===");
        Names.stream()
                .sorted((a, b) -> a.length() - b.length())
                .forEach(nm -> System.out.println(nm));
    }
}
