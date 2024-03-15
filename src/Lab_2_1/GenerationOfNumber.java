package Lab_2_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerationOfNumber {
    public static void main(String[] args) {

        String myfile1 = "file_1.txt";
        String myfile2 = "file_2.txt";

        GenerationNumberRandom(myfile1,10);
        GenerationNumberRandom(myfile2,10);
    }
    public static void GenerationNumberRandom(String file, int volumNumber){
        File myfile = new File(file);

        try{
            FileWriter writer = new FileWriter(myfile);
            Random rand = new Random();
            for( int i = 0; i< volumNumber; i++){
                int Numb = rand.nextInt(10);
                writer.write((Numb) +"\n");
            }
            writer.close();
            System.out.println("Запись завершена");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
