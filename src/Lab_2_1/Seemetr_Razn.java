package Lab_2_1;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Seemetr_Razn {

    public static Set<Integer> readNumbersFromFile(String filename) {
        Set<Integer> numbers = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                numbers.add(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }

    public static Set<Integer> findSeemetr_Razn(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        Set<Integer> reserveSet = new HashSet<>(set1);
        reserveSet.retainAll(set2);
        result.removeAll(reserveSet);
        return result;
    }

    public static void displayResult(Set<Integer> result) {
        System.out.println("Симметрическая разность: " + result);
    }

    public static void saveResultToFile(String filename, Set<Integer> result) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Integer number : result) {
                writer.write(number.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Ошибка при записи файла: " + e.getMessage());
        }
    }
}
