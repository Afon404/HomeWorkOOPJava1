package org.example;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
//и реализовать перегруженный метод getProduct(int name, int volume, int temperature),
//выдающий продукт соответствующий имени, объёму и температуре
//В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
//и воспроизвести логику, заложенную в программе
//Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре


public class Main {
    public static void main(String[] args) {


        System.out.println("--------- ПОИСК ГОРЯЧИХ НАПИТКОВ ---------");
        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Coffee", new BigDecimal(200), 0.5, 90),
                new HotDrinks("Tea", new BigDecimal(100), 0.5, 80),
                new HotDrinks("Milk", new BigDecimal(150), 1.0, 50)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println( vmHotDrinks.getProduct("Coffee"));
        System.out.println( vmHotDrinks.getProduct(new BigDecimal(2.5)));
        System.out.println(vmHotDrinks.getProduct(70));
        System.out.println( vmHotDrinks.getProduct("Tea"));
    }


}