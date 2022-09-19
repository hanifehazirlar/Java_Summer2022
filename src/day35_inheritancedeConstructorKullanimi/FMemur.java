package day35_inheritancedeConstructorKullanimi;

public class FMemur extends Emuhasebe {
    /*
    Extends keyword kullanilan classlarda
      ister default consructor bulunsun
      istersek de biz yeni constructor(lar) olusturalim
      Java constructor'in ilk satirina
      super(); constructor call yazar

      super(); constructor call, default constructor'a benzer
      gorunmese de orada vardir ve calisir
      ancak biz ilk satira farkli bir constructor call yazarsak
      Java super(); 'i siler

      Eger biz mudahale edip kendi constructor call'umuzu olusturmazsak
      Javanin default olarak olusturdugu constructor call
      her zaman parametresizdir
      super();
     */
    FMemur() {
        // Burada gorunmeyen Super(); var
        System.out.println("Memur parametresiz constructor");
    }
    FMemur(String isim) {
        // Burada gorunmeyen Super(); var
        System.out.println("Memur parametreli constructor");
    }

    public static void main(String[] args) {
        FMemur memur1=new FMemur("ali");
    }
}
     /*
    default (gorulmeyen) super(){} constructor'in
    parametrelisi yoktur.
     Tipki default conctructor' in parametrelisi
     olmadigi gibi
      */