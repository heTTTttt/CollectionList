import java.util.*;

public class ListMethods {

    void countOccurrence() {

    }

    public <T> List<T> toList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    public void findUnique(List<Integer> array) {
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
                    integer = array.get(i);
                }
            }
            System.out.println(integer);
        }
        result = countUnique - count;
        //System.out.println(result);
        //System.out.println(integer + " " + array);
    }

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


    void findOccurance() {

    }
}
