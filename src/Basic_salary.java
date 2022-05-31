public class Basic_salary {
    int work_time;
    protected long work_pay=13000; // 외부 접근 차단. -> protected 사용
    protected void day_pay(){
        System.out.println("일 급여액="+(work_time*work_pay));
    }
}
