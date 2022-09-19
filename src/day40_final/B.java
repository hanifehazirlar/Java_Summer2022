package day40_final;

public class B extends A{
    public static void main(String[] args) {
        B obj = new B();
        obj.isim="Alp";
        // obj.okul="Java Koleji"; // B class'inin parent'i olan A class'indan okul variable'ini
                               // deger atamasi yapmak istedik ama okul variable'i final oldugu icin atama yapamadik

        System.out.println(A.OKUL); // Wrapperclasslar gibi(A class'indan final olan OKUL degerini getir)
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        /*
        bir class final olarak belirlenirse,
        o class inherit edilemez
        */

    }
}
