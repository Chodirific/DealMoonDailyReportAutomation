package amazon;

import region.RegionEnum;
import sales.SalesObject;

import java.io.*;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 10/23/2016.
 */
public class AmazonManager {
    private RegionEnum amazonRegion;

    public AmazonManager(){
        amazonRegion = RegionEnum.Usa;// Manager will default to USA
    }
    public void setAmazonRegion(RegionEnum amazonRegion){
        this.amazonRegion = amazonRegion;
    }
    private String constructAmazonUrl(SalesObject salesObject){
        return amazonRegion.getAmazonLink() + salesObject.getAsin();
    }


    public StringBuilder generateAmazonReport(List<SalesObject> salesObjectList, int numberOfTopItems) throws IOException {
        //TODO: have this class create our excel object and pass it back to whichever report generator is using this
        StringBuilder amazonReport = new StringBuilder();
        List<SalesObject> localObjectList = salesObjectList;
//        Collections.sort(localObjectList);//Probably should not sort here.
        for (int i = 0; i < numberOfTopItems; i++) {
            SalesObject salesObject = localObjectList.get(i);
            amazonReport.append(constructAmazonUrl(salesObject) + "\t" + salesObject.getAsin() + "\t" + salesObject.getTotalItemsOrdered() + "\n");
        }


        return amazonReport;

    }

}
