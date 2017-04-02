package report;

import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by User on 10/23/2016.
 */
public class USAReportGeneratorTest {
    private USAReportGenerator usaReportGenerator;

    @Before
    public void setUp(){
        usaReportGenerator = new USAReportGenerator();
    }

    @Test
    public void generateReport() throws Exception {
        File file1 = new File("C:\\Users\\User\\IdeaProjects\\DealMoonDailyReportAutomation\\sampledata\\report (4)(1).txt");
        File file2 = new File("C:\\Users\\User\\IdeaProjects\\DealMoonDailyReportAutomation\\sampledata\\report (5)(1).txt");
        System.out.println(usaReportGenerator.generateReport(file1, file2));
    }

}