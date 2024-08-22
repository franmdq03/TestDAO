package herencia.interfaces;

import java.util.ArrayList;
import java.util.List;

public class DaoPerson implements DAO<Person> {

    private List<Person> people = new ArrayList();
    private static int nextId = 1;

    @Override
    public void create(Person person) {

        person.setId(nextId++);
        this.people.add(person);
    }

    @Override
    public void update(Person person, int id) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId() == id) {
                person.setId(id);
                people.set(id, person);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        people.removeIf(person -> person.getId() == id);
    }

    @Override
    public Person readById(int id) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId() == id) {
                return people.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Person> readAll() {
        return new ArrayList<>(people);
    }
}
