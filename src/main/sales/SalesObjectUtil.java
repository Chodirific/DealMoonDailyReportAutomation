package sales;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by User on 10/16/2016.
 */
public class SalesObjectUtil {
    public List<SalesObject> getSalesObjectList(File ... file) throws IOException {
        List<SalesObject> salesObjectList = new ArrayList<>();
        for (int i = 0; i < file.length; i++) {
            generateSalesObjectList(file[i], salesObjectList);
        }
        return salesObjectList;
    }

    private String[] parseData(String data){
        return data.split("[\t]");
    }

    private SalesObject generateSalesObject(String productLine, String itemName, String asin, String date, String linkType, String trackingID, String productLinkConversion, String productLinkClicks, String itemsOrderedThroughProductLinks, String allOtherITemsOrdered, String totalItemsOrdered){
        return new SalesObject(ProductLineEnum.getEnum(productLine),itemName,asin,date,linkType,trackingID,productLinkConversion,productLinkClicks,itemsOrderedThroughProductLinks,allOtherITemsOrdered,Integer.parseInt(totalItemsOrdered));
    }

    public List<SalesObject> filterByProductLine(List<SalesObject> salesObjectList, ProductLineEnum productLineEnum){
        List<SalesObject> filteredSalesObjectList = salesObjectList;
        filteredSalesObjectList.removeIf(salesObject -> salesObject.getProductLine() != productLineEnum);
        return filteredSalesObjectList;
    }
    private void generateSalesObjectList(File file, List<SalesObject> salesObjectList) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        //Eats two lines so that we can get rid of header information
        reader.readLine();
        reader.readLine();
        String line = reader.readLine();
        while (line != null){
            String[] data = parseData(line);
            if(data.length == 11){
                if(salesObjectList.stream().anyMatch(salesObject -> Objects.equals(salesObject.getAsin(), data[2]))){
                  salesObjectList.stream().filter(salesObject -> Objects.equals(salesObject.getAsin(), data[2])).findFirst().get().addToTotalItemsOrdered(Integer.parseInt(data[10]));
                }
                else{
                    salesObjectList.add(generateSalesObject(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10]));
                }
            }
            line = reader.readLine();
        }
    }
}
