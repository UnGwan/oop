import java.util.StringJoiner;

public class my2_String4 {
    public static void main(String[] args) {
        StringJoiner sj =new StringJoiner("/","(",")").add("apple").add("peach").add("strawberry");
//        sj.add("apple");
//        sj.add("peach");
//        sj.add("strawbrtty");
//        String result = sj.toString();
        String  result = new StringJoiner("-").add("apple").add("peach").add("strawberry").toString();
        System.out.println("결과 ===="+result);
    }
}
