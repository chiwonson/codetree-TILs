import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next(); // 문자열 입력
        String s = sc.next(); // 문자열 입력
        String temp;

        temp = s;
        s = t;
        t = temp;

        temp = t;
        t = s;
        s = temp;
        
        System.out.println(s);
        System.out.println(t);
    }
}