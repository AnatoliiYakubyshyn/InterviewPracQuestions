import com.solvd.practicalInterviewQuestions.MapProcessing;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

import static java.util.Map.entry;

public class MapProcessingTest {

    @Test
    public void test() {
        Map < String, Map < String, Map< String, Integer >>> test1 = Map.ofEntries(
                entry("2021-12-23", Map.ofEntries(entry("new reddit", Map.ofEntries(entry("uniques", 111902),
                        entry("pageviews", 221081))), entry("android", Map.ofEntries(entry("uniques", 298063),
                        entry("pageviews", 1153728))), entry("old reddit", Map.ofEntries(entry("uniques", 132801),
                        entry("pageviews", 723509))), entry("ios", Map.ofEntries(entry("uniques", 311642),
                        entry("pageviews", 755030))), entry("mobile web", Map.ofEntries(entry("uniques", 130288),
                        entry("pageviews", 219457))))),
                entry("2021-12-22", Map.ofEntries(entry("new reddit",
                        Map.ofEntries(entry("uniques", 118371), entry("pageviews", 225093))),
                        entry("android", Map.ofEntries(entry("uniques", 280199), entry("pageviews", 1291546))),
                        entry("old reddit", Map.ofEntries(entry("uniques", 145437), entry("pageviews", 760191))),
                        entry("ios", Map.ofEntries(entry("uniques", 257443), entry("pageviews", 575184))),
                        entry("mobile web", Map.ofEntries(entry("uniques", 116411), entry("pageviews", 191464))))),
                entry("2021-12-21", Map.ofEntries(entry("new reddit", Map.ofEntries(entry("uniques", 175446),
                        entry("pageviews", 300378))), entry("android", Map.ofEntries(entry("uniques", 331628),
                        entry("pageviews", 1613490))), entry("old reddit", Map.ofEntries(entry("uniques", 164052),
                        entry("pageviews", 830788))), entry("ios", Map.ofEntries(entry("uniques", 288464),
                        entry("pageviews", 626490))), entry("mobile web", Map.ofEntries(entry("uniques", 111844),
                        entry("pageviews", 193197))))),
                entry("2021-12-10", Map.ofEntries(entry("new reddit", Map.ofEntries(entry("uniques", 140548),
                        entry("pageviews", 267522))), entry("android", Map.ofEntries(entry("uniques", 375491),
                        entry("pageviews", 1336061))), entry("old reddit", Map.ofEntries(entry("uniques", 189477),
                        entry("pageviews", 957462))), entry("ios", Map.ofEntries(entry("uniques", 418290),
                        entry("pageviews", 985014))), entry("mobile web", Map.ofEntries(entry("uniques", 198403),
                        entry("pageviews", 336195))))));
        Assert.assertEquals(MapProcessing.getTotalNumberOfViewForTheLastTwoDays(test1),6116283);

    }
}
