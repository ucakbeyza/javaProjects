import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //ekrana hello world yazdırma
        System.out.println("Hello World");
        /*
         * çok satırlı yorum yazma örneği
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz:");
        int yas = scanner.nextInt();
        System.out.println("Yaşınız: " + yas);
    }
}