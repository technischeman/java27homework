public class employee extends members{
    String specific;
    String department;

    public employee(String name, int age, String adress, String specific, String department) {
        super(name, age, adress);
        this.specific = specific;
        this.department = department;
    }


}
