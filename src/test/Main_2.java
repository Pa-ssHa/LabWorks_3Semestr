package test;

import java.util.Scanner;

public class Main_2{
    static int amount = 11;

    public static void main(String[] args) {
        System.out.println("Задание 1");
        appliances[] texnika = new appliances[amount];
        texnika[0] = new Washer("F2V34520", "Samsung", 28000, 6, 2006, 7, 29, 3000);
        texnika[1] = new Washer("Bubbles3000", "IdeaProduction", 30000, 9, 2011, 7, 22, 3000);
        texnika[2] = new Refregenerator("RB-33 J1201SA", "Samsung", 39000,  2008, 7, 21, 5000);
        texnika[3] = new Washer("BV-4358JH", "Samsung", 28000, 6, 2006, 7, 29, 3000);
        texnika[4] = new Washer("Clean&Fresh", "Panasonic", 32000, 6, 2010, 4, 8, 3000);
        texnika[5] = new Refregenerator("RL-58 H6020DA", "Samsung", 39000, 2008, 7, 21, 5000);
        texnika[6] = new Refregenerator("Rmod32 comfort+", "Полюс", 35000, 2010, 5, 24, 5000);
        texnika[7] = new Refregenerator("RN-21 K5433YU", "TEKA", 24000,  2006, 3, 22, 5000);
        texnika[8] = new Washer("CST G2701", "Candy", 21500, 6, 2006, 7, 29, 3000);
        texnika[9] = new Washer("MSD 615", "Indesit", 15000, 6, 2004, 2, 13, 3000);
        texnika[10] = new Refregenerator("GA 71234", "LG", 50000, 2012, 2, 20, 5000);
        Task(texnika);
    }

    private static void Task(appliances[] texnika) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean Flag = false;
            int number = 0;
            String peremen;
            double biggest_V = 0;
            Washer stirka;
            System.out.println("Введите нужного производителя");
            peremen = scanner.nextLine();
            for (int i = 0; i < amount; i++) {
                if ((texnika[i].getCompany().equalsIgnoreCase(peremen))) {
                    System.out.println(texnika[i].toString());
                    System.out.println();
                    Flag = true;
                }
                if (texnika[i] instanceof Washer){
                    stirka = (Washer)texnika[i];
                    if (stirka.getCapacity() > biggest_V){
                        biggest_V = stirka.getCapacity();
                        number = i;
                    }
                }
            }
            if (!Flag) {
                System.out.println("Такой производитель не найден");
            }
            if (biggest_V == 0) {
                System.out.println("Стиральные машины отсутствуют");
            } else {
                System.out.println("Наибольший объем барабана равен = " + biggest_V + "  у следующего товара: " + texnika[number].toString());
            }
        }
    }
}

