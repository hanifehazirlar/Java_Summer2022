package day04_dataCasting;

public class Co6_Odev {
    public static void main(String[] args) {
      // 1-
        byte sayi1=10;
        short sayi2=sayi1;
        int sayi3=sayi2;
        float sayi4=sayi3;
        double sayi5=sayi4;
        System.out.println("sayi1:"+sayi1+"\n"+"sayi2:"+sayi2+"\n"+"sayi3:"+ sayi3+"\n"+"sayi4:"+sayi4+"\n"+"sayi5:"+sayi5);

        // 2-
        int a1=100;
        short a2=(short)a1;
        byte a3 = (byte)a2;
        System.out.println("a1:"+a1+"\n"+"a2:"+a2+"\n"+"a3:"+a3);

        // 3-
        float b=12.8f;
        System.out.println("b:"+b);

        //4-
        double c1=255.36;
        int c2= (int) c1;
        byte c3= (byte) c2;
        System.out.println("c1:"+c1+"\n"+"c2:"+c2+"\n"+"c3:"+c3);

        //5-
        int d1=35;
        int d2=15;
        System.out.println("int/int:"+d1/d2);

        // 6-
        int e1=200;
        double e2=25.2;
        System.out.println("int/double:"+e1/e2);

        // 7-
        byte f=15;
        short g=45;
        int h=170;
        float i=15.5f;
        double j=5.6;
        System.out.println("byte/short:"+f/g);
        System.out.println("int/float:"+h/i);
        System.out.println("double/byte:"+j/f);








    }
}
