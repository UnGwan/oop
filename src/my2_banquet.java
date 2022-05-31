public abstract class my2_banquet {
    public my2_banquet(){
        System.out.println("연회 전문 예약 원클릭 서비스");
    }
    protected int people;
    final int perpeople_cost=50000;
    final int deco_basic=3000;
    public void set_people(int people){
        this.people = people;
    }
    public abstract long calcdeco_cost();
    public abstract void calctot_cost();

}