import java.util.Arrays;
import java.util.List;

public class my2_string5 {
    public static void main(String[] args) {
//        String join1= String.join(",","아메리카노","카페모카");
//        System.out.println("결과====>"+join1);

        //배열에서 join메소드
//        String[] arr={"아메리카노","카페라뗴","카페모카"};
//        String coffee = String.join("/",arr);
//        System.out.println("결과===>"+coffee);

        //List
        List<String> arr = Arrays.asList("아메리카노","카페라뗴","카페모카");
        String coffee = String.join("*",arr);
        System.out.println("결과===>"+coffee);
    }
}
