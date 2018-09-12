public class DemoCasting{

    public static void main(String[] args){
        // casting implisit
        byte b = 100;
        int i = b;

        //casting eksplisit
        int x = 1000;
        byte y = (byte) x;
        System.out.println("Casting byte y : " + y);

        double j = 10.5;
        int k = (int) j;
        System.out.println("Casting byte k : " + k);

        j = 10.2;
        int j = (int) j;
        System.out.println("Casting byte j : " + j);

        j = 10.2;
        short m = (short) j;
        System.out.println("Casting byte m : " + m);
    }
}