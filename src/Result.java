import java.util.Date;

public class Result {

    Matrix matrix;
    User user;

    String Timestamp;

    public Result(Matrix matrix, User user) {
        this.matrix = matrix;
        this.user = user;
        AddResult();
    }

    public String getTimestamp()
    {
        return Timestamp;
    }

    public void setTimestamp(String timestamp)
    {
        Timestamp = timestamp;
    }

    public void AddResult()
    {
        this.Timestamp = new Date().toString();
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
