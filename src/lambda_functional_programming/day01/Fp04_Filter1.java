package lambda_functional_programming.day01;

public class Fp04_Filter1 {

        /*
        2) filter() ;
        Dizimiz veya Collection’ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
        filtreleme işlemi yapmamıza yarayan bir yapıdır. Predicate arayüzünden türüyen bir parametre bekler.
        Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
        Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır. Örneğe bakalım;
         */
        //burada variable'larimizi olusturup Fp04_Filter2 class'inda obje oluturup orada bu variable'lari kullanalim

        private String marka;
        private String model;
        private String renk;
    private  int uretimYili;

    @Override
    public String toString() {
        return "Fp04_Filter1{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" +  + '\'' +
                ", uretimYili=" + uretimYili +
                '}';
    }

    public Fp04_Filter1() {
    }

    public Fp04_Filter1(String marka, String model, String renk, int uretimYili) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.uretimYili = uretimYili;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getMedel() {
        return model;
    }

    public void setMedel(String medel) {
        this.model = medel;
    }

    public String getRenk() {
        return renk;
    }

    public void setColr(String colr) {
        this.renk = colr;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }
}
