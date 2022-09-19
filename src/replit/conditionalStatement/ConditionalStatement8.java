package replit.conditionalStatement;

public class ConditionalStatement8 {
    public static void main(String[] args) {
        /*
        1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.

      Beklenen çıltı:
      1
      12
      123
      1234
      12345
      123456
      1234567
      12345678
      123456789
      12345678910
         */
        for (int i = 1; i <11; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print(j);

            }
            System.out.println("");

        }
    }
}
