package example;

public class C14_AsciiValueOf {
    public static void main(String[] args) {
        char ilkharf = 'a';
        char sonHarf = 'z';

        for (char i = ilkharf; i <= sonHarf; i++) {
            int ascii =i;
            System.out.println("Ascii value of "+i+" = "+ascii);
        }
        do {
            int ascii=ilkharf;
            System.out.println("Ascii value of "+ ilkharf+" = "+ascii);
            ilkharf++;
        }while (ilkharf<=sonHarf);

        }
    }



