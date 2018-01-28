/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productapp;

/**
 * Класс, описывающий диск
 *
 * @author sbt-sosnina-tp
 */
 class Disk extends Product {

    // #################### FIELDS ####################
    /**
     * Тип диска CD и DVD
     */
    protected DiskType diskType;
    /**
     * Содержимое диска
     */
    protected DiskContentType diskContentType;

    // #################### CONSTRUCTORS ####################
    Disk() {
    }

    /**
     * Конструктор диска с параметрами
     *
     * @param diskType тип диска
     * @param diskContentType тип содержимого диска
     * @param name название
     * @param price цена
     * @param barcode штрих-код
     */
    Disk(DiskType diskType, DiskContentType diskContentType, String name, int price, String barcode) {
        super(name, price, barcode);
        this.diskType = diskType;
        this.diskContentType = diskContentType;
        this.weight = (diskType == DiskType.CD ? 20 : 30);
        this.weight += (diskContentType == DiskContentType.Music ? 1 : (diskContentType == DiskContentType.Video ? 2 : 3));
    }

    // #################### GETTERS and SETTERS ####################
     DiskType getDiskType() {
        return diskType;
    }

     void setDiskType(DiskType diskType) {
        this.diskType = diskType;
    }

     DiskContentType getDiskContentType() {
        return diskContentType;
    }

     void setDiskContentType(DiskContentType diskContentType) {
        this.diskContentType = diskContentType;
    }

    // #################### METHODS ####################
    // #################### to String ####################
    /**
     * Метод приведения диска к строке
     *
     * @return toString родителя и тип и содержимое диска
     */
    @Override
    public String toString() {
        return super.toString() + ", " + "тип диска: " + diskType + ", " + "содержимое диска: " + diskContentType;
    }

}
