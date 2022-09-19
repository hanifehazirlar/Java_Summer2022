package SoruBankası.variables;

import java.util.Scanner;

public class Soru1And7 {
    //Soru1) Herhangi bir 3 öğenin fiyatları için double değişkenler oluşturun. Fiyatların toplamını kağıda yazdırın.
    //Create double variables for the prices of any 3 items. Print the sum of the prices on the
    //console with a label.
    public static void main(String[] args) {
        double shoesPrice=15.29;
        double shirtPrice=34.89;
        double hatPrice=45.70;
        System.out.println("Sum of the prices : "+(shoesPrice+shirtPrice+hatPrice));
        // Soru2)) Herhangi bir 3 öğe için bir kayan değişken, bir uzun değişken ve bir tamsayı değişkeni oluşturun.
        //      Konsoldaki değerlerin çarpımını bir etiketle yazdırın.
        // Create a float variable, a long variable, and an integer variable for any 3 items. Print the
        //multiplication of the values on the console with a label
        float a=12.23f;
        long b=16L;
        int c=35;
        System.out.println("multiplication : "+(a*b*c)); //multiplication : 6848.8
        // Soru3) Basit faiz bulmak için bir kod yazın.
        //Not: Basit faiz formülü = anapara * *Yıl Sayısı / 10
        // Type a code to find simple interest.
        //Note: Simple interest formula = principal * rate * numberOfYear / 100
        int principal=1000,rate=6,numberOfYear=3;
        int simpleInterest=principal*rate*numberOfYear/100;
        System.out.println("The simple iterest is "+simpleInterest);
        // Soru4) Create a String and two Long variables. Print the sum and the multiplication of the long
        //variables with the String on the console
        String str="The result is ";
        long x=156L;
        long y=75166544L;
        System.out.println(str+(x+y));
        System.out.println(str+x*y);
        // Soru5)Create two boolean variables whose values are different and print their values
        // in the same line with a space between two consecutive values
        boolean b1=true;
        boolean b2=false;
        System.out.println(b1+" "+b2);
        //Soru7) Type a code to swap two integers
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 numbers to swaps");
        int s1=scan.nextInt();
        int s2=scan.nextInt();
        System.out.println("Before swapping : "+"s1 = "+s1+" and "+"s2 = "+s2);
        // 1. Way: Use 3rd variable
        int s3;
        s3=s2;
        s2=s1;
        s1=s3;
        System.out.println("After swapping : "+"s1 = "+s1+" and "+"s2 = "+s2);
        // 2. Way: Do not use 3rd variable
        s1=s1+s2; // s1=20+10=30
        s2=s1-s2; // s2=30-10=20
        s1=s1-s2; // s1==30-20=10
        System.out.println("s1 : "+s1+" s2 : "+s2 );





    }
}
