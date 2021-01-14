import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    User user = new User("username", "password");

    @Test
    public void getUsername() {
        assertEquals("username", user.getUsername());
    }

    @Test
    public void getPassword() {
        assertEquals("password", user.getPassword());
    }

    @Test
    public void setUsername() {
        user.setUsername("newusername");
        assertEquals("newusername", user.getUsername());
    }

    @Test
    public void setPassword() {
        user.setPassword("newusername");
        assertEquals("newusername", user.getPassword());
    }

    @Test
    public void addUser() {
        //Database Connection
    }

    @Test
    public void deleteUser() {
        //Database Connection
    }
}