package day09_ternary;

public class C10_SwitchSoru4 {
    /*
    Kullanicidan SDET kisaltmasindaki  harflerden birini yazmasini isteyin. Kullanici
    S girerse "Software"
    D girerse "Devoloper"
    E girerse "Engineer"
    T girerse "In Testing" yazdirin
     */
    public static void main(String[] args) {
        String harf="k";
        harf=harf.toUpperCase();

        switch (harf) {
            case "S":
                System.out.println("Software");
                break;
            case "D":
                System.out.println("Development");
                break;
            case "E":
                System.out.println("Engineer");
                break;
            case "T":
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Lutfen gecerli bir harf giriniz");
        }
    }
}
