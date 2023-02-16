import java.util.*;
import java.util.stream.Collectors;

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
    public List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> uniqueNumbers = numbers.stream()
                .filter(i -> java.util.Collections.frequency(numbers, i) == 1)
                .collect(Collectors.toList());
        return uniqueNumbers;
    }

    // task 4;
    void calcOccurrence(List<String> list) {

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
    public List<Word> findOccurrence(List<String> wordList) {
        Map<String, Integer> occurrenceMap = new HashMap<>(); //створюємо Map, де ключ - слово, значення - кількість його повторень
        for (String word : wordList) {
            if (occurrenceMap.containsKey(word)) {
                occurrenceMap.put(word, occurrenceMap.get(word) + 1); //якщо слово вже зустрічалося, збільшуємо його лічильник на 1
            } else {
                occurrenceMap.put(word, 1); //якщо слово вперше зустріли, додаємо його до Map з лічильником 1
            }
        }
        List<Word> result = new ArrayList<>(); //створюємо список результатів
        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet()) {
            result.add(new Word(entry.getKey(), entry.getValue())); //перетворюємо кожен запис Map у відповідний об'єкт Word і додаємо його до списку результатів
        }
        return result;
    }
}
