/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productapp;

/**
 * Класс, описывающий книгу
 *
 * @author sbt-sosnina-tp
 */
 class Book extends Product {

    // #################### FIELDS ####################
    /**
     * число страниц у книг
     */
    protected int pageCount;

    // #################### CONSTRUCTORS ####################
     Book() {
    }

    /**
     * Конструктор книги с параметрами
     *
     * @param pageCount число страниц
     * @param name название
     * @param price цена
     * @param barcode штрих-код
     */
     Book(int pageCount, String name, int price, String barcode) {
        super(name, price, barcode);
        this.pageCount = pageCount;
        this.weight = 10;
    }

    // #################### GETTERS and SETTERS ####################
     int getCount() {
        return pageCount;
    }

     void setCount(int count) {
        this.pageCount = count;
    }

    // #################### IMPLEMET METHODS of Product ####################
    // #################### to String ####################
    /**
     * Метод приведения книги к строке
     *
     * @return toString родителя и кол-во страниц
     */
    @Override
    public String toString() {
        return super.toString() + ", " + "количество страниц: " + pageCount;
    }

}
