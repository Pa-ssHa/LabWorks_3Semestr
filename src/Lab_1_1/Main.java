package Lab_1_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Реализация через обычный класс:");
        List<Perdevice> dev = new ArrayList<>();
        dev.add(new Mouse(5000, "hp", 2, true));
        dev.add(new Mouse(2200, "asus", 1.5, false));
        dev.add(new Mouse(3000, "samsung", 0.5, true));
        dev.add(new Mouse(700, "acer", 5, true));
        dev.add(new Mouse(500, "huawei", 0, true));
        dev.add(new Screen(25000, "LG", 50));
        dev.add(new Screen(15000, "samsung", 25));
        dev.add(new Screen(17000, "hp", 23));
        dev.add(new Screen(10000, "huawei", 15));
        dev.add(new Screen(12000, "asus", 24));

        double allPriceScreen = 0;
        double allPriceMouse = 0;
        int allScreen = 0;
        for (Perdevice device : dev) {
            if (device instanceof Mouse mouse) {
                System.out.println(mouse.toString());
                allPriceMouse += mouse.getPrice();
            } else if (device instanceof Screen screen) {
                System.out.println(screen.toString());
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