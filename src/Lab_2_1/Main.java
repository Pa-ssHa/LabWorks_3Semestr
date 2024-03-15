package Lab_2_1;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = Seemetr_Razn.readNumbersFromFile("file_1.txt");
        Set<Integer> set2 = Seemetr_Razn.readNumbersFromFile("file_2.txt");
        Set<Integer> SetResult = Seemetr_Razn.findSeemetr_Razn(set1, set2);
        Seemetr_Razn.displayResult(SetResult);
        Seemetr_Razn.saveResultToFile("file_result.txt", SetResult);
    }
}
