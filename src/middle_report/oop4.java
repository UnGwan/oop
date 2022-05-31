import java.util.Scanner;

public class oop4 {
    public static void main(String[] args) {
       // 이중 for문
//        for (int i=1;i<=5;i++)
//        {
//            for (int j=1;j<=6-i;j++)
//            {
//                System.out.printf("%4d",j);
//            }
//            System.out.printf("\n");
//        }
//        int arr [] = {1,2,3,4,5,6,7};
//        int sum=0;
//        for(int a: arr)
//        {
//            sum+=a;
//            System.out.printf("%3d",a);
//        }
//        System.out.printf("%3d",sum);

//        int sum=0;
//        for (int i=1;i<=50;i++)
//            sum+=i;
//        System.out.printf("%d",sum);

//        int i =1,sum=0;
//        while(i<=50)
//        {
//            sum+=i;
//            i++;
//        }
//        System.out.println(sum);

        //무한 루프 break.
//        boolean a=true;
//        int cnt =1;
//        while(a)
//        {
//            System.out.println(cnt+"회 반복작업");
//
//            if(cnt==10) break;
//            cnt++;
//        }

//        int i=1, sum=0;
//        while(true)
//        {
//            sum+=i;
//            if(sum>=1000) break;
//            i++;
//        }
//        System.out.println("1000까지 i의 수:"+i+" 총합:"+sum);

//        int sum=0;
//        while (true)
//        {
//            Scanner sc = new Scanner(System.in);
//            int num = sc.nextInt();
//            if(num==0) break;
//            if(num%5 !=0) continue;
//            sum+=num;
//        }
//        System.out.println(sum);

//        int sum=0,num;
//        do {
//            Scanner sc =new Scanner(System.in);
//            num = sc.nextInt();
//            sum+=num;
//        }while (num%5==0);
//        System.out.println("5의배수 합계는:"+sum);

        //실습 1
//        int start,end,num,sum=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("시작값:");
//        start =sc.nextInt();
//        System.out.print("끝값");
//        end =sc.nextInt();
//        System.out.print("배수:");
//        num =sc.nextInt();
//        while(start<=end){
//            if(start%num==0) sum+=start;
//            start++;
//        }
//        System.out.println("합계는"+sum);

//        String [] coffee ;
//        coffee = new String[3];
//        coffee[0]="아메리카노";
//        coffee[1]="카페라뗴";
//        coffee[2]="카페모카";
//        for (int i=0;i<coffee.length;i++){
//            System.out.println(coffee[i]);
//        }


        //실습 1
//        String str;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("문자열을 입력 : ");
//        str= sc.nextLine();
//
//        int i=0,a=0,b=0,c=0;
//        while(i<str.length()){
//            if(Character.isUpperCase(str.charAt(i))) a+=1;
//            else if(Character.isLowerCase(str.charAt(i))) b+=1;
//            else if(Character.isDigit(str.charAt(i))) c+=1;
//            i++;
//        }
//        System.out.println("대문자:"+a+"소문자:"+b+"숫자:"+c);
        //실습2

        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력 : ");
        str= sc.nextLine();

        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }


    }
}
