package middle_report;

public class mymsg_arraysample {
    public static void main(String[] args) {

//        String[] coffee = new String[3];
//        coffee[0]="아메리카노";
//        coffee[1]="카페라뗴";
//        coffee[2]="카페모카";
//
//        for(String i: coffee) System.out.println(i);

//        int [][] myprice = new int[][] {{3500,4000,4500},{9500,4500,5500}};
//        for (int i=0;i<myprice.length;i++){
//            for (int j=0;j<myprice[0].length;j++){
//                System.out.printf("%7d",myprice[i][j]);
//            }
//            System.out.println();
//        }
        int [][] myprice = new int[][] {{3500,4000,4500},{9500,4500,5500}};
        for (int i[]:myprice){
            for (int j:i){
                System.out.printf("%7d",j);
            }
            System.out.println();
        }
    }
}
