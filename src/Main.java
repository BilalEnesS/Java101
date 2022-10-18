import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        double km, sabit;
        sabit = 10;
        System.out.print("Kaç km gideceğinizi giriniz: ");
        km = input.nextInt();
        double ucret = sabit + (km*2.2);
        ucret = (ucret < 20) ? 20 : ucret;
        System.out.println("ödeyeceğiniz ücret:" + ucret);
    }
}