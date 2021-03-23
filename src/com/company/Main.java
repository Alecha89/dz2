package com.company;
public class Main {

    public static void main(String[] args) {
        //--------------------------------------
        int yearOfBirthday = 1989;
        int monthOfBirthday = 03;
        int dayOfBirthday = 15;
        //--------------------------------------
        int sum = (yearOfBirthday + monthOfBirthday + dayOfBirthday);
        //--------------------------------------
        boolean monthBiggerDay = (monthOfBirthday > dayOfBirthday);
        //--------------------------------------
        char name[] = {'Л','е','ш','а'};
        String myStr = new String(name);
        //--------------------------------------
        double myAge = 32;
        double partYear = 3.0 / 12.0;
        double sumAge = myAge + partYear;
        //----------вывод результатов
        System.out.println("Сумма моего года, месяца и дня рождения: "+sum);
        System.out.println("Месяц моего рождения больше даты рождения: "+monthBiggerDay);
        System.out.println("Массив с моим именем: "+ myStr);
        System.out.println("Мне "+ sumAge + " лет");
    }
}
