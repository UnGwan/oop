package middle_report;

import java.util.Scanner;

class Exchange_currency{
    //필드선언
    long kor_cache;
    private int ex_cache;
    private double ex_perrate;
    private String irum;

    //수수료 계산 메소드
    void calc_currency(int ex_kind){
        double con_rate=0.0;
        int result=0;
        switch (ex_kind){
            case 1:
                con_rate=0.0187;
                break;
            case 2:
                con_rate=0.017;
                break;
            case 3:
                con_rate=0.019;
                break;
        }
        result=info_currency(ex_kind);
        ex_perrate=result*con_rate;
        info_irum(ex_kind);
    }

    //환율 계산하여 리턴하는 메소드
    private int info_currency(int ex_kind){
        int kind = 0;
        switch (ex_kind){
            case 1:
                kind=1142;
                break;
            case 2:
                kind=1026;
                break;
            case 3:
                kind=1336;
                break;
        }
        ex_cache=kind;
        return kind;
    }
    // 환율 이름 표시 메소드
    private void info_irum(int a){
        String ex_irum="";
        switch (a){
            case 1:
                ex_irum="Us달러";
                break;
            case 2:
                ex_irum="엔화";
                break;
            case 3:
                ex_irum="유로화";
                break;
        }
        irum=ex_irum;
    }
    // 출력 결과를 표시하는 메소드.
    void calc_result(){
        long pay_cash;
        pay_cash=kor_cache/ex_cache;
        System.out.println("현찰금액"+kor_cache+"원");
        System.out.println("총 환전금액"+pay_cash+irum);
        System.out.println("총 환전수수료"+(ex_perrate*pay_cash));
    }
}



public class mymsg_capsulsample {
    public static void main(String[] args) {
        int num;
        long my_cache;
        System.out.println("환전할 번호를 입력하세요.(1-us달러, 2-엔화, 3-유로화");
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();
        System.out.println("환전할 금액을 입력하세요");
        Scanner sc1 = new Scanner(System.in);
        my_cache= sc1.nextLong();
        sc.close();
        sc1.close();
        Exchange_currency my_currency = new Exchange_currency();
        my_currency.kor_cache=my_cache;
        my_currency.calc_currency(num);
        my_currency.calc_result();

    }
}
