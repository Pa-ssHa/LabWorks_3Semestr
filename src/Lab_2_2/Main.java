package Lab_2_2;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("заданное число пропусков: ");
        double passing = scan.nextDouble();
        List<Traffic> progress = new ArrayList<>();

        try (BufferedReader file_read = new BufferedReader(new FileReader("file_for_lab_2_2"))) {
            String line;
            while ((line = file_read.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String familyName = parts[0].trim();
                    double hourTime = Double.parseDouble(parts[1].trim());
                    progress.add(new Traffic(familyName, hourTime));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("+----------------------+------------------------+");
        System.out.println("|          Анализ посещаемости занятий          |");
        System.out.println("+----------------------+------------------------+");
        System.out.println("|    Фамилия           |  Пропуски занятий, час |");
        System.out.println("+----------------------+------------------------+");
        for (Traffic people : progress) {
            String peopleName = people.getFamilyName();
            String factTime = String.valueOf(people.getHourTime());

            peopleName = String.format("%-20s", peopleName);
            factTime = String.format("%-22s", factTime);

            System.out.println("| " + peopleName + " | " + factTime + " |");
            System.out.println("+----------------------+------------------------+");
        }


        System.out.println();
        System.out.println("Анализ посещаемости с учетом условий");
        System.out.println("+----------------------+------------------------+");
        System.out.println("|          Анализ посещаемости занятий          |");
        System.out.println("+----------------------+------------------------+");
        System.out.println("|    Фамилия           |  Пропуски занятий, час |");
        System.out.println("+----------------------+------------------------+");
        int k =0;
        try(BufferedWriter result = new BufferedWriter(new FileWriter("result_for_lab_2_2"))) {
            for (Traffic people : progress) {
                String peopleName = people.getFamilyName();
                String factTime = String.valueOf(people.getHourTime());
                if (passing >= people.getHourTime()) {
                    k ++;
                    peopleName = String.format("%-20s", peopleName);
                    factTime = String.format("%-22s", factTime);
                    System.out.println("| " + peopleName + " | " + factTime + " |");
                    System.out.println("+----------------------+------------------------+");
                    String date = people.getFamilyName() + ", "+ people.getHourTime();
                    result.write(date);
                    result.newLine();
                }
            }
            if( k==0) {
                System.out.println("|       Студентов с " + k + " пропусками нету           |");
                System.out.println("+----------------------+------------------------+");
                result.write("Таких студентов нет");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}


