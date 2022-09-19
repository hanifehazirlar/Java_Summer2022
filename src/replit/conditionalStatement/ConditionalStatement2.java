package replit.conditionalStatement;

import java.util.Scanner;

public class ConditionalStatement2 {
    public static void main(String[] args) {
        /*
        iki sayıyı kıyaslayan Java kodunu yazınınz.

         Kullanılacak Operatörler

**Büyüktür >**
**Küçüktür <**
**Büyük yada eşit =>**
**Küçük yada eşit =<**
**Eşittir ==**
**Eşit değildir !=**
Kullanılacak sayılar 25 ile 39
         */
        Scanner input = new Scanner(System.in);
        System.out.println("1.sayiyi giriniz");
        int number1 = input.nextInt();
        System.out.println("2.sayiyi giriniz");
        int number2 = input.nextInt();
        if (number1>number2) {
            System.out.println(number1 + " > " + number2);
        }
        if (number1 < number2) {
            System.out.println(number1+" < "+number2);
        }
        if (number1>=number2){
            System.out.println(number1+" >= "+number2);
        }
        if (number1<=number2){
            System.out.println(number1+" <= "+number2);
        }
        if (number1==number2){
            System.out.println(number1+" == "+number2);
        }
        if (number1!=number2){
            System.out.println(number1+" != "+number2);
        }
    }
}
