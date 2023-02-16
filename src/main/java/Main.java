import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listStr = new ArrayList<>();
        listStr.add("Hello");
        listStr.add("Hello");
        listStr.add("Hillel");
        listStr.add("Hillel");
        listStr.add("Hi");
        listStr.add("Hi");
        listStr.add("Calculate");
        listStr.add("Calculate");
        listStr.add("Calculate");
        listStr.add("Calculate");
        listStr.add("Bye");
        listStr.add("Bye");
        listStr.add("Cool");
        listStr.add("Cool");
        listStr.add("Training");
        listStr.add("Training");
        listStr.add("Busy");

        List<Integer> listNum = new ArrayList<>();
        listNum.add(13);listNum.add(32);listNum.add(55);listNum.add(42);
        listNum.add(42);listNum.add(43);listNum.add(44);
        listNum.add(43);listNum.add(44);listNum.add(10);
        listNum.add(5);listNum.add(5);listNum.add(5);



        String[] str = { "A", "B", "C", "D" };

        ListMethods listMethods = new ListMethods();

        System.out.println("--------------------------");
        System.out.println("Method countOccurrence: ");
        listMethods.countOccurrence(listStr, "Calculate"); //method countOccurrence
        System.out.println("--------------------------");
        System.out.println("To array: " + Arrays.toString(str));
        System.out.println("To list: " + listMethods.toList(str)); //method toList
        System.out.println("--------------------------");
        System.out.println("List of unique numbers: ");
        System.out.println(listMethods.findUnique(listNum));
        System.out.println("--------------------------");
        System.out.println("Method calcOccurance: ");
        listMethods.calcOccurrence(listStr);
        System.out.println("--------------------------");
        System.out.println("Method findOccurrence: ");
        System.out.println(listMethods.findOccurrence(listStr));

    }
}
