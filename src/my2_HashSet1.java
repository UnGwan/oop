import java.util.HashSet;
import java.util.Set;

public class my2_HashSet1 {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("migo");
        mySet.add("doe");
        mySet.add("bonge");
        mySet.add("bonge");
        System.out.println("항목="+mySet);// 순서가 없다.
        System.out.println("원소 갯수="+ mySet.size());
        mySet.remove("doe");
        System.out.println("항목="+mySet);
        if (mySet.contains("doe")==true){
            System.out.println("doe is exist");
        }
    }
}
