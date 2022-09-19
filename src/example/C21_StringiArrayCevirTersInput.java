package example;

public class C21_StringiArrayCevirTersInput {
    public static void main(String[] args) {
       /* Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve
       tersine ters çevrilmiş String'e atayın.

        Test Data:
        sentence -> "Java is fun"
        reversed **-> "**fun is Java**"**
        */
        String sentence="Java is fun";
        String reversed="";
        String[] str=sentence.split(" "); // boşluklardan ayır demek
        for (int i = str.length - 1; i >= 0; i--){
            reversed+=str[i]+" ";

        }
        System.out.println(reversed);

    }
}
