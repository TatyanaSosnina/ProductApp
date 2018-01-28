/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productapp;

/**
 * Класс, описывающий товар магазина
 *
 * @author sbt-sosnina-tp
 */
 abstract class Product {

    // #################### FIELDS ####################
    /**
     * название товара
     */
    protected String name;
    /**
     * цена товара
     */
    protected double price;
    /**
     * штрих-код товара
     */
    protected String barcode;
    /**
     * вес для сортировки
     */
    protected int weight;

    // #################### CONSTRUCTORS ####################
     Product() {
    }

    /**
     * Конструктор товара с параметрами
     *
     * @param name название товара
     * @param price цена товара
     * @param barcode штрих-код товара
     */
     Product(String name, int price, String barcode) {
        this.name = name;
        this.price = price;
        this.barcode = barcode;
    }

    // #################### GETTERS and SETTERS ####################
     String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

     double getPrice() {
        return price;
    }

     void setPrice(int price) {
        this.price = price;
    }

     String getBarcode() {
        return barcode;
    }

     void setBarcode(String barcode) {
        this.barcode = barcode;
    }

     int getWeight() {
        return weight;
    }

    // #################### METHODS ####################
   
    // #################### to String ####################
    /**
     * Метод приведения товара магазина к строке
     *
     * @return описание товара магазина
     */
    @Override
    public String toString() {
        //return "класс: " + this.getClass().getSimpleName() + ", " + "название: " + name + ", цена: " + price + ", штрих-код: " + barcode;
        return "класс: " + this.getClass().getSimpleName() + ", " + "название: " + name
                + ", цена: " + price + ", штрих-код: " + barcode + ", " + "вес группировки: " + weight;
    }

}
