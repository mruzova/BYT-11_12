import java.util.ArrayList;

public class User {

    ArrayList<Matrix> matrices = new ArrayList<>();
    ArrayList<Matrix> results = new ArrayList<>();

    String Username;
    String Password;

    public User(String username, String password) {
        AddUser(username, password);
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public void AddUser(String username, String password)
    {
        this.Username = username;
        this.Password = password;
        //Add To Database
    }

    public void DeleteUser(String username)
    {
        //Delete From Database
    }
}
