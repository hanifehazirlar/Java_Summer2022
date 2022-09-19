package day42_abstractClass_Interface;

public class K_ChildClassOfinterFaces implements I02_Interfaces,I03_Interfaces{

    // Bir class'i bir interface'lere child yapmak icin; class adinin sagına implements ekledik ve devaminda
    // bu class'a implements edilecek Interface'leri sectik.Aralarina virgul koyarak istedigimiz kadar
    // Interface ekleyebiliriz.
    public static void main(String[] args) {
        System.out.println(I02_Interfaces.SAYI);//20
        System.out.println(I03_Interfaces.SAYI);//30
        // hem I02'de hem I03'de SAYI adinda int variable oldugu icin sorun cıkıyor
        // bu sorunu cozmek icin variable adinin onunde interface'in adini yaziyoruz
        // sadece bir interface'inde varsa o zaman bu sorun cıkmaz
        System.out.println(STR);
    }

    @Override
    public void yakit() {

    }
    @Override
    public void motor() {
    }

    @Override
    public void teker() {

    }
}
