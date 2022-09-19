package day40_final;

public class DChildOfAbstract extends CAbstract {// altini kirmizi cizdi kirmiziya gelince implement e bastik cikan sayfada
                      // abstract methodlar cikti onlari secip ok diyoruz kirmizi cizgi gidiyor
                     // yani override ediyoruz,abstract methodlari override etmek zorundayiz
    @Override
    void carpma() {

    }

    @Override
    void bolme() {


    }

    public static void main(String[] args) {
        DChildOfAbstract obj=new DChildOfAbstract();
        System.out.println(obj.cikarma());

    }

}
