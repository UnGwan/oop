import java.util.Scanner;

public class my2_banquettest {

    public static void main(String[] args) {
        int gubun,person;
        String cakeKind;
        System.out.println("예약하실 연회의 종류를 선택해요.(1.워크샵/세미나,2.생일파티/기념)");
        Scanner sc1 = new Scanner(System.in);
        gubun= sc1.nextInt();
        System.out.println("모임인원을 입력하세요");
        Scanner sc2 = new Scanner(System.in);
        person = sc2.nextInt();
        if (gubun==1){
            workshop mywrokshop = new workshop();
            mywrokshop.set_people(person);
            mywrokshop.calctot_cost();
        }
        else if(gubun==2){
            System.out.println("생일때 사용하실 케익의 종류를 선택하세요.(루비/사파이어/다이아몬드 중 선택)");
            Scanner sc3 = new Scanner(System.in);
            cakeKind = sc3.next();
            birthday mybirthday= new birthday();
            mybirthday.set_people(person);
            mybirthday.calc_cake(cakeKind);
            mybirthday.calctot_cost();
        }

    }
}
