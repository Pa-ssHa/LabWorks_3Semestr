package Lab_1_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("Реализация через интерфейс:");
        List<PerdeviceI> dev = new ArrayList<>();
        dev.add(new MouseI(5000, "hp", 2, true));
        dev.add(new MouseI(2200, "asus", 1.5, false));
        dev.add(new MouseI(3000, "samsung", 0.5, true));
        dev.add(new MouseI(700, "acer", 5, true));
        dev.add(new MouseI(500, "huawei", 0, true));
        dev.add(new ScreenI(25000, "LG", 50));
        dev.add(new ScreenI(15000, "samsung", 25));
        dev.add(new ScreenI(17000, "hp", 23));
        dev.add(new ScreenI(10000, "huawei", 15));
        dev.add(new ScreenI(12000, "asus", 24));

        double allPriceScreen = 0;
        double allPriceMouse = 0;
        int allScreen = 0;
        for (PerdeviceI device : dev) {
            if (device instanceof MouseI mouse) {
                System.out.println(mouse.getInfo());
                allPriceMouse += mouse.getPrice();
            } else if (device instanceof ScreenI screen) {
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
