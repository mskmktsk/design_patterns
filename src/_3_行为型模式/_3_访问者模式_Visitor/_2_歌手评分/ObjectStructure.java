package _3_行为型模式._3_访问者模式_Visitor._2_歌手评分;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Person> persons = new ArrayList<>();

    public void attach(Person person) {
        persons.add(person);
    }

    public void detach(Person person) {
        persons.remove(person);
    }

    public void display(Action action) {
        for (Person person: persons) {
            person.accept(action);
        }
    }
}
