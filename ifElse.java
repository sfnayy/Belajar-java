import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukan angka
        System.out.println("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        //logika if-else
        if (angka > 0) {
            System.out.println(angka + " adalah angka positif.");
        }else if (angka < 0){
            System.out.println(angka + " adalah angka negatif.");
        }else{
            System.out.println(angka + " adalah angka nol");
        }

        input.close();
    }
    
}
