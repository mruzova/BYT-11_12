public class Matrix {
    private int id;
    private double[] valuesX;
    private double[] valuesY;
    private double[] result;
    Operation operation;

    public Matrix(int id, double[] valuesX, double[] valuesY, double[] result, Operation operation) {
        this.id = id;
        this.valuesX = valuesX;
        this.valuesY = valuesY;
        this.result = result;
        this.operation = operation;
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

    public double[] getResult() {
        return result;
    }

    public void setResult(double[] result) {
        this.result = result;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
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
