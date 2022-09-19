package day11_stringManipulation;

public class C02_lastIndexof {
    public static void main(String[] args) {
        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";
        /* Soru 2) verilen kelime icin asagidaki sartlardan uygun olani yazan bir program yaziniz
           -verilen kelime cumlede kullanilmamis
           -verilen kelime cumlede sadece 1 kere kullanilmis
           -verilen kelime cumlede birden fazla kullanilmis
         */
        int kelimeIlkIndex=cumle.indexOf(kelime);

        int kelimeSonIndex=cumle.lastIndexOf(kelime);
        System.out.println(kelimeIlkIndex); // 0
        System.out.println(kelimeSonIndex); // 16
        if(kelimeIlkIndex==-1){
            System.out.println("verilen kelime cumlede kullanilmamis");
        }else if(kelimeIlkIndex==kelimeSonIndex){
            System.out.println("verilen kelime cumlede sadece 1 kere kullanilmis");
        }else{
            System.out.println("verilen kelime cumlede 1'den fazla kullanilmis");
        }
    }
}
