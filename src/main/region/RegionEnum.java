package region;

/**
 * Created by User on 10/23/2016.
 */
public enum RegionEnum {
    Usa("https://www.amazon.com/gp/product/",50), Japan("https://www.amazon.co.jp/dp/",25), Canada("https://www.amazon.ca/gp/product/",25);

    private String amazonUrl;
    private int topNumberOfItems;
    RegionEnum(String amazonUrl, int topNumberOfItems){
        this.amazonUrl = amazonUrl;
        this.topNumberOfItems = topNumberOfItems;
    }

    public String getAmazonLink(){
        return amazonUrl;
    }

    public int getTopNumberOfItems(){
        return topNumberOfItems;
    }
}
