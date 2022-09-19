package day43_interfaces_iteretors;

public class M02_Child implements I01_interfaceBodyOlanMethod{
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    parent interface'de abstract olan 3 method'u implement ettigimizde
    java itirazini durdurur.
    Sonradan ekledigimiz default veya static keyword ile tanimladigimiz
    method 'lari implement etmememiz sorun olusturmaadi
     */
    public static void main(String[] args) {
        I01_interfaceBodyOlanMethod.direksiyon(); //static...Tum arabalarin direksiyonu vardir



        M02_Child obj1=new M02_Child();
        //default olan body'li olan method'a ulasabilmek obje olusturduk(statik olmadigi icin)
        obj1.teker(); //default...tum arabalarin tekeri vardir
        obj1.yakit(); //body içleri bos oldugu icin bir sey yazdirmadi
        I01_interfaceBodyOlanMethod obj2=new M02_Child();
        obj2.teker(); //default...tum arabalarin tekeri vardir
        System.out.println(obj2.aku());//null




    }
}
