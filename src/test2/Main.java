package test2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Double> stack = new Stack<> ();
        BufferedReader input = null;
        double min = 0;
        try {

            input = new BufferedReader(new FileReader("file_for_test.txt"));
            String s;
            double item;
            FileWriter output = new FileWriter("file_for_test1.txt");
            output.write("Отрицательные числа, записанные в стек:\n");
            System.out.println("Отрицательные числа, записанные в стек:\n");
            while((s = input.readLine()) != null) {
                if (!s.trim().isEmpty()) {
                    if ((item = Double.parseDouble(s)) < 0) {
                        stack.push(item);
                        output.write(s + "\n");
                        System.out.println(item);
                        if (item < min) {
                            min = item;
                        }
                    }
                }
            }
            System.out.println("Минимальное число из стека:");
            output.write("Минимальное число из стека:\n");
            System.out.println(min);
            output.write(min + "\n");
            output.close();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            input.close();
        }
    }
}


