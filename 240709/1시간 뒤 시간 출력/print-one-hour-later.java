import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String input = sc.next();
         String[] nums = input.split(":");
         int h = Integer.parseInt(nums[0]);
         int m = Integer.parseInt(nums[1]);
         System.out.println((h + 1) + ":" + m);
     }
}