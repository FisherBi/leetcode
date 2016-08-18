package algorithms.PascalTriangle;

/**
 * Created by fisbii on 16-8-18.
 */
@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1, T o2);
    default String a(){
        return "a";
    }
    static void b(){
        System.out.println("aa");
    }
    default String a1(){
        return "a";
    }
    static void b1(){
        System.out.println("aa");
    }

}
