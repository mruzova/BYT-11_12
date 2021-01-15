import java.util.ArrayList;
import java.util.Date;
import java.sql.Timestamp;
public class Result {

    ArrayList<Matrix> matrix;
    User user;

    Timestamp Timestamp;

    public Result(ArrayList<Matrix> matrix, User user) {
        this.matrix = matrix;
        this.user = user;
        AddResult();
    }

    public Timestamp getTimestamp()
    {
        return Timestamp;
    }

    public void setTimestamp(Timestamp timestamp)
    {
        Timestamp = timestamp;
    }

    public ArrayList<Matrix> getMatrix() {
        return matrix;
    }

    public void setMatrix(ArrayList<Matrix> matrix) {
        this.matrix = matrix;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void AddResult()
    {
        this.Timestamp = (Timestamp) new Date();
        //Add To Database
    }

    public void DeleteResult()
    {
        //Delete From Database
    }

    public void ShareResult()
    {
        //Share To Social Media
    }
}
