package day41_abstractClass_Interface;

public class GCorolla extends EToyota{
    @Override
    protected void kaporta() {
        /*
        GCorolla extends EToyota extends DAraba
        Grandparent DAraba'da 3 tane abstract method var.Bu methodlarin 1 tanesini
        parent olan EToyota'da concrete(abstract olmayan) etmistik.
        child olan GCorolla'ya geldigimizde parent Etoyota'da concrete ettigimiz methodu yazmak(implement etmek)
        zorunda degiliz
        ama parent'da concrete etmedigimiz diger 2 methodu yazmak zorundayiz.Kurallari en az bir class yapmali
         */

    }

    @Override
    protected void yakit() {

    }
    //burada obje uretecegimiz icin artik bu class'i abstract yapmiyoruz
    /*
    Corolla class'inin 2 tane parent'i var
    corollare parent'larinin ikisinin de standartlarina(abstract method) uymak zorundadir.
    (corolla parent'larinin ikisinde abstract methodlarini override etmek zorundadir)

    concrete bir class parent'i olan tum abstract classlrda abstract olan methodlari
    implement etmek(yerine getirmek,uygulamak) zorundadir
    Ancak parent silsilesinde override edilerek concrete yapilan methodlari override etmek zorunda DEGİLDİR
     */
}
