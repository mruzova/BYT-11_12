import java.util.Date;
import java.sql.Timestamp;
public class Result {

    Matrix matrix;
    User user;

    Timestamp Timestamp;

    public Result(Matrix matrix, User user) {
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
