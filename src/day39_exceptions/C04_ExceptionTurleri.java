package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {
        String str;
        /*
        System.out.println(str);
        ilk deger atamasi yapmadan bir variable'i kullanmaya calisirsaniz
        Java Compile Time'da bunu farkeder ve size izin vermez
         */
        str=null; //sonra deger atarim
       // System.out.println(str.length()); //null atanmis variable' a method cagirmak istesek
                                         // NullPointerException Run Time da hata verir
        Object obj="Java Java";
        Integer sayi=(Integer)obj;//Object daha genis data turu Integer daha dar oldugu icin data casting yaptik ama
        //Java burada sorun cikarmiyor olabilir diyor calistirdigimizda Run Time Error veriyor
        /*
        String str2="Hava Civa";
        Integer sayi2=str2;
        Java bazi casting islemlerine compile time'da izin vermez (19.satirda oldugu gibi)
        Ancak bazen syntex uygun olabilir 15.satirda oldugu gibi)
        bu durmda java kodun calismasina itiraz etmez
         */
        Thread.sleep(5000); // burada sleep'in alti kirmizi cizgi var. Ustune gelip
        // add exception to method signature bastigimizda
        // main' e throws InterUptedException'i ekleyip hatayi kaldirir


    }
}
