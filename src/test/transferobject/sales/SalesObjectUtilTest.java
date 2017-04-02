package test.transferobject.sales;

import org.junit.Before;
import org.junit.Test;
import sales.ProductLineEnum;
import sales.SalesObject;
import sales.SalesObjectUtil;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by User on 10/16/2016.
 */
public class SalesObjectUtilTest {

    private File file;
    private SalesObjectUtil salesObjectUtil;
    private List<SalesObject> salesObjectList;
    @Before
    public void setUp() throws IOException {
        file = new File("C:\\Users\\User\\IdeaProjects\\DealMoonDailyReportAutomation\\sampledata\\report (4)(1).txt");
        salesObjectUtil = new SalesObjectUtil();
    }

    @Test
    public void getSalesObject() throws Exception {
        salesObjectList = salesObjectUtil.getSalesObjectList(file);
        assertTrue(salesObjectList.size()>0);
    }

    @Test
    public void sortSalesObject() throws IOException {
        salesObjectList = salesObjectUtil.getSalesObjectList(file);
        Collections.sort(salesObjectList);
        assertTrue(salesObjectList.get(0).getTotalItemsOrdered() >= salesObjectList.get(1).getTotalItemsOrdered());
    }

    @Test
    public void testSalesObjectFilterByProductLine() throws IOException {
        salesObjectList = salesObjectUtil.getSalesObjectList(file);
        salesObjectUtil.filterByProductLine(salesObjectList, ProductLineEnum.Baby);
        for (SalesObject salesObject : salesObjectList) {
            assertEquals(ProductLineEnum.Baby, salesObject.getProductLine());

        }
    }


//
//    @Test
//    public void testNonExistantEnumValue() throws IOException {
//        salesObjectList = salesObjectUtil.getSalesObjectList(file);
//        System.out.println(ProductLineNonExistentEnum.nonExistantEnumList.size());
//        for (String string :
//                ProductLineNonExistentEnum.nonExistantEnumList) {
//            System.out.println(string.replace("・" , "_").replace("＆" , "And").replace("&", "And") + "(\""+ string.replace("・" , "_").replace("＆" , "And").replace("&", "And")+"\"),");
//        }
//    }

}