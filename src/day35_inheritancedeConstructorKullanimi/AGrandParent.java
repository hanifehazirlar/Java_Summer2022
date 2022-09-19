package day35_inheritancedeConstructorKullanimi;

public class AGrandParent {
    protected String isim="Granpa ismi belirtilmedi";
    /*
    Her class'da gorunmese de default constructor vardır.
    Bu class'dan bir obje olusturmak istedigimizde
    default constructor devreye girecektir

    Default constructor'in calisip calismadigini gozlemleyemedigimiz icin onun yerine
    parametresiz bir constructor olustururuz.
     */
    protected String grandpaKlupAdi="Granpa Klubu";
    AGrandParent (){
        System.out.println("Granpa constructor calisti");
    }

}
