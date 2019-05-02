
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Scanner scnnr = new Scanner(System.in);
        
        System.out.print("Lutfen üçgenin dik kenarlarından ilkini giriniz: ");
        int a = scnnr.nextInt();
        
        System.out.print("Lutfen üçgenin dik kenarlarından ikincisini giriniz: ");
        int b = scnnr.nextInt();
        
        double hipotenus = Math.sqrt(a*a + b*b);
        
        System.out.println("Ücgenin hipotenus uzunluğu: " + hipotenus);
        
    }
}
