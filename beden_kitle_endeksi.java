
import java.util.Scanner;



public class main {
      public static void main(String[] args) {
        
   Scanner scnnr = new Scanner(System.in);
    
    System.out.println("BEDEN KİTLE ENDEKSİ HESAPLAMA PROGRAMINA HOŞ GELDİNİZ!");
         
        
        System.out.print("Lütfen kilonuzu bir tam sayı olarak giriniz: ");
        int kilo = scnnr.nextInt();
        
        
        
        System.out.print("Lutfen boyunuzu metre cinsinden giriniz (Örnek: 1,75) : ");
        double boy = scnnr.nextDouble();
        
        
        
        double endeks = kilo / (boy * boy);
        
        
        
        System.out.println("Kilonuz: " + kilo + " Boyunuz: " +boy );
        System.out.println("Beden kitle endeksiniz: " +endeks);
      }     
        
    
}
