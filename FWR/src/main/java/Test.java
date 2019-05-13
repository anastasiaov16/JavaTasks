import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) throws Exception{
        FileWriter nFile = new FileWriter("input.txt");
        nFile.write("Хокку \nПодобен лучу самурайский клинок \nИ тот затупился \nПроклятая килька в томате!!");
        nFile.close();

        FileReader nReader = new FileReader("input.txt");
        Scanner sc = new Scanner(nReader);

        int i = 0;
        while (sc.hasNextLine()){
            System.out.println(i + ":" + sc.nextLine());
            i++;
        }

        nReader.close();
    }
}
