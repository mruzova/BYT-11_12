public class Operation {

    String Name;
    String Description;
    String Algorithm;

    public Operation(String name, String description, String algorithm) {
        this.Name = name;
        this.Description = description;
        this.Algorithm = algorithm;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public String getAlgorithm() {
        return Algorithm;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setAlgorithm(String algorithm) {
        Algorithm = algorithm;
    }

    public void AddOperation(String Name, String Description, String Algorithm)
    {
        this.Name = Name;
        this.Description = Description;
        this.Algorithm = Algorithm;
    }

    public void EditOperation(String Name, String Description, String Algorithm)
    {
        this.Name = Name;
        this.Description = Description;
        this.Algorithm = Algorithm;
    }
}
