package day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogretmen1=new Ogretmen();
        System.out.println("Ogretmen 1 "+ogretmen1);

        Ogretmen ogretmen2=new Ogretmen("Emre", "Akdogan","1/1/2001", "Matematik","Fizik");
        System.out.println("Ogretmen 2 "+ogretmen2);

        Ogretmen ogretmen3=new Ogretmen("Hanife","Hazirlar","04/06/1982");
        System.out.println("Ogretmen 3 " + ogretmen3);
    }
}
