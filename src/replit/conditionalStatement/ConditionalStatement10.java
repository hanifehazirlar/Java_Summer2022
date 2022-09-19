package replit.conditionalStatement;

public class ConditionalStatement10 {
    public static void main(String[] args) {
        /*
        5 satırlık paskal üçgenini yazdıran Java kodunu yazınız.
        Beklenen Çıktı:
             1
            1 1
           1 2 1
          1 3 3 1
         1 4 6 4 1

         */
        int satirSayisi = 5;
        int number;
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = satirSayisi; j > i; j--)
                System.out.print(" ");
            number = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);

            }
            System.out.println();
        }
    }
}

