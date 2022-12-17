import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        int number;
        double result=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kaçıncı Harmonik sayıyı istediğinizi yazınız: ");
        number = input.nextInt();
        for (double i=1;i<=number;i++){
            result+=(1.0/i);
            System.out.println(i+". Harmonik Sayı: "+result);
        }
    }
}