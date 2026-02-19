import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {
    private List<Person> persons;
    
    public Employees() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.persons.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(person -> this.add(person));
    }
    
    public void print() {
        // persons.stream().forEach(person -> System.out.println(person));
        Iterator<Person> iterator = persons.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public  void print(Education education) {
        /* persons.stream().filter(person -> person.getEducation() == education)
                .forEach(person -> System.out.println(person)); */
        
        Iterator<Person> iterator = persons.iterator();
        
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = persons.iterator();
        
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
