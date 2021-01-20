import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.Date;


public class ResultTest {
    //    Result result;
    Timestamp timestamp = new Timestamp(new Date().getTime());
    ArrayList<Matrix> matrixList = new ArrayList<>();

    User user1 = new User("username", "password");
    double[] valuesX = new double[]{1.0, 2.0, 3.0, 4.0};
    double[] valuesY = new double[]{1.1, 2.1, 3.1, 4.1};
    double[] result1 = new double[]{valuesX[0] + valuesY[0], valuesX[1] + valuesY[1], valuesX[2] + valuesY[2], valuesX[3] + valuesY[3]};
    ArrayList<Operation> op = new ArrayList<Operation>() {
        {
            add(new Operation("addition", "desc", "+"));
        }
    };
    Matrix matrix1 = new Matrix(1, valuesX, valuesY, result1, op, user1);

    User user2 = new User("user", "word");
    double[] valuesX2 = new double[]{2.0, 2.0, 3.0, 1.0};
    double[] valuesY2 = new double[]{1.1, 5.1, 2.1, 4.1};
    double[] result2 = new double[]{valuesX2[0] + valuesY2[0], valuesX2[1] + valuesY2[1], valuesX2[2] + valuesY2[2], valuesX2[3] + valuesY2[3]};
    ArrayList<Operation> op2 = new ArrayList<Operation>() {
        {
            add(new Operation("multiplication", "desc", "*"));
        }
    };
    Matrix matrix2 = new Matrix(2, valuesX2, valuesY2, result2, op2, user2);

    Result result = new Result(matrixList, user1);

    @Test
    public void getTimestamp() {
        result.setTimestamp(timestamp);
        Assert.assertEquals(timestamp, result.getTimestamp());
    }

    @Test
    public void setTimestamp() {
        timestamp = new Timestamp(System.currentTimeMillis());
        result.setTimestamp(timestamp);
        Assert.assertEquals(timestamp, result.getTimestamp());
    }

    @Test
    public void getMatrix() {
        matrixList.add(matrix1);
        Assert.assertEquals(matrixList, result.getMatrix());
    }

    @Test
    public void setMatrix() {
        matrixList.clear();
        matrixList.add(matrix2);
        result.setMatrix(matrixList);
        Assert.assertEquals(matrixList, result.getMatrix());
    }

    @Test
    public void getUser() {
        Assert.assertEquals(user1, result.getUser());
    }

    @Test
    public void setUser() {
        result.setUser(user2);
        Assert.assertEquals(user2, result.getUser());
    }

    @Test
    public void addResult() {
        result.AddResult();
        //Database Connection
    }

    @Test
    public void deleteResult() {
        result.DeleteResult();
        //Database Connection
    }

    @Test
    public void shareResult() {
        result.ShareResult();
        //Share To Social Media
    }
}