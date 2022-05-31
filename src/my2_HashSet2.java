import java.util.HashSet;
import java.util.Set;

public class my2_HashSet2
{
    public static void main(String[] args) {
        String[] arr = {"migo","doe","bonge"};
        Set<String> Sample = new HashSet<>();
        for (String a: arr){
            Sample.add(a);
        }
        System.out.println("sample Element"+Sample);

        Set<String> mySet = new HashSet<>();
        mySet.add("migo");
        mySet.add("doe");
        mySet.add("bonge");
        mySet.add("bonge");
        System.out.println("sample Element code"+Sample.hashCode());
        System.out.println("mySet Element code"+mySet.hashCode());

        System.out.println("두 객체가 같은지 여부="+(Sample==mySet));//false
        System.out.println("두 객체가 같은지 여부2="+mySet.equals(Sample));//true
    }
}
