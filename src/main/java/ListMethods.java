import java.util.*;

public class ListMethods {

    // task 1;
    void countOccurrence(List<String> list, String word) {
        int count = 0;
        for (String s : list) {
            if (Objects.equals(word, s)) {
                count++;
                System.out.println(word + " = " + count);
            }
        }
    }

    // task 2;
    public <T> List<T> toList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    // task 3;
    public void findUnique(List<Integer> array) {

        List<Integer> list = new ArrayList<>();
        int result;
        int countUnique = 0;
        int count = 0;
        Integer integer = 0;
        for (int i = 0; i < array.size(); i++) {
            countUnique++;
            for (int j = i + 1; j < array.size(); j++) {
                if (Objects.equals(array.get(j), array.get(i))) {
                    count++;
                }
                if (!Objects.equals(array.get(j), array.get(i))) {
                    integer = array.get(i - count);
                    list.add(integer);
                }
            }
        }
        result = countUnique - count;
        System.out.println("----------------------");
        System.out.println(result); // unique numbers;
        System.out.println("----------------------");
        System.out.println(list + " " + array);
        System.out.println("----------------------");
        System.out.println(integer);
    }

    // task 4;
    void calcOccurance(List<String> list) {

        String text = list.toString();

        Map<String, Integer> map = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 0);
            }
            map.put(word, map.get(word) + 1);
        }
        for (String word : map.keySet()) {
            System.out.println(word + " " + map.get(word));
        }
    }

// один з варіантів виконання завдання.
    //            for (String word : words){
//                Integer integer = map.get(word);
//                int value;
//                if (integer == null){
//                    value = 1;
//                }else {
//                    value = ++integer;
//                }
//                map.put(word, value);
//            }
//            System.out.println(" " + map);


    // task 5;
    void findOccurance() {

    }
}
