
class info_sample{
    public info_sample(int a, int b){
        System.out.println("입력한 정보로 셋팅합니다.");
        cost = a;
        people = b;
    }
    public  info_sample(){
        System.out.println("가격 freeday");
    }
    public info_sample(String goods_irum){
        System.out.println(goods_irum+"는 20000원 균일가 입니다.");
    }
    private int cost;
    private int people;
    public void prn_calc(){
        System.out.printf("1인당 가격 = %d 전체가격=%d",cost,people*cost);
    }
}

public class my2_constructorsample {
    public static void main(String[] args) {
        info_sample mycost = new info_sample(5000,2);
        info_sample mycost1 = new info_sample();
        info_sample mycost2 = new info_sample("블루베리 치즈케익");
        mycost.prn_calc();
    }
}
