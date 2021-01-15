import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.List;

public class CalculationTest {
    Calculation calculation;
    String description = "Simple description";
    List<Integer> stepResults = Collections.singletonList(1);
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    @Before
    public void before() {
        // Setting object using all setters.
        calculation = new Calculation();
        calculation.setDescription(description);
        calculation.setStepResult(stepResults);
        calculation.setTimestamp(timestamp);
    }
    // Testing getters
    @Test
    public void getTimestamp() {
        Assert.assertEquals(timestamp,calculation.getTimestamp());
    }


    @Test
    public void getDescription() {
        Assert.assertEquals(description,calculation.getDescription());
    }


    @Test
    public void getStepResult() {
        Assert.assertEquals(stepResults,calculation.getStepResult());
    }

    @Test
    public void showResult() {
        calculation.showResult();
    }
}