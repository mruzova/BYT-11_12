import java.util.ArrayList;

public class Matrix {
    int id;
    double[] valuesX;
    double[] valuesY;
    double[] result;
    ArrayList<Operation> operation;
    User user;

    public Matrix(int id, double[] valuesX, double[] valuesY, double[] result, ArrayList<Operation> operation, User user) {
        this.id = id;
        this.valuesX = valuesX;
        this.valuesY = valuesY;
        this.result = result;
        this.operation = operation;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double[] getValuesX() {
        return valuesX;
    }

    public void setValuesX(double[] valuesX) {
        this.valuesX = valuesX;
    }

    public double[] getValuesY() {
        return valuesY;
    }

    public void setValuesY(double[] valuesY) {
        this.valuesY = valuesY;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double[] getResult() {
        return result;
    }

    public void setResult(double[] result) {
        this.result = result;
    }

    public ArrayList<Operation> getOperation() {
        return operation;
    }

    public void setOperation(ArrayList<Operation> operation) {
        this.operation = operation;
    }
    public void Add(double valuesx[], double valuesy[]){
        this.valuesX = valuesX;
        this.valuesY = valuesY;
    }
    public void Edit(double valuesx[], double valuesy[]){
         this.valuesX = valuesX;
         this.valuesY = valuesY;
    }
    public void Calculate(){
        // calculates
    }
}
