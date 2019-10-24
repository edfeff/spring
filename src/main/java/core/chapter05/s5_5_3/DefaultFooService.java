package core.chapter05.s5_5_3;

public class DefaultFooService implements PersonService {
    @Override
    public Person getPerson(String name, int age) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Person(name, age);
    }
}
