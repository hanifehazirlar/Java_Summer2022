package day29_passByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
        Immutable :degistirilemez
        mutable : degistirilebilir

        en meshur immutable class : String
         */
        String str="Yildiz Bank";
        System.out.println(str.toUpperCase());// YILDIZ BANK
        str.toLowerCase(); // str atama yapilmadigi icin degisiklik yapmaz.Cunku java da String Immutable'dir
        System.out.println(str); // Yildiz Bank
        str.substring(3,5); // str atama yapilmadigi icin degisiklik yapmaz.Cunku java da String Immutable'dir
        System.out.println(str);  // Yildiz Bank

        // Java'da String gibi metin ifadelerde kullanabilecegimiz
        // mutable StringBuilder class'i da vardir

        StringBuilder sb=new StringBuilder("Java Bank");
        System.out.println(sb);// Java Bank
        sb.reverse();
        System.out.println(sb); // knab avaJ
        sb.append(3);
        System.out.println(sb); // knaB avaJ3



    }
}
