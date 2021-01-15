import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MatrixTest {

    User user = new User("username", "password");
    double valuesX[] = new double[]{1.0, 2.0, 3.0, 4.0};
    double valuesY[] = new double[]{1.1, 2.1, 3.1, 4.1};
    double result[] = new double[]{valuesX[0] + valuesY[0], valuesX[1] + valuesY[1], valuesX[2] + valuesY[2], valuesX[3] + valuesY[3]};
    ArrayList<Operation> op = new ArrayList<Operation>() {
        {
            add(new Operation("addition", "desc", "+"));
        }
    };
    Matrix matrix = new Matrix(1, valuesX, valuesY, result, op, user);

    @Test
    public void getId() {
        assertEquals(1, matrix.getId());
    }

    @Test
    public void setId() {
        matrix.setId(2);
        assertEquals(2, matrix.getId());
    }

    @Test
    public void getValuesX() {
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0}, matrix.getValuesX(), 0);

    }

    @Test
    public void setValuesX() {
        matrix.setValuesX(new double[]{1.1, 2.0, 3.0, 4.0});
        assertArrayEquals(new double[]{1.1, 2.0, 3.0, 4.0}, matrix.getValuesX(), 0);
    }

    @Test
    public void getValuesY() {
        assertArrayEquals(new double[]{1.1, 2.1, 3.1, 4.1}, matrix.getValuesY(), 0);
    }

    @Test
    public void setValuesY() {
        matrix.setValuesY(new double[]{1.1, 2.0, 3.1, 4.1});
        assertArrayEquals(new double[]{1.1, 2.0, 3.1, 4.1}, matrix.getValuesY(), 0);
    }

    @Test
    public void getResult() {
        assertArrayEquals(new double[]{2.1, 4.1, 6.1, 8.1}, matrix.getResult(), 0);
    }

    @Test
    public void setResult() {
        matrix.setResult(new double[]{valuesX[0] - valuesY[0], valuesX[1] - valuesY[1], valuesX[2] - valuesY[2], valuesX[3] - valuesY[3]});
        assertArrayEquals(new double[]{-0.1, -0.1, -0.1, -0.1}, matrix.getResult(), 0.0000000009);
    }

    @Test
    public void getOperation() {
        ArrayList<Operation> expected = new ArrayList<Operation>() {
            {
                add(new Operation("addition", "desc", "+"));
            }
        };
        assertThat(matrix.getOperation().toString(), is(expected.toString()));
    }

    @Test
    public void setOperation() {
        ArrayList<Operation> operations = new ArrayList<Operation>() {
            {
                add(new Operation("subtraction", "desc", "+"));
            }
        };
        matrix.setOperation(operations);
        ArrayList<Operation> expected = new ArrayList<Operation>() {
            {
                add(new Operation("subtraction", "desc", "+"));
            }
        };
        assertThat(matrix.getOperation().toString(), is(expected.toString()));
    }

    @Test
    public void add() {
        //addition test
        matrix.Add(valuesX,valuesY);
    }

    @Test
    public void edit() {
        //  edition test
        matrix.Edit(valuesX,valuesY);

    }

    @Test
    public void calculate() {
        matrix.Calculate();
    }
}