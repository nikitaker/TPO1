package domainModel;

public class Zafod extends Person{

    private final String name  = "Zafod";

    public Zafod(String name) {
        super(name);
    }

    void kick(Lever lever){
        lever.setPnut(true);
    }
}
