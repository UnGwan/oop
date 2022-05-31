public class my_String2 {
    public static void main(String[] args) {
        String str1="good python program";
        String str2=str1.substring(5);
        System.out.println("5번째 이후 문자열="+str2);
        String str3 = str1.replace("python","JAVA");
        System.out.println("변경 후 문자열"+str3);
        int i=str3.indexOf('J'); // 대소문자 구분함
        if(i==-1)
            System.out.println("no String");
        else
            System.out.println("해당문자는"+i+"에 위치하고 잇습니다");

    }
}
