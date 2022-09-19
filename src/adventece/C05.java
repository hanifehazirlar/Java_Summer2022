package adventece;

import java.util.Scanner;

public class C05 {
    /*
   Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
   ve cekme, çıkış işlemlerinin yapıldıgı bir
   ATM app. method create ediniz
   */
    static int bakiye=1000;
    static int eskiBakiye;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("*****Hosgeldiniz*****");
        secim();
    }
    public static void yeniSecim() {
        System.out.println("Yeni islem icin 4,\ncikmak icin 5 e basiniz ");
        int yeniIslemNo= scan.nextInt();
        if (yeniIslemNo==4){
            secim();
        }else if (yeniIslemNo==5){
            cikis();
        }
    }
    public static void cikis() {
        System.out.println("Yine bekleriz güle güle :))");
    }
    public static void paraYatirma() {
        eskiBakiye=bakiye;
        System.out.println("Bakiyeniz : "+eskiBakiye+" tl");
        System.out.println("Yatirmak istediginiz tutari giriniz : ");
        int yatirilanPara= scan.nextInt();
        bakiye=bakiye+yatirilanPara;
        System.out.println("Yatirilan para miktari :"+yatirilanPara+" tl");
        System.out.println("Guncel bakiyeniz : "+bakiye+" tl");
        System.out.println("Yeni islem icin 4,\ncikmak icin 5 e basiniz ");
        int yeniIslemNo= scan.nextInt();
        if (yeniIslemNo==4){
            secim();
        }else if (yeniIslemNo==5){
            cikis();
        }
    }
    public static void paraCekme() {
        eskiBakiye=bakiye;
        System.out.println("Bakiyeniz : "+eskiBakiye+" tl");
        System.out.println("Cekmek istediginiz miktari giriniz");
        int cekilen=scan.nextInt();
        if (cekilen>bakiye){
            System.out.println("Yeterli bakiyeniz yok "+bakiye+" tl niz var");
        }else{
            bakiye=bakiye-cekilen;
            System.out.println("Cekilen para miktari :"+cekilen+ " tl");
            System.out.println("Guncel bakiyeniz : "+bakiye+" tl");
        }
        System.out.println("Yeni islem icin 4,\ncikmak icin 5 e basiniz ");
        int yeniIslemNo= scan.nextInt();
        if (yeniIslemNo==4){
            secim();
        }else if (yeniIslemNo==5){
            cikis();
        }
    }
    public static void bakiyeOgren() {
        System.out.println("Bakiyeniz : "+ bakiye+" tl");
        System.out.println("Yeni islem icin 4,\ncikmak icin 5 e basiniz ");
        int yeniIslemNo= scan.nextInt();
        if (yeniIslemNo==4){
            secim();
        }else if (yeniIslemNo==5){
            cikis();
        }
    }
    public static void secim() {
        System.out.println("Bakiye ogrenmek cekmek icin 1, \npara yatirmak icin 2," +
                "          \npara cekmek icin 3, \ncikis icin 4 e basiniz");
        int secim =scan.nextInt();
        switch (secim) {
            case 1: bakiyeOgren();
            break;
            case 2: paraYatirma();
            break;
            case 3: paraCekme();
            break;
            case 4:yeniSecim();
            break;
            case 5:cikis();
            default:
                System.out.println("Yanlis giris yaptiniz");
        }
    }



}
