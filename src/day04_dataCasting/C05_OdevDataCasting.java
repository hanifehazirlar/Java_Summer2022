package day04_dataCasting;

public class C05_OdevDataCasting {
    public static void main(String[] args) {
        // 1-byte veri tipinde bir degisken olusturun, short,int,float ve
        // double data tiplerinde birer degisken olusturup adim adim widening yapin
        byte s1= 25; //25
        short s2=s1; //25
        int s3=s2;  // 25
        float s4=s3; // 25.0
        double s5= s4; // 25.0
        System.out.println("s1:"+s1+"\n"+"s2:"+s2+"\n"+"s3:"+s3+"\n"+"s4:"+s4+"\n"+"s5:"+s5);

        // 2-int veri türünde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
        int sayi1=125;
        short sayi2= (short) sayi1;
        byte sayi3=(byte)sayi2;
        System.out.println("sayi1:"+sayi1+"\n"+"sayi2:"+sayi2+"\n"+"sayi3:"+sayi3); //125

        // 3-float data turunde bir variable olusturun ve yazdirin
        float n1=2.345f;
        System.out.println("n1:"+n1); //2.345

        //4- double 255.36 sayisini int'a ve sonra da olusturdugunuz int sayiyi byte'a cevirip yazdirin
        double a1=255.36;
        int a2= (int) a1; // a2:255
        byte a3= (byte) a2; // a3: -1
        System.out.println("a1:"+a1+"\n"+"a2:"+a2+"\n"+"a3:"+a3); // a3:-1

        //Burada a3'un -1 çikmasinin sebebi byte'in aldigi degerler -128 ile 127 arasinda olmasidir.
        //Soruda verilen deger 255.36 a2'de int'a cevrilip 255 oldu, 255-->0'dan 127'e kadar geliyor(127 geldi)
        //sonra -128'e gidip ordan -1'e kadar(128 daha geldi) gelip toplamda 255 gitmis oldu.
        // O yuzden a3=-1 oluyor.

        // 5-int 2 sayiyi birbirine boldurun ve sonucu yazdirin
         int b1=25;
         int b2=12;
        System.out.println("int/int:"+b1/b2); //2

        // 6-int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
        int c1=30;
        double c2=2.4;
        System.out.println("int/double:"+c1/c2); // 12.5

        // 7- farklı data tipleri ile islem yapip, sonuclarini yazdiralım
        float d1=24.9f;
        int d2=4;
        double d3=10.3;
        System.out.println("float+int:"+(d1+d2)); // 28.9
        System.out.println("double/int:"+(d3/d2)); // 2.575
        System.out.println("float*double:"+d1*d3); // 256.469996...
        System.out.println("float/int:"+d1/d2); // 6.225





    }
}
