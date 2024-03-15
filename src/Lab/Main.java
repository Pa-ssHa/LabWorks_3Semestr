package Lab;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение A: ");
        double A = scanner.nextDouble();
        System.out.print("Введите значение B: ");
        double B = scanner.nextDouble();
        scanner.close();

        String fileName = "file_1.txt";

        HashMap<String, Integer> CountNumber = new HashMap<>();
        CountNumber.put("(-∞ ; A)", 0);
        CountNumber.put("[A ; B]", 0);
        CountNumber.put("(B ; +∞)", 0);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                double number = Double.parseDouble(line);

                if (number < A) {
                    CountNumber.put("(-∞ ; A)", CountNumber.get("(-∞ ; A)") + 1);
                } else if (number >= A && number <= B) {
                    CountNumber.put("[A ; B]", CountNumber.get("[A ; B]") + 1);
                } else {
                    CountNumber.put("(B ; +∞)", CountNumber.get("(B ; +∞)") + 1);
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        for (String interval : CountNumber.keySet()) {
            System.out.println(interval + ": " + CountNumber.get(interval));
        }

        try {
            FileWriter writer = new FileWriter("result.txt");

            for (String interval : CountNumber.keySet()) {
                writer.write(interval + ": " + CountNumber.get(interval) + "\n");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
