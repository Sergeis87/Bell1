package Bell.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> personList= new ArrayList<>();

        personList.add(new Person("Kirill", 26, Person.Position.MIDDLE_JAVA_DEV,
                150000, Person.Value.RUB));
        personList.add(new Person("Vitalii", 28, Person.Position.SENIOR_JAVA_AUTOMATION,
                2000, Person.Value.USD));
        personList.add(new Person("Alexandr", 31, Person.Position.JUNIOR_FUNCTIONAL_TESTER,
                150000, Person.Value.RUB));
        personList.add(new Person("Dementii", 35, Person.Position.DEV_OPS,
                1500, Person.Value.USD));

        System.out.println(personList.stream()
                .filter(p -> p.getValue() == Person.Value.RUB)
                .map(w ->w.getName())
                .collect(Collectors.toList()));


        Double middleAge = personList.stream()
                .collect(Collectors.averagingDouble(f ->f.getAge()));
        System.out.println(middleAge);

        System.out.println(personList.stream()
                        .filter(n->n.getAge() <30)
                        .map(w->w.getName())
                .collect(Collectors.toList()));

    }
}
