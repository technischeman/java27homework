public class main {
    public static void main(String[] args) {
        employee employee1 = new employee("ali", 19, "germany", "programming", "java");
        manager manager = new manager("veli", 21, "england", "programming", "c++");

        employee1.ageprint();
        manager.ageprint();


    }

}
