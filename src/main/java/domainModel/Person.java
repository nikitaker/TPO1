package domainModel;

public class Person {
    private String name;
    private String position;
    private boolean hasAir;

    public Person(String name)
    {
        name = this.name;
        position = "где-то";
    }

    void setPosition(String position){
        this.position = position;
    }

    void breathe(){hasAir = true;}
}
