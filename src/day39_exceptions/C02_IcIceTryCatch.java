package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IcIceTryCatch {
    public static void main(String[] args) throws FileNotFoundException {

        //FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");
        // Bu satiri yazinca FileInputStream altini kirmizi cizer kirmizi cizgiye gelince
        // more actions dan basip throws FileNotFoundException veya try catch yontemiyle sorunu cozebiliriz
        String str="ali";
        System.out.println((char)97);
        System.out.println((int)'a');

        try {
            FileInputStream fis = new FileInputStream("src/day39_exceptions/Test.txt");
            int k;
            while((k=fis.read()) !=-1){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosyadan bilgiler okunamadi");
        } catch (IOException e) {
            System.out.println("Dosya bulunamadi");
        }
        /*
        catch lerde parent -child iliskisi var ustte child altta parent olmali
        daha dar kapsamli üstte
         */

    }
}
