import model.SingleLine;
import org.junit.jupiter.api.Test;
import services.InheritenceService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private static String filePath = "D:\\code-quality-checker-for-inheritence\\src\\test.txt";

    @Test
    void calc_Complexity_From_Inheritence() {

        assertEquals(1912,calculateTotalInheritence());

    }
    private int calculateTotalInheritence() {
        List<SingleLine> inList = readFile();
        List<SingleLine> outList;
        InheritenceService service = new InheritenceService();
        int total = 0;

        outList = service.calculateComplexityDueToInheritenceStructures(inList);

        for(int x=0 ; x < outList.size() ; x++) {
            total += outList.get(x).getCi();
        }
        return total;

    }




    public List<SingleLine> readFile() {

        //to hold the current line number that reads
        int Lineindex = 0;

        ArrayList<SingleLine> list = new ArrayList<SingleLine>();


        try {

            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line = reader.readLine();

            while (line != null) {
                Lineindex++;

                SingleLine obj = new SingleLine();

                line = reader.readLine();
                obj.setStatement(line+" ");
                obj.setLineNumber(Lineindex);
                list.add(obj);
            }



            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

}