import java.util.Scanner;

/**
 * @author Ayşe Memiş
 * @since 1.0.0
 */
public class HesapMakinesiUygulamasi {
    public static void main(String[] args) {
        int n1;
        int n2;
        int s;


        Scanner hsp = new Scanner(System.in);

        System.out.print("1.sayıyı giriniz :");
        n1 = hsp.nextInt();

        System.out.print("2.sayıyı giriniz :");
        n2 = hsp.nextInt();

        System.out.println("1-toplama");
        System.out.println("2-çıkarma");
        System.out.println("3-çarpma");
        System.out.println("4-bölme");

        int toplama = n1 + n2;
        int cikarma = n1 - n2;
        int carpma = n1 * n2;
        int bolme = n1 / n2;

        System.out.print("Seçiminiz:");
        s = hsp.nextInt();
        System.out.println(s);

    /*    if (s == 1) {
            System.out.println("toplama:");
            System.out.println(toplama);
        } else if (s == 2) {
            System.out.println("çıkarma:");
            System.out.println(cikarma);
        } else if (s == 3) {
            System.out.println("çarpma:");
            System.out.println(carpma);
        } else if (s == 4) {
            if (n2 != 0) {
                System.out.println("bölme:");
                System.out.println(bolme);
            } else {
                System.out.println("Payda sıfır olamaz!");
            }

        } else {
            System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
        }
*/
            switch (s) {
                case 1:
                    System.out.println("toplama");
                    System.out.println(toplama);
                    break;
                case 2:
                    System.out.println("çıkarma");
                    System.out.println(cikarma);
                    break;
                case 3:
                    System.out.println("çarpma");
                    System.out.println(carpma);
                    break;
                case 4 :
                    if (n2 !=0) {
                        System.out.println("bölme");
                        System.out.println(bolme);

                    }else{
                        System.out.println("işlem başarısız!");
                    }
                    break;
                default:
                    System.out.println("tekrar deneyiniz.");

            }


    }
}
