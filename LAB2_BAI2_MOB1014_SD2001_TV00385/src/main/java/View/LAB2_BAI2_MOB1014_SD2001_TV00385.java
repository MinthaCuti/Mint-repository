/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package View;

import Service.ProductService;

/**
 *
 * @author huyhk
 */
public class LAB2_BAI2_MOB1014_SD2001_TV00385 {

    public static void main(String[] args) {
        ProductService service = new ProductService();

        service.initData();

        System.out.println("Danh sach san pham:");
        service.display();

        service.statistic();
    }
}
