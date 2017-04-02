package sales;

/**
 * Created by User on 10/16/2016.
 */
public enum ProductLineEnum {
    Automotive("Automotive"), Baby("Baby"), Beauty("Beauty"), Books("Books"), Camera("Camera"),
    Cell_Phones_And_Accessories("Cell Phones & Accessories"), Clothing_And_Accessories("Clothing & Accessories"),
    Computers("Computers"), Electronics("Electronics"), Gift_Card("Gift Card"),
    Grocery_And_Gourmet_Food("Grocery & Gourmet Food"), Handbag_And_Shoes("Handbags and Shoes"),
    Health_And_Personal_Care("Health & Personal Care"), Home("Home"), Home_And_Garden("Home & Garden"),
    Industrial_And_Scientific("Industrial & Scientific"), Kindle_Hardware("Kindle Hardware"),
    Kindle_Tablet_Accessories("Kindle Tablet accessories"), Kindle_eBooks("Kindle eBooks"), Kitchen_And_Housewares("Kitchen & Housewares"),
    Luggage("Luggage"), Luxury("Luxury"), Musical_Instruments("Musical Instruments"), Office_Products("Office Products"), Other("Other"),
    Outdoors("Outdoors"), Pantry("Pantry"), Pet_Supplies("Pet Supplies"), Sports_And_Outdoors("Sports & Outdoors"), Tools("Tools"),
    Tools_And_Hardware("Tools & Hardware"), Toys_And_Games("Toys & Games"), Video_Games("Video Games"), Watches("Watches"),
    Amazonパントリー("Amazonパントリー"),
    おもちゃ("おもちゃ"),
    コスメ("コスメ"),
    ホーム("ホーム"),
    本("本"),
    シューズAndバッグ("シューズ&バッグ"),
    ドラッグストア_ビューティー("ドラッグストア・ビューティー"),
    ベビーAndマタニティ("ベビー&マタニティ"),
    ホームAndキッチン("ホーム＆キッチン"),
    工具_機械("工具・機械"),
    文房具_オフィス用品("文房具・オフィス用品"),
    服Andファッション小物("服＆ファッション小物"),
    食品And飲料("食品＆飲料");


    private String displayName;

    ProductLineEnum(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static ProductLineEnum getEnum(String value) {
        for (ProductLineEnum productLineEnum : ProductLineEnum.values()) {
            if (productLineEnum.displayName.compareTo(value) == 0) {
                return productLineEnum;
            }
        }
        if(!ProductLineNonExistentEnum.nonExistantEnumList.contains(value)){
            ProductLineNonExistentEnum.nonExistantEnumList.add(value);
        }
        return null;
//        throw new IllegalArgumentException("Invalid ProductLineEnum value: " + value);
    }
}
