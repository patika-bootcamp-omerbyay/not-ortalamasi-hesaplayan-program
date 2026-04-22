# not-ortalamasi-hesaplayan-program
Java - Not Ortalaması Hesaplayan Program

Programın Çıktı Örneği

Örnek 1: Sınıfı Geçme Durumu

    Matematik notunuzu giriniz: 70
    Fizik notunuzu giriniz: 65
    Kimya notunuzu giriniz: 80
    Türkçe notunuzu giriniz: 55
    Tarih notunuzu giriniz: 90
    Müzik notunuzu giriniz: 100

    Not Ortalamanız: 76.66666666666667
    Sınıfı Geçti

Örnek 2: Sınıfta Kalma Durumu

    Matematik notunuzu giriniz: 40
    Fizik notunuzu giriniz: 30
    Kimya notunuzu giriniz: 50
    Türkçe notunuzu giriniz: 60
    Tarih notunuzu giriniz: 45
    Müzik notunuzu giriniz: 80

    Not Ortalamanız: 50.833333333333336
    Sınıfta Kaldı

Önemli Detaylar:

  toplam / 6.0 Kullanımı: Eğer toplam / 6 yapsaydık, Java iki tam sayıyı böldüğü için ondalıklı kısmı atar ve sonucu tam sayı olarak verirdi. Hassas bir ortalama hesabı için bölen sayıyı 6.0 (double) olarak belirttik.

  Ternary Operatörü (? :): if-else bloklarının tek satırlık ve daha şık halidir. (ortalama > 60) koşulu true (doğru) üretirse soru işaretinden sonraki ilk değer ("Sınıfı Geçti"), false (yanlış) üretirse iki noktadan sonraki değer ("Sınıfta Kaldı") durum değişkenine atanır.
