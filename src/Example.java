import java.util.*;

public class Example {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Item1");
        items.add("Item2");
        items.add("Item3");
        items.add("Item4");
        items.add("Item5");
        items.add("Item6");
        items.add("Item7");
        items.add("Item8");
        items.add("Item9");
        items.add("Item10");
        items.add("Item11");

        Iterator<String> iterator = items.iterator();

        for (int i = 0; i < 10; i++) {
            System.out.println("hasNext() call " + (i + 1) + ": " + iterator.hasNext());
        }
        System.out.println("************");
        if (iterator.hasNext()) {
            System.out.println("Next element: " + iterator.next());
        }

        System.out.println("************");
        while (iterator.hasNext()) {
            System.out.println("Next element: " + iterator.next());
        }
    }
}
