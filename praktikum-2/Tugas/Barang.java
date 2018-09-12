public class Barang{
    public static void main (String [] args){
        //casting implisit
        System.out.println("PROGRAM MENGHITUNG TOTAL PENJUALAN");
        System.out.println("\nDaftar barang yang terjual\t:");
        System.out.println("Ultramik\t:5000x2");
        System.out.println("Indomie\t\t:2500x2");
        System.out.println("Cadbury \t:15000x1");
        System.out.println("Silverqueen \t:20000x1");
        System.out.println("Pop Mie\t\t:5000x2");
        //implisit
        int indomie=2;
        float i=indomie=2;
        int ultramik=2;
        float u=ultramik;
        int cadbury=1;
        float c=cadbury;
        int popmie=2;
        float p=popmie;
        int silverqueen=1;
        float s=silverqueen;

        //eksplisit
        double uang=100000;
        float ug= (float) uang;

       
        float b =
        (u*5000F)+(i*2500F)+(c*15000F)+(s*20000F)+(p*5000F);
        System.out.println("\nUang yang dibayarkan\t: "+ug);

        Float kembalian = ug-b;
        System.out.println("Kembaliannya sebesar\t:"+kembalian);

    }
}