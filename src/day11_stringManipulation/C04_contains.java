package day11_stringManipulation;

public class C04_contains {
    public static void main(String[] args) {
    /*
       Soru 2) kullanicidan bir cumle isteyin
       Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
       "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
       iki kelimeyi de icermiyorsa "Cumle kucuk ya da buyuk kelimesi icermiyor" yazdirin.
        */
    String cumle ="Java buyuk, dunya kucuk";
    cumle=cumle.toLowerCase();
    // requirements'de buyuk harf kucuk harf hassasiyeti hakkinda bir şey soylenmemis
    // ikinci olarak da her iki kelimeyi de icerme durumu aciklanmamis

    // ek requirements: ikisini de iceriyorsa"Karar ver buyuk mu yazdirayim, kucuk mu?
    // case sensitive olmasin
    if (cumle.contains("kucuk") && cumle.contains("buyuk")){
        System.out.println("karar ver buyuk mu yazdirayim, kucuk mu? ");
    }else if (cumle.contains("kucuk") ){
        System.out.println(cumle.toLowerCase());
    }else if (cumle.contains("buyuk") ){
        System.out.println(cumle.toUpperCase());
    }else{
        System.out.println("Cumle kucuk ya da buyuk kelimesi icermiyor");
    }
    }

}
