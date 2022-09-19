package day33_encapsulation;

public class Araba {
    String marka="Marka belirtilmedi";// marka'nin access modifier'i default access modifier
                                     // oldugundan, package icerisinde kullanilabilir
    private String model="Model belirtilmedi";//model atanmamıs bu yuzden deger atansin ama gorulmesin
                                             // yani setter() yapmaliyiz
    private String yakit="Elektrikli"; // tum arabalar elektrikli ise bu variable'in degistirilmemesi lazim.
                                      // Bu yüzden bunu getter() yappalıyız
    // private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim
    // model'e deger atanabilsin ama gorulemesin(setter)
    // yakit ise gorulebilsin ama yeni deger atanamasin isteniyor (getter)

    public void setModel(String model) {  // set methodu sadece deger atamaya izin verir
        this.model = model;
    }

    public String getYakit() { // get methodu sadece okumaya(gorulmeye) izin verir
        return yakit;
    }
}
