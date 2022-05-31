
class super_sample{
    private String irum;
    public super_sample(){
        System.out.println("여기는 슈퍼 클래스입니다.");
    }
    public super_sample(String irum){
        this.irum = irum;
        System.out.println(irum+"님 안녕하세연");
    }
    public void roan_info(String place_in){
        if(place_in == "서울 강남3구"||place_in=="서울"||place_in=="과천") System.out.println("투기과열지역");
        else System.out.println(irum+"님의 지역은 일반 지역입니다.");
    }
}
class child_sample extends super_sample{
    public child_sample(){
        //super();
        System.out.println("여기는 서브 클래스입니다.");
    }
    public child_sample(String irum){
        super(irum);
        System.out.println("여기는 서브 클래스입니다.");
    }
}


public class inheritconstructor {
    public static void main(String[] args) {
        child_sample mychild = new child_sample();
//        child_sample mychild1 = new child_sample("홍길동");
        mychild.roan_info("서울");
//        mychild1.roan_info("강원");
    }
}
