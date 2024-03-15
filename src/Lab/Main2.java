package Lab;

import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Задайте название услуги: ");
        String NameService = scan.nextLine();
        System.out.print("Задайте объем потребления услуги: ");
        double VolumeService = scan.nextDouble();
        List<Service> ListPrices = new ArrayList<>();

        try (BufferedReader file_read = new BufferedReader(new FileReader("file_for_Main2"))) {
            String line;
            while ((line = file_read.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String serviceName = parts[0].trim();
                    double price = Double.parseDouble(parts[1].trim());
                    ListPrices.add(new Service(serviceName, price));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Вывод таблицы цен за ЖКХ
        System.out.println("+----------------------+--------------------------+");
        System.out.println("|          Анализ цен за ЖКХ                      |");
        System.out.println("+----------------------+--------------------------+");
        System.out.println("|    Услуга            |Тариф (цена за 1 ед.),руб.|");
        System.out.println("+----------------------+--------------------------+");
        for (Service service : ListPrices) {
            String serviceName = service.getName();
            String price = String.format("%.2f", service.getPrice());

            serviceName = String.format("%-20s", serviceName);
            price = String.format("%-24s", price);

            System.out.println("| " + serviceName + " | " + price + " |");
            System.out.println("+----------------------+--------------------------+");
        }

        int k =0;
        double AllCost = 0;
        String result = null;
        for (Service service : ListPrices) {
            if (service.getName().equals(NameService)) {
                AllCost = service.getPrice() * VolumeService;
                result = "Стоимость " + NameService + " для объема " + VolumeService + " составляет " + AllCost + " руб.";
                System.out.println();
                System.out.println(result);
                k++;
                break;
            }
        }
        if (k!=0) {
            try (BufferedWriter resultFile = new BufferedWriter(new FileWriter("result2.txt"))) {
                resultFile.write(result);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else
            System.out.println("Такой услуги нет");
    }
}