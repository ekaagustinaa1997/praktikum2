import java.util.Scanner;
public class Segitiga{
    public static void main(String[]args){

        int alas,tinggi;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Program Segitiga");
        System.out.println("\n\nMasukkan alas\t: ");
        alas = keyboard.nextInt();
        System.out.println("\n\nMasukkan tinggi\t: ");
        tinggi = keyboard.nextInt();
        float total = alas*tinggi/2F;
        System.out.println("\n\nLuas Segitiga adalah "+total);
    }
}