public class members {

    public String name;
    public int age;
    private String adress;


    public int ageprint() {
        System.out.println("age of " + name + " is " + age);
        return age;

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAdress() {
        return adress;
    }

    public members(String name, int age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }


}
