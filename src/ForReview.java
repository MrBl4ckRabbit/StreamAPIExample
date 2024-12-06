import java.util.ArrayList;
import java.util.List;

public class ForReview {
    public static void main(String[] args) {
//        int a = 215;
//        byte b = 0x5F;
//        double c = 20.36;
//        float d = 12.02f;
//        long e = (long) Math.pow(2, 32);
//
//        int res1 = a + b + 5;
//
//        double res2 = c - e + d - a;
//
//        float res3 = a + b + d + e;
//
//        long res4 = e - 2 * a + b;
//
//
//        double resSum = res1 + res2 + res3 + res4;
//        System.out.println(resSum);
//
//        String str1 = new String("example");
//        String str2 = new String("example");

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");


        System.out.println(list);
        for (String item : list) {
            if (item.equals("two")) {
                list.remove(item);
            }
        }

        System.out.println(list);

//        float f=2.0f;
//        long l1=1L;
//        switch (l1){
//
//        }
    }
}
