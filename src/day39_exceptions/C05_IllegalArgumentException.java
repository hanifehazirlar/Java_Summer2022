package day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    // Soru: Kullanicidan yasini girmesini isteyin.
    // Kodunuzu kullanici sifirdan kucuk bir
    // sayi girerse Exception verecek sekilde yazin.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println( "Yasinizi giriniz");
        int yas=scan.nextInt();

         // throw new yazdiktan sonra Exceptionlar cikar ve bu exceptionlardan istedigimizi throw ile firlatabiliriz
        //Asagida if else blogunun hepsini secip try catch cagirdik

        try {
            if (yas<0){
                throw new IllegalArgumentException();
            }else{
                System.out.println("Yasiniz : "+yas);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("Yas sifirdan kucuk olamaz"); // out yerine err yazarsak sout
                                                            // icindeki yaziyi kirmizi yazar
        }
    }
}
