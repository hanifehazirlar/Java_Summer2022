package SoruBankası.typeCasting;

public class C01 {
    public static void main(String[] args) {
        //1) Create a short variable and convert it to an int variable.
        short age=12;
        int newAge= age;
        System.out.println(newAge);

        // 2) Create a long variable and convert it to an int variable
        long number=12L;
        int newNumber= (int) number;
        System.out.println(newNumber);

        // 3) Create a double variable and convert it to a float variable
        double price=12.9;
        float newPrice= (float) price;
        System.out.println(newPrice);

        //4) Create a double variable and convert it to a short variable, then print the value of the short
        //variable on the console. Be careful about the output, it will not be a decimal value
        double price1=34.99;
        short newPrice1= (short) price1;
        System.out.println(newPrice1);
        //5) Create a byte variable and convert it to a double variable, then print the value of the double
        //variable on the console. Be careful about the output, it will be a decimal number
        byte v1=12;
        double v2=v1;
        System.out.println(v2);
    }
}
