package middle_report;

class Mycoffee{
    String irum;
    int price;
    void prin_info(String irum,int price){
        System.out.println("입력한 커피 = "+irum);
        System.out.println("가격 = "+ price);
    }
}

public class mymsg_classsample {
    public static void main(String[] args) {
        Mycoffee my1= new Mycoffee();
        Mycoffee my2= new Mycoffee();
        my1.prin_info("아메리카노",5500);
        my2.irum="카페라뗴";
        my2.price=7700;
        my2.prin_info(my2.irum,my2.price);
    }
}
