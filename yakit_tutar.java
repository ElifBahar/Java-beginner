
import java.util.Scanner;


public class main {
    
    public static void main(String[] args) {
        
        System.out.println("Bu program aracınızın yaklaşı yakıt tutarını hesaplar..");
        
        Scanner scnnr = new Scanner(System.in);
        
        System.out.print("Aracınızın kilometre başına ne kadar yaktığını giriniz (Örnek: 0,50)  : ");
        
        double birim = scnnr.nextDouble();
        
        System.out.print("Lutfen gitmeniz geeken kilometreyi bir tamsayi olarak giriniz (Örnek: 100)   : ");
        
        int km = scnnr.nextInt();
        
        double tutar = km*birim;
        
        System.out.println("Yaklaşık yakıt masrafınız: " + tutar +" TL");
        
    }
    
}
