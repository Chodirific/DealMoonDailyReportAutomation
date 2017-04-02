package sales;

/**
 * Created by User on 10/16/2016.
 */
public class SalesObject implements Comparable<SalesObject>{
    private ProductLineEnum productLine;
    private String itemName;
    private String asin;
    private String date;
    private String linkType;
    private String trackingID;
    private String productLinkConversion;
    private String productLinkClicks;
    private String itemsOrderedThroughProductLinks;
    private String allOtherITemsOrdered;
    private int totalItemsOrdered;

    public SalesObject(){
    }

    public SalesObject(ProductLineEnum productLine, String itemName, String asin, String date, String linkType, String trackingID, String productLinkConversion, String productLinkClicks, String itemsOrderedThroughProductLinks, String allOtherITemsOrdered, int totalItemsOrdered) {
        this.productLine = productLine;
        this.itemName = itemName;
        this.asin = asin;
        this.date = date;
        this.linkType = linkType;
        this.trackingID = trackingID;
        this.productLinkConversion = productLinkConversion;
        this.productLinkClicks = productLinkClicks;
        this.itemsOrderedThroughProductLinks = itemsOrderedThroughProductLinks;
        this.allOtherITemsOrdered = allOtherITemsOrdered;
        this.totalItemsOrdered = totalItemsOrdered;
    }

    @Override
    public String toString() {
        return "ProductLine: " + getProductLine() + "\nItemName: " + getItemName() + "\nASIN: " + getAsin() + "\nDate: " + getDate() + "\nLinkType: " + getLinkType() + "\nTrackingID: " + getTrackingID() + "\nProductLinkConversion: " + getProductLinkConversion() + "\nProduct Link Clicks: " + getProductLinkClicks() + "\nItmes Ordered Through Product Links: " + getItemsOrderedThroughProductLinks() + "\nallOtherItemsOrdered: " + getAllOtherITemsOrdered() + "\nTotal Items Ordered: " + getTotalItemsOrdered() + "\n";
    }

    public String getItemName() {
        return itemName;
    }

    public String getAsin() {
        return asin;
    }

    public String getLinkType() {
        return linkType;
    }

    public String getTrackingID() {
        return trackingID;
    }

    public String getProductLinkConversion() {
        return productLinkConversion;
    }

    public String getProductLinkClicks() {
        return productLinkClicks;
    }

    public String getItemsOrderedThroughProductLinks() {
        return itemsOrderedThroughProductLinks;
    }

    public String getAllOtherITemsOrdered() {
        return allOtherITemsOrdered;
    }

    public int getTotalItemsOrdered() {
        return totalItemsOrdered;
    }

    public ProductLineEnum getProductLine() {
        return productLine;
    }

    public String getDate() {
        return date;
    }

    public void addToTotalItemsOrdered(int totalItemsOrdered){
        this.totalItemsOrdered += totalItemsOrdered;
    }

    @Override
    public int compareTo(SalesObject salesObject) {
        return salesObject.getTotalItemsOrdered()-this.getTotalItemsOrdered();
    }
}
