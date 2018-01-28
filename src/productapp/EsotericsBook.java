/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productapp;

/**
 * Класс, описывающий книгу по эзотерике
 *
 * @author sbt-sosnina-tp
 */
 class EsotericsBook extends Book {

    // #################### FIELDS ####################
    /**
     * минимальный возраст читателя у книг по эзотерике
     */
    protected int minAge;

    // #################### CONSTRUCTORS ####################
     EsotericsBook() {
    }

    /**
     * Конструктор книги по эзотерике с параметрами
     *
     * @param minAge минимальный возраст читателя у книг по эзотерике
     * @param pageCount чмсло страниц
     * @param name название
     * @param price цена
     * @param barcode штрих-код
     */
     EsotericsBook(int minAge, int pageCount, String name, int price, String barcode) {
        super(pageCount, name, price, barcode);
        this.minAge = minAge;
        this.weight += 3;

    }

    // #################### GETTERS and SETTERS ####################
     int getMinAge() {
        return minAge;
    }

     void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    // #################### METHODS ####################
    
    // #################### to String ####################
    /**
     * Метод приведения книги по эзотерике к строке
     *
     * @return toString родителя и минимальный возраст читателя
     */
    @Override
    public String toString() {
        return super.toString() + ", " + "минимальный возраст читателя: " + minAge;
    }
}
