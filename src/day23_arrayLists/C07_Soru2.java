package day23_arrayLists;

public class C07_Soru2 {
    public static void main(String[] args) {
        // Soru 2)verilen bir array deki uniqe elementleri
        // yeni bir array olarak donduren method olusturun
        String [] isimler={"Erdal","Mihrican1","Onur","Mihrican1","Mehmet","Hayrullah","Hayrullah","Mihrican1","Hayrullah"};
        String [] uniqe=tekrarEtmeyen(isimler);
    }

   public static String[] tekrarEtmeyen(String [] isimler) {
       String uniqe = "";
       for (int i = 0; i < isimler.length; i++) {
           for (int j = 1; j < isimler.length; j++) {

           }
       }
       return tekrarEtmeyen(isimler);
   }



}

