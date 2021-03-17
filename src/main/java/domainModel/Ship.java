package domainModel;

import java.util.ArrayList;
import java.util.List;



public class Ship {

    boolean isEmpty;
    List<Person> people = new ArrayList<>();
    AirBag airBag;
    Lever lever;
    Zafod zafod = new Zafod("Zafod");

    public Ship()
    {
        airBag = new AirBag();
        lever = new Lever();
        people.add(new Person("A"));
        people.add(new Person("B"));
        people.add(zafod);
        makeStory();

    }

    void makeStory(){
        airBag.explode();
        people.forEach(e -> e.setPosition("прижатые к стенам"));
        people.forEach(Person::breathe);
        zafod.kick(lever);
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public int getPeopleNum(){
        return people.size();
    }
}
