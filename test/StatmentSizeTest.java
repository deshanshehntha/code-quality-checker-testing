import model.SingleLine;
import org.junit.jupiter.api.Test;
import services.InheritenceService;
import services.StatmentSizeService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StatmentSizeTest {


    //create test classses and call your services like below,
    //i added all the services please add the missing ones, remove the annotations and loggers
    //copy this class and add your services

    private static String filePath = "D:\\code-quality-checker-for-inheritence\\src\\test.txt";

    @Test
    void calc_Complexity_From_StatmentSize() {

        assertEquals(1912,calculateStamentSize());

    }
    private int calculateStamentSize() {
        List<SingleLine> inList = readFile();
        List<SingleLine> outList;
        StatmentSizeService service = new StatmentSizeService();
        int total = 0;

        try {
			outList = service.calculateComplexityDueToStatmentSize(inList);
			for(int x=0 ; x < outList.size() ; x++) {
	            total += outList.get(x).getCi();
	        }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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