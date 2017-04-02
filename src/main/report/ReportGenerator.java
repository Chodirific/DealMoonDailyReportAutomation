package report;

import java.io.File;
import java.io.IOException;

/**
 * Created by User on 10/23/2016.
 */
public interface ReportGenerator {
    public StringBuilder generateReport(File...file) throws IOException;
}
