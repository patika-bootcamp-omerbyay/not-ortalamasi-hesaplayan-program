import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Kullanıcıdan veri almak için Scanner nesnesi oluşturuyoruz
        Scanner input = new Scanner(System.in);

        // Ders notlarını tutacağımız değişkenleri tanımlıyoruz
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Kullanıcıdan sırasıyla ders notlarını istiyoruz
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        // Notların toplamını hesaplıyoruz
        int toplam = mat + fizik + kimya + turkce + tarih + muzik;

        // Ortalamayı ondalıklı (double) olarak hesaplamak için 6.0'a bölüyoruz
        double ortalama = toplam / 6.0;
        System.out.println("\nNot Ortalamanız: " + ortalama);

        // Ternary Operatörü ile koşul kontrolü yapıyoruz
        // Mantık: (Koşul) ? "Doğruysa Çalışacak Kısım" : "Yanlışsa Çalışacak Kısım";
        String durum = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        // Sonucu ekrana yazdırıyoruz
        System.out.println(durum);

        // Scanner'ı kapatıyoruz (İyi bir programlama pratiği olarak)
        input.close();

    }
}
