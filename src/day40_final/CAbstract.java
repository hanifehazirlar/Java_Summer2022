package day40_final;

public abstract class CAbstract { // abstract class olusturmak icin class yazisi onune abstract yazilir
    void toplama(){
        System.out.println("Bu method toplama yapar");
    }
    abstract  void carpma();
    abstract void bolme();
     boolean cikarma(){
         System.out.println("Bu method cikarma yapar");
         return false;
     }
    /*
     bir method'un basina abstract yazarsaniz
     bu method'un child class'lar icin bir standart oldugunu declare ederiz
     ve method body'sine ihtiyac kalmaz
     */


}
