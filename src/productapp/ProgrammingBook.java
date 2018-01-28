/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productapp;

/**
 * Класс, описывающий книгу по программиированию
 *
 * @author sbt-sosnina-tp
 */
 class ProgrammingBook extends Book {

    // #################### FIELDS ####################
    /**
     * язык программирования у книг по программированию
     */
    protected String programmingLanguage;

    // #################### CONSTRUCTORS ####################
    ProgrammingBook() {
    }

    /**
     * Конструктор книги по прогаммированию с параметрами
     *
     * @param programmingLanguage язык
     * @param pageCount число страниц
     * @param name название
     * @param price цена
     * @param barcode штрих-код
     */
    ProgrammingBook(String programmingLanguage, int pageCount, String name, int price, String barcode) {
        super(pageCount, name, price, barcode);
        this.programmingLanguage = programmingLanguage;
        this.weight += 1;
    }

    // #################### GETTERS and SETTERS ####################
     String getProgrammingLanguage() {
        return programmingLanguage;
    }

     void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    // #################### METHODS ####################

    // #################### to String ####################
    /**
     * Метод приведения книги по программированию к строке
     *
     * @return toString родителя и язык программирования
     */
    @Override
    public String toString() {
        return super.toString() + ", " + "язык программирования: " + programmingLanguage;
    }
}
