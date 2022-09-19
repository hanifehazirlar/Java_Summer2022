package day34_inheritance;

public class Toyota {
    protected String marka="Toyota";
    private String renk="Beyaz";
    protected String model="Model belirtilmedi";
    protected String yakit="Yakit belirtilmedi";

    protected void motor(){
        System.out.println("Toyota cevreci motorlar kullanir");
    }
    protected void aku(){
        System.out.println("Toyota modele gore aku kullanir");
    }
}
