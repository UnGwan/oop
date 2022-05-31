package middle_report;

class Inbody_info{
    int age;
    String irum;
    private int height;
    private double weight;
    void info_all(int a, double b){
        this.height=a;
        this.weight=b;
    }
}

public class mysmg_capsul {
    public static void main(String[] args) {
        Inbody_info my_inbody= new Inbody_info();
        my_inbody.age = 30 ;
        my_inbody.irum = "홍길동";
        // my_inbody.height = 130; private로 인한 접근 불가
        my_inbody.info_all(180,64.5);
    }
}
