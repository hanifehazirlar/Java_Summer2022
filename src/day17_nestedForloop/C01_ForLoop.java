package day17_nestedForloop;

public class C01_ForLoop {
    public static void main(String[] args) {
        // verilen String'deki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz
        String input="java guzel mi guzel";
        tekrarsizYap(input);

    }

   public static void tekrarsizYap(String input) {
        String islenecekKelime=input.replaceAll("\\W","");
       System.out.print(islenecekKelime.substring(0,1)); // J
        String benzersizInput="";
        benzersizInput+=islenecekKelime.substring(0,1);
        for (int i = 1; i <islenecekKelime.length(); i++) {

            if(!benzersizInput.contains(islenecekKelime.substring(i,i+1))) {
                System.out.print(", "+islenecekKelime.substring(i, i + 1));
                benzersizInput +=" "+ islenecekKelime.substring(i, i + 1);
            }
        }
        System.out.println("");
        System.out.println("benzersizInput :"+benzersizInput);

        }

    }

