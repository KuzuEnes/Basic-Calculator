import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Kilonuzu Girin: ");
        int kilo = scanner.nextInt();
        System.out.println("Boyunuzu Girin:(Örnek : 1,72) ");
        double boy = scanner.nextDouble();

        double bki = kilo / (boy * boy);
        System.out.println("Beden Kitle Indeksiniz : " + bki);
        if (bki < 18.5){
            System.out.println("Beden Kitle Indeksin İdeal Kilonun Altında!!");
        } else if ((bki > 18.5) && (bki < 24.9)) {
            System.out.println("Beden Kitle Indeksin İdeal Kiloda!!");
            
        } else if ((bki > 25) && (bki < 29.9)) {
            System.out.println("Beden Kitle Indeksin İdeal Kilonun Üstünde!!");
            
        }
        else if ((bki > 30) && (bki < 39.9)){
            System.out.println("Beden Kitle Indeksin İdeal Kilonun Çok Üstünde Dikkatli Ol!!");
        }
        else {
            System.out.println("Beden Kitle Indeksin Aşırı Yüksek Kilo Vermelisin!!");
        }
    }
}