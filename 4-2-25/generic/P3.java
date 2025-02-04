package generic;

import java.util.List;
public class P3 {
	public static <I> int findFirstIndex(List<I> list, I target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50, 30);
        System.out.println("Index of 30: " + findFirstIndex(numbers, 30)); // 2
        System.out.println("Index of 60: " + findFirstIndex(numbers, 60)); // -1
        
        List<String> words = List.of("apple", "banana", "cherry", "date");
        System.out.println("Index of 'cherry': " + findFirstIndex(words, "cherry")); // 2
        System.out.println("Index of 'grape': " + findFirstIndex(words, "grape")); // -1
    }

}