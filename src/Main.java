
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    private static String filePath = "D:\\code-quality-checker-for-inheritence\\src\\test.txt";

    public static void main(String[] args) {

        BufferedReader reader;

        int lineCount = 0;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
//                MeasureInheritence.calc_Complexity_From_Inheritence(line.toString(), "Java");
                ++lineCount;
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
