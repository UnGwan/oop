public class Night_salary extends Basic_salary{
    long danger_pay = 50000;
    long special_pay = 17000;
//    public void night_work(){
//        //부모 클래스의 메소드 호출
//        super.day_pay();
//        System.out.println("야간 총 급여액="+(danger_pay+special_pay));
//    }
    //day_pay 메소드 오버라이딩.
    public void day_pay(){
        long night_allpay = danger_pay+special_pay;
        System.out.println("야간 근무 포함 일 급여액="+(work_time+night_allpay));
    }
}
