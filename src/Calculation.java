import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Calculation {
    // Declaration of variables
    Timestamp timestamp;
    String Description;
    List<Integer> StepResult = new ArrayList<>();

    // Getters and setters
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public List<Integer> getStepResult() {
        return StepResult;
    }

    public void setStepResult(List<Integer> stepResult) {
        StepResult = stepResult;
    }

    // Method which is printing our results
    public void ShowResult(){
        System.out.println("Results are:");
        for (int result : this.StepResult){
            System.out.println(result);
        }

    }
}
