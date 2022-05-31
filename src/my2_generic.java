import java.awt.*;
import java.util.*;
import java.util.List;

public class my2_generic {

    public static void main(String[] args) {
        List<String> sample1 = new ArrayList<>();
        sample1.add("채송화");
        sample1.add("목련");
//        sample1.add(1500);
//        String a = (String) sample1.get(2); // 형변환 이렇게 안됨.
        System.out.println(sample1);
    }
}
