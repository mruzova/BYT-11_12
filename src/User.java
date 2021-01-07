import java.util.ArrayList;

public abstract class User {

    ArrayList<Matrix> matrices = new ArrayList<>();

    String username;
    String password;

    public abstract boolean addUserToDB(User user);
    public abstract boolean removeUserFromDB(User user);

    public boolean addUser(String username, String password)
    {
        this.username = username;
        this.password = password;

        return addUserToDB(this);
    }

    public boolean removeUser(String username)
    {
        this.username = username;

        return removeUserFromDB(this);
    }
}
