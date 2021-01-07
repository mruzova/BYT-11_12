import java.util.ArrayList;

public abstract class User {

    ArrayList<Matrix> matrices = new ArrayList<>();

    ArrayList<Matrix> results = new ArrayList<>();

    String Username;
    String Password;

    public abstract boolean addUserToDB(User user);
    public abstract boolean removeUserFromDB(User user);

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

    public boolean AddUser(String username, String password)
    {
        this.Username = username;
        this.Password = password;

        return addUserToDB(this);
    }

    public boolean RemoveUser(String username)
    {
        this.Username = username;

        return removeUserFromDB(this);
    }
}
