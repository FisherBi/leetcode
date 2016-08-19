package algorithms.toMapExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by fisbii on 16-8-19.
 */
public class Test {
    public static void main(String args[]){
        List<Person> people = new ArrayList<>();
        Person p1 = new Person("zhangsan","shandong");
        Person p2 = new Person("lisi","beijing");
        Person p3 = new Person("zhangsan","hebei");
        Person p4 = new Person("wangwu","henan");
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        Map<String ,String> phoneBook = people.stream().collect(
                Collectors.toMap(
                        Person::getName,
                        Person::getAddress,
                        (s, a) -> s + ", " + a
                )
        );
        phoneBook.forEach((k,v)->System.out.println(k+"->"+v));
        people.forEach(v -> System.out.println(v.getAddress()));
    }
}
