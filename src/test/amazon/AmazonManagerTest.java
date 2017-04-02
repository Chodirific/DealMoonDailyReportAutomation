package amazon;

import org.junit.Before;
import org.junit.Test;
import region.RegionEnum;
import sales.SalesObject;
import sales.SalesObjectUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by User on 10/23/2016.
 */
public class AmazonManagerTest {

    private AmazonManager amazonManager;
    private File file;
    private SalesObjectUtil salesObjectUtil;
    private List<SalesObject> salesObjectList;

    @Before
    public void setUp() throws IOException {
        amazonManager = new AmazonManager();
        file = new File("C:\\Users\\User\\IdeaProjects\\DealMoonDailyReportAutomation\\sampledata\\report (4)(1).txt");
        salesObjectUtil = new SalesObjectUtil();
        salesObjectList = salesObjectUtil.getSalesObjectList(file);
    }
    @Test
    public void setAmazonRegion() throws Exception {

    }

    @Test
    public void constructAmazonUrl() throws Exception {

    }

    @Test
    public void setFileDestination() throws Exception {

    }

    @Test
    public void generateAmazonReport() throws Exception {
        amazonManager.generateAmazonReport(salesObjectList, RegionEnum.Usa.getTopNumberOfItems());
    }

}