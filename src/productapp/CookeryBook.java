/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productapp;

/**
 * Класс, описывающий книгу по кулинарии
 *
 * @author sbt-sosnina-tp
 */
 class CookeryBook extends Book {

    // #################### FIELDS ####################
    /**
     * основной ингридиент у книг по кулинарии
     */
    protected String mainIngridient;

    // #################### CONSTRUCTORS ####################
     CookeryBook() {
    }

    /**
     * Конструктор книги по кулинарии с параметрами
     *
     * @param mainIngridient основной ингридиент
     * @param pageCount число страниц
     * @param name название
     * @param price цена
     * @param barcode штрих-код
     */
     CookeryBook(String mainIngridient, int pageCount, String name, int price, String barcode) {
        super(pageCount, name, price, barcode);
        this.mainIngridient = mainIngridient;
        this.weight += 2;
    }

    // #################### GETTERS and SETTERS ####################
     String getMainIngridient() {
        return mainIngridient;
    }

     void setMainIngridient(String mainIngridient) {
        this.mainIngridient = mainIngridient;
    }

    // #################### METHODS ####################

    // #################### to String ####################
    /**
     * Метод приведения книги по кулинарии к строке
     *
     * @return toString родителя и основной ингридиент
     */
    @Override
    public String toString() {
        return super.toString() + ", " + "основной ингридиент: " + mainIngridient;
    }
}
