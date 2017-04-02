package report;

import region.RegionEnum;

/**
 * Created by User on 10/23/2016.
 */
public class ReportGeneratorFactory {
    public static ReportGenerator createReportGenerator(RegionEnum regionEnum){
        if(regionEnum == RegionEnum.Usa){
            return new USAReportGenerator();
        }
        else if(regionEnum == RegionEnum.Canada){

        }
        else if(regionEnum == RegionEnum.Japan){
        }
            return null;
    }
}
