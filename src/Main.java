import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  double matematik, fizik, kimya, turkce, tarih, muzik;
  Scanner intscanner = new Scanner(System.in);
  System.out.print("Matematik notunuzu giriniz: ");
  matematik = intscanner.nextInt();
  System.out.print("Fizik notunuzu giriniz: ");
  fizik = intscanner.nextInt();
  System.out.print("Kimya notunuzu giriniz: ");
  kimya = intscanner.nextInt();
  System.out.print("Türkçe notunuzu giriniz: ");
  turkce = intscanner.nextInt();
  System.out.print("Tarih notunuzu giriniz: ");
  tarih = intscanner.nextInt();
  System.out.print("Müzik notunuzu giriniz: ");
  muzik = intscanner.nextInt();

  float ort = (float) ((matematik + kimya + fizik + tarih + turkce + muzik) / 6);
  System.out.println("Ortalamanız: " + ort);
  boolean gecis = ort >= 60;
  String str = gecis ? "Gecti" : "Kaldi";
  System.out.println(str);
 }
}
