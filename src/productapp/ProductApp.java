/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ввод данных и отображение сгруппированных данных в консоль
 * @author sbt-sosnina-tp
 */
 class ProductApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        String barcode = "111-222-";
        int price = 10, pageCount = 100;
        for (int n = 3, j = 0, i = 0; i < n; i++) {
            productList.add(new Disk(DiskType.DVD, DiskContentType.Music, "Музыкальный диск " + j++, price + j++, barcode + j++)); //
            productList.add(new EsotericsBook(1 + j++, pageCount + j++, "Книга по эзотерике " + j++, price + j++, barcode + j++));
            productList.add(new Disk(DiskType.CD, DiskContentType.Video, "Видео диск " + j++, price + j++, barcode + j++));
            productList.add(new ProgrammingBook("Язык программирования " + j++, pageCount + j++, "Книга по программированию " + j++, price + j++, barcode + j++));
            productList.add(new Disk(DiskType.CD, DiskContentType.Music, "Музыкальный диск " + j++, price + j++, barcode + j++));
            productList.add(new Disk(DiskType.CD, DiskContentType.PO, "Диск с ПО " + j++, price + j++, barcode + j++));
            productList.add(new CookeryBook("Основной ингридиент " + j++, pageCount + j++, "Книга по кулинарии " + j++, price + j++, barcode + j++));
            productList.add(new Disk(DiskType.DVD, DiskContentType.Video, "Видео диск " + j++, price + j++, barcode + j++));
            productList.add(new Disk(DiskType.DVD, DiskContentType.PO, "Диск с ПО " + j++, price + j++, barcode + j++));
        }

//  ################### вариант  1 сортировка Java 8 можно использовать ссылку на метод для компаратора:  ###################
    productList.sort(Comparator.comparing(Product::getWeight));

////  ################### вариант 2 сортировка --->> ###################:
//    Collections.sort(productList, new Comparator<Product>() {
//    @Override
//    public int compare(Product o1, Product o2) {
//        return o1.getWeight() - (o2.getWeight());
//    }
//});
////  ################### <<--- вариант 2 сортировка  ###################:


        for (Product product : productList) {
            System.out.println(product.toString());
        }


////      ################### вариант 3 группировка вывода на консоль --->> #####################
//        List<String> categoryList = Arrays.asList("Book", "Disk");
//        List<String> bookTypeList = Arrays.asList("ProgrammingBook", "CookeryBook", "EsotericsBook");
//
//        System.out.println("Products: ");
//        for (String category : categoryList) {
//            System.out.println(category + ": ");
//            if (category.equals("Book")) {
//                for (String bookType : bookTypeList) {
//                    System.out.println(bookType + ": ");
//                    for (Product product : productList) {
//                        if (product.getClass().getName().endsWith(bookType)) {
//                            System.out.println(product.toString());
//                        }
//                    }
//                }
//            }
//
//            if (category.equals("Disk")) {
//                for (DiskType diskType : DiskType.values()) {
//                    System.out.println(diskType + ": ");
//                    for (DiskContentType diskContentType : DiskContentType.values()) {
//                        System.out.println(diskContentType + ": ");
//                        for (Product product : productList) {
//                            if (product.getClass().getName().endsWith(category)
//                                    && ((Disk) product).diskContentType == diskContentType
//                                    && ((Disk) product).diskType == diskType) {
//                                System.out.println(product.toString());
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
////      ################### <<--- вариант 3 группировка вывода на консоль#####################

        
    }
}
