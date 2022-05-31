
abstract class banquet {
    protected String res_irum;
    protected int res_inwon;
    public void res_info(String irum,int res_inwon){

        this.res_irum=irum;
        this.res_inwon=res_inwon;
    }
    public abstract void toy_pay(int basic_cost,int use_cost); // 상속받은 애들은 필수적으로 구현 해야 함
}
class birth_party extends banquet {
    public void toy_pay(int basic_cost,int use_cost){
        int pay_calc=0;
        pay_calc=basic_cost*res_inwon+use_cost+20000;
        System.out.println(pay_calc);
    }

}
class work_shop extends banquet{
    public void prn_1(){
        System.out.println("워크숍입니다.");
    }
    public void toy_pay(int basic_cost,int use_cost){

    }
}
public class my2_abstract {
    public static void main(String[] args) {
//        banquet mybanquet = new banquet(); 상속만 가능
        birth_party myBirth = new birth_party();
        myBirth.res_info("길동",8);
        myBirth.toy_pay(18000,100000);
    }
}
