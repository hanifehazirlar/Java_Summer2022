package day27_staticKeyword;

public class C01 {

        static int sayi= 10;
        int rakam=5;
        public static void main(String[] args) {
        /*
        class level'da iki tur variable olusturabiliriz
          static (class) variable
          instance (obje) variable
        static variable'lar tum class'tan kullanilabilirken
        instance olanlar sadece static olmayan method'larda direk  kullanilabilir
        instance variable'lara static method'dan ulasmak istersek
        obje olusturmamiz gerekir.
        instance variable'lar obje variable'i oldugu icin
        herhangi bir satirda instance variable'in degerinin ne oldugunu bulmak icin
        OBJE OLUSTURULAN SATIRDAN itibaren kod incelenmelidir.

        static variable'lar class variable'i oldugu icin
        herhangi bir satirda static variable'in degerini bulmak icin
       CLASSIN BASINDAN itibaren kod incelenmelidir.
         */
            C01 obj1= new C01();
            System.out.println("obj1'in rakam degeri : " + obj1.rakam); //5
            System.out.println("obj1'in sayi degeri : " + obj1.sayi); // 10


            obj1.rakam+=1; // 5+1=6
            obj1.sayi+=1; // 10+1=11

            System.out.println("1 artirdiktan sonra obj1'in rakam degeri : " + obj1.rakam); // 6
            System.out.println("1 artirdiktan sonra obj1'in sayi degeri : " + obj1.sayi); // 11

            C01 obj2=new C01();

            System.out.println("obj2'in rakam degeri : " + obj2.rakam); // 5
            System.out.println("obj2'in sayi degeri : " + obj2.sayi); // 11

            obj2.rakam++; //5 + 1 =6
            obj2.sayi++;  // 11+ 1 =12

            System.out.println("1 artirdiktan sonra obj2'in rakam degeri : " + obj2.rakam); // 6
            System.out.println("1 artirdiktan sonra obj2'in sayi degeri : " + obj2.sayi); // 12

        

}
}

