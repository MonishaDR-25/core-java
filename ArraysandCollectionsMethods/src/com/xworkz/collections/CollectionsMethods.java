import java.util.*;

public class CollectionsMethods {

    public static void main(String[] args) {

        // 1. sort()
        List list1 = new ArrayList();
        list1.add(5);
        list1.add(1);
        list1.add(3);
        Collections.sort(list1);
        System.out.println("1. sort: " + list1);

        // 2. reverse()
        Collections.reverse(list1);
        System.out.println("2. reverse: " + list1);

        // 3. shuffle()
        List list2 = new ArrayList();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        Collections.shuffle(list2);
        System.out.println("3. shuffle: " + list2);

        // 4. max()
        System.out.println("4. max: " + Collections.max(list1));

        // 5. min()
        System.out.println("5. min: " + Collections.min(list1));

        // 6. frequency()
        List freqList = Arrays.asList("apple", "banana", "apple", "apple");
        int freq = Collections.frequency(freqList, "apple");
        System.out.println("6. frequency: " + freq);

        // 7. replaceAll()
        List replaceList = new ArrayList();
        replaceList.add("dog");
        replaceList.add("cat");
        replaceList.add("dog");
        Collections.replaceAll(replaceList, "dog", "lion");
        System.out.println("7. replaceAll: " + replaceList);

        // 8. copy()
        List src = Arrays.asList("X", "Y");
        List dest = new ArrayList();
        dest.add("1");
        dest.add("2");
        Collections.copy(dest, src);
        System.out.println("8. copy: " + dest);

        // 9. fill()
        List fillList = new ArrayList();
        fillList.add("a");
        fillList.add("b");
        fillList.add("c");
        Collections.fill(fillList, "z");
        System.out.println("9. fill: " + fillList);

        // 10. rotate()
        List rotateList = new ArrayList();
        rotateList.add("one");
        rotateList.add("two");
        rotateList.add("three");
        rotateList.add("four");
        Collections.rotate(rotateList, 2);
        System.out.println("10. rotate: " + rotateList);

        // 11. swap()
        List swapList = new ArrayList();
        swapList.add("A");
        swapList.add("B");
        swapList.add("C");
        Collections.swap(swapList, 0, 2);
        System.out.println("11. swap: " + swapList);

        // 12. unmodifiableList()
        List modifiable = new ArrayList();
        modifiable.add("Hello");
        modifiable.add("World");
        List unmodifiable = Collections.unmodifiableList(modifiable);
        System.out.println("12. unmodifiableList: " + unmodifiable);


        // 13. synchronizedList()
        List syncList = Collections.synchronizedList(new ArrayList());
        syncList.add("Thread-safe");
        System.out.println("13. synchronizedList: " + syncList);

        // 14. checkedList()
        List rawList = new ArrayList();
        List checkedList = Collections.checkedList(rawList, String.class);
        checkedList.add("safe");
        System.out.println("14. checkedList: " + checkedList);

        // 15. disjoint()
        List a = Arrays.asList(1, 2, 3);
        List b = Arrays.asList(4, 5, 6);
        boolean isDisjoint = Collections.disjoint(a, b);
        System.out.println("15. disjoint: " + isDisjoint);
    }
}
