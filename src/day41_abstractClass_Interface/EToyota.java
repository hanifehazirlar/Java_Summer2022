package day41_abstractClass_Interface;

public  abstract class  EToyota extends DAraba{

    @Override
    protected void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir");
    }
    /*
    parent class'daki standart belirleyici methodlar
    (abstract method)'larin tamami child class tarafindan overide edilmelidir

    concrete method'larin override edilme mecburiyeti yoktur
    istersek override edebiliriz, istemezsek etmeyiz

    Aslinda Toyota class'i da obje uretecegimiz bir class degil
    bu durumda eger proje tasarimi yapiyorsaniz
    Toyota class'ini da abstract yapmaniz guzel olur(Abstract yapmak icin o class da obje olusturup
    olusturmayacagimiza karar veririz. Obje olusturmayacaksak abstract yapariz)
     */
}
