package test.transferobject.sales;

import org.junit.Test;

import java.io.*;

/**
 * Created by User on 10/16/2016.
 */
public class SalesObjectTest {

    private String usaSample = "Automotive\tChemical Guys MIC_493 Chenille Microfiber Premium Scratch-Free Wash Mitt\tB003TTL0TE\tOctober 15, 2016\txm2\tdealmcomapp-20\tN/A\t0\t22\t0\t22";

    @Test
    public void testReadData(){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File("C:\\Users\\User\\IdeaProjects\\DealMoonDailyReportAutomation\\sampledata\\report (4)(1).txt")));
            System.out.println(reader.readLine());
            String string1 = (reader.readLine());
            String string2 = (reader.readLine());
            String string3 = usaSample;
            System.out.println(string2);
            String[] stringArray = string1.split("[\t]");
            String[] stringArray2 = usaSample.split("[\t]");
//            SalesObject salesObject = salesObject = new SalesObject(ProductLineEnum.getEnum(stringArray2[0]),stringArray2[1],stringArray2[2],stringArray2[3],stringArray2[4],stringArray2[5],stringArray2[6],stringArray2[7],stringArray2[8],stringArray2[9],stringArray2[10]);
//            System.out.println("length : " + stringArray.length);

//            System.out.println(salesObject);
//            assertEquals(ProductLineEnum.Automotive,salesObject.getProductLine());
//            assertEquals("B003TTL0TE", salesObject.getAsin());
//            assertEquals("Chemical Guys MIC_493 Chenille Microfiber Premium Scratch-Free Wash Mitt", salesObject.getItemName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}