import java.io.IOException;

public class Main {
    public static void main(String[] args) throws NullPointerException,NumberFormatException,ArithmeticException,IllegalArgumentException,ArrayIndexOutOfBoundsException, IOException, bebekIstisna {
        //ac("guluyor");
        try {
            ac("agliyor");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        try {
            uykusuz("agliyor");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        try {
            gazKontrol("agliyor");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        try {
            temizlikKontrol("agliyor");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            oyun("agliyor");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            faizHesapla(100,3);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            dis("agliyor");
        } catch (bebekIstisna e) {
            System.out.println(e.getMessage());
        }

    }
    public static void dis(String durum) throws bebekIstisna {
        if (durum.equals("agliyor")) {
            throw new bebekIstisna("HATA ! -> BEBEK DIS CIKARIYOR : ");
        } else {
            System.out.println("OK ! Bebek Modunda");
        }
    }
    public static void faizHesapla(double tutar,double oran) throws IOException{
        if (oran < 5) {
            throw new IOException(" Hata ! Oran %5 ten kucuk ");
        } else {
            System.out.println(tutar + tutar*oran/100);
        }
    }
    public static void ac(String durum) throws NullPointerException {
        if (durum.equals("agliyor")) {
            throw new NullPointerException("HATA ! -> BEBEK AC AC : ");
        } else {
            System.out.println("OK ! Bebek Modunda");
        }
    }

    public static void uykusuz(String durum) throws NumberFormatException{
        if (durum.equals("agliyor")) {
            throw new NumberFormatException("HATA ! -> BEBEK UYKUSUZ : ");
        } else {
            System.out.println("OK ! Bebek Modunda");
        }
    }

    public static void gazKontrol(String durum) throws ArithmeticException{
        if (durum.equals("agliyor")) {
            throw new ArithmeticException("HATA ! -> GAZLI BEBEK MASAJ YAP : ");
        } else {
            System.out.println("OK ! Bebek Modunda");
        }
    }

    public static void temizlikKontrol(String durum) throws IllegalArgumentException{
        if (durum.equals("agliyor")) {
            throw new IllegalArgumentException("HATA ! -> BEBEK ALTINI PISLETMİS : ");
        } else {
            System.out.println("OK ! Bebek Modunda");
        }
    }

    public static void oyun(String durum)throws ArrayIndexOutOfBoundsException{
        if (durum.equals("agliyor")) {
            throw new ArrayIndexOutOfBoundsException("HATA ! -> BEBEK OYUN ISTIYOR: ");
        } else {
            System.out.println("OK ! Bebek Modunda");
        }
    }

}
