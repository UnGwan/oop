import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class my2_arraylist2 {

    public static void main(String[] args) {

//        String[] arr= new String[]{"채송화","금잔화","다알리아"};
//        List<String> myflower = new ArrayList<>(Arrays.asList(arr));
//        System.out.println("리스트 변환 결과"+myflower);
//        myflower.set(2,"패랭이꽃");
//        myflower.add(0,"마가렛트");
//        System.out.println("수정 후 리스트 변환 결과 "+myflower);

        int [] arr ={100,200,300,400};
        List<Integer> mynum = new ArrayList<>();
        for (int a : arr){
            mynum.add(a);
        }
        mynum.add(2,250);
        System.out.println("수정 후 리스트 변환 결과"+mynum);
    }
}
