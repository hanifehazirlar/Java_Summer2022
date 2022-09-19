package example;

public class C08_TersInput {
    public static void main(String[] args) {
        String input="java";
        String tersInput="";
        for (int i =input.length()-1; i >=0; i--) {
            tersInput+=input.charAt(i);
        }
        System.out.println(tersInput);

    }
}
