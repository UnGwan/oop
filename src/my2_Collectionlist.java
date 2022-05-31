import java.util.ArrayList;
import java.util.Iterator;

public class my2_Collectionlist {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("migo");
        myList.add("donghi");
        myList.add("bonghi");
        System.out.println(myList);
//        myList.add(100);
//        myList.add(200);
//        System.out.println(myList);
        System.out.println(myList.get(1));
        System.out.println("저장 사이즈는 = "+myList.size());
        myList.add("suesue");
        System.out.println(myList);
        myList.add(2,"zerom");
        System.out.println(myList);
        System.out.println("저장 사이즈는 = "+myList.size());
        myList.add("bonghi");
        System.out.println(myList);
        System.out.println("저장 사이즈는 = "+myList.size());
        myList.remove(0);
        System.out.println(myList);
        myList.set(2,"gildong");
        System.out.println(myList);
//        for(int i=0;i<myList.size();i++){
//            System.out.print(myList.get(i));
//        }
        for (String a:myList){
            System.out.print(a+"/");
        }
        Iterator<String> itrinfo=myList.iterator();

        while(itrinfo.hasNext()){
            System.out.println(itrinfo.next());
        }
    }
}
