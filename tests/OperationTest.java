import org.junit.Test;

import static org.junit.Assert.*;

public class OperationTest {
Operation operation = new Operation("addition", "desc", "+");
    @Test
    public void getName() {
        assertEquals("addition",operation.getName());
    }

    @Test
    public void getDescription() {
        assertEquals("desc",operation.getDescription());
    }

    @Test
    public void getAlgorithm() {
        assertEquals("+",operation.getAlgorithm());
    }

    @Test
    public void setName() {
        operation.setName("sub");
        assertEquals("sub",operation.getName());
    }

    @Test
    public void setDescription() {
        operation.setDescription("newdesc");
        assertEquals("newdesc",operation.getDescription());
    }

    @Test
    public void setAlgorithm() {
        operation.setAlgorithm("-");
        assertEquals("-",operation.getAlgorithm());
    }

    @Test
    public void addOperation() {
        //add operation
        operation.AddOperation("add","desc","-");
    }

    @Test
    public void editOperation() {
        //edit operation
        operation.EditOperation("add","desc","-");
    }
}