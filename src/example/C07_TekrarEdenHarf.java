package example;

public class C07_TekrarEdenHarf {
    public static void main(String[] args) {
       /* Bir String icerisinde yinelenen karakterleri döndüren
        bir kod yazıniz.(mülakat Sorusu)
        Input :
        String str="Javaisalsoeasy"
        Output: a s
     */
        String str = "avaisalsoeasy";
        String harf="";
        String tekrarEden = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            harf= str.substring(i, i + 1);
            int ilkIndex = str.indexOf(harf);// 0
            int sonIndex = str.lastIndexOf(harf);
            if (ilkIndex != sonIndex) {
                if (!(tekrarEden.contains(harf))) {
                    tekrarEden += " " + harf;
                }
            }
        }
        System.out.println(tekrarEden);
    }
    }


