package Lab_1_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("Реализация через абстрактный класс:");
        List<PerdeviceA> dev = new ArrayList<>();
        dev.add(new MouseA(5000, "hp", 2, true));
        dev.add(new MouseA(2200, "asus", 1.5, false));
        dev.add(new MouseA(3000, "samsung", 0.5, true));
        dev.add(new MouseA(700, "acer", 5, true));
        dev.add(new MouseA(500, "huawei", 0, true));
        dev.add(new ScreenA(25000, "LG", 50));
        dev.add(new ScreenA(15000, "samsung", 25));
        dev.add(new ScreenA(17000, "hp", 23));
        dev.add(new ScreenA(10000, "huawei", 15));
        dev.add(new ScreenA(12000, "asus", 24));

        double allPriceScreen = 0;
        double allPriceMouse = 0;
        int allScreen = 0;
        for (PerdeviceA device : dev) {
            if (device instanceof MouseA mouse) {
                System.out.println(mouse.getInfo());
                allPriceMouse += mouse.getPrice();
            } else if (device instanceof ScreenA screen) {
                System.out.println(screen.getInfo());
                allPriceScreen += screen.getPrice();
                allScreen++;
            }
            System.out.println();
        }
        System.out.println("Общая стоимость партии мониторов: " + allPriceScreen);
        System.out.println("Общая стоимость партии мышек: " + allPriceMouse);
        System.out.println("Количество мониторов в партии " + allScreen);
    }
}
