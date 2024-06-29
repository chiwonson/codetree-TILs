public class Main {
    public static void main(String[] args) {
        double a = 5.26;  
        double b = 8.27; 
        double result = a * b;

        String answer = String.format("%.3f", result);

        System.out.println(answer);
    }
}