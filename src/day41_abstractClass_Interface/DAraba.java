package day41_abstractClass_Interface;

public abstract class DAraba {
    public  static final int sayi=10;
    int sayi1;
    public static void main(String[] args) {
        //abstract class'da main method opsiyoneldir(istege bagli)
        // eger abstract class sadece child class'larin tasimak zorunda oldugu özellikleri
        //belirlemek icin olustururlduysa main methoda ihtiyac olmaz
        // sadece abstractmethod'lar olur
        // ama bir abstract class'da standart belirlemek disinda da methodlar calisabilir
        // bu durumda ihtiyac olursa main method olustururlabilir

    }
    protected abstract void motor();
    protected abstract void kaporta();
    protected abstract void yakit();
    /*
    sadece child classlarin mecburi tasiyacaklari ozellikleri belirleyen
    methodlar abstract method olur ve abstract methodlarin body' si olmaz
     */
    public void klima(){
        System.out.println("Bazi arabalarda klima olabilir");
        /*
        abstract olmayan methodlara concrete method denir.
        abstract bir method'u keyword ile belirtmek Zorunludur
        concrete method'larda bunun deklare edilmesine gerek yoktur
        biz sadec abstraction ile ilgili konustugumuzda
        abstract olmayan method'lardan bahsetmek icin concrete tabirini kullaniriz
         */
    }
}
     /*
     daha sonra cıkmasini istedigimiz urunde yani child class'da kesinlikle olmasini istedigimiz ozellikleri
     abstract method olarak parent class'da olustururuz

     abstract methodlarin body'si yoktur yani vucudu yok o yuzden soyut
     concrete(abstract olmayan method) methodlarin body'si var yani vucudu var o yuzden somut
      */
