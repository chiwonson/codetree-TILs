public class Main {
    public static void main(String[] args) {
        double ft = 30.48;  
        double mi = 160934; 
        double feetValue = 9.2;
        double milesValue = 1.3;

        double feetInCm = feetValue * ft;
        double milesInCm = milesValue * mi;

        String feetOutput = String.format("%.1f", feetInCm);
        String milesOutput = String.format("%.1f", milesInCm);

        System.out.println(feetValue + "ft = " + feetOutput + "cm");
        System.out.println(milesValue + "mi = " + milesOutput + "cm");
    }
}