package SoruBankası;

public class C01 {
    // Kişi adları için 3 String değişken oluşturun.
    // Boşluk karakterleri hariç tüm 3 addaki karakter sayısının toplamını yazdırın.
    public static void main(String[] args) {
        String name1="Esma Gul";
        String name2="Salih Eren";
        String name3="Oguz hamza";
        name1=name1.replaceAll("\\s","");
        name2=name2.replaceAll("\\s","");
        name3=name3.replaceAll("\\s","");
        int toplam=name1.length()+name2.length()+name3.length();
        System.out.println("Karakterler toplami : " + toplam);

    }
}
