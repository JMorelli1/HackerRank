import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingValleysTest {

    private String testValley0 = "UDUUUDUUD";
    private String testValley1 = "UDDDUDUU";
    private String testValley2 = "DDUUDDUDUUUD";
    private String testValley3 = "DDDUUDUUUUDDDDUUDDDDUDUUUU";

    @Test
    public void shouldCountZeroValleys(){
        assertEquals(0, CountingValleys.countingValleys(testValley0.length(), testValley0));
    }
    @Test
    public void shouldCountOneValleys(){
        assertEquals(1, CountingValleys.countingValleys(testValley1.length(), testValley1));
    }
    @Test
    public void shouldCountTwoValleys(){
        assertEquals(2, CountingValleys.countingValleys(testValley2.length(), testValley2));
    }
    @Test
    public void shouldCountThreeValleys(){
        assertEquals(3, CountingValleys.countingValleys(testValley3.length(), testValley3));
    }
}
