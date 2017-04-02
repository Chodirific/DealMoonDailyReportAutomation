package report;

import amazon.AmazonManager;
import region.RegionEnum;
import sales.SalesObject;
import sales.SalesObjectUtil;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 10/23/2016.
 */
public class USAReportGenerator implements ReportGenerator {

    private SalesObjectUtil salesObjectUtil;
    private AmazonManager amazonManager;

    USAReportGenerator(){
        salesObjectUtil = new SalesObjectUtil();
        amazonManager = new AmazonManager();
    }


    @Override
    public StringBuilder generateReport(File... file) throws IOException {
        //TODO: have this class pass in our presorted list into the amazon manager and the number of "top" items we need to have it pass back
        //our excel object
        List<SalesObject> salesObjectList = salesObjectUtil.getSalesObjectList(file);
        Collections.sort(salesObjectList);//Sorting on the outside and then passing in the sorted list

        return amazonManager.generateAmazonReport(salesObjectList, RegionEnum.Usa.getTopNumberOfItems());
    }
}
