package com.javarush.task.pro.task10.task1002;

/* 
Построим новый жилой комплекс JavaRush Towers
*/

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";
    public int floors;
    public String builder;

    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }
    public Skyscraper(int floors) {
        this.floors = floors;
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + this.floors);
    }
    public Skyscraper(String builder) {
        this.builder = builder;
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + this.builder);
    }


    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}

