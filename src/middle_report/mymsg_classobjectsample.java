package middle_report;

import java.util.Date;

class Goods{
    //필드선언
    String irum;
    String import_data;

    void info_goods(){
        System.out.println("입고 상품명="+irum);
        System.out.println("입고 일자="+import_data);
    }
}

public class mymsg_classobjectsample {
    public static void main(String[] args) {
        Date today = new Date();
        Goods my_goods= new Goods();
        Goods my_goods2= new Goods();
        my_goods.irum="미백크림";
        my_goods.import_data=today.toString();
        //my_goods.info_goods();
        my_goods2=my_goods;
        my_goods2.info_goods();
    }
}
