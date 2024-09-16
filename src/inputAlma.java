import java.util.Scanner;

public class inputAlma {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Lütfen yaşınızı giriniz..:");

        int yas = scanner.nextInt();

        System.out.println("Yaşınız: " + yas);

         */

        /*System.out.println("Lütfen sayı giriniz...:");

        double sayi = scanner.nextDouble();

        System.out.println("Sayı: " + sayi);

         */

        /*
        System.out.println("Lütfen bir yazı giriniz:");

        String yazi = scanner.nextLine();

        System.out.println("Yazı:" + yazi);

         */

        //eğer integer değer bekleyip kullanıcı bize yazı girerse ne olur
        if(scanner.hasNextInt()){
            int sayi = scanner.nextInt();
            System.out.println("Sayı: " + sayi);
        }
        else{
            System.out.println("Lütfen birayı giriniz..!");
        }


    }
}
