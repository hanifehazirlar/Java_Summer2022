package day23_arrayLists;

public class C06_Soru1 {
    public static void main(String[] args) {
         /*
        Soru 1) //Verilen bir Array deki tekrar eden elementleri yazdirin
         */
        String [] arr={"ali","bulent","ali","bulent","ali","semra","bulent"};
        String tekrarEden="";

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length; j++) {
                if(arr[i].contains(arr[j])){
                    if (!tekrarEden.contains(arr[j])){
                        tekrarEden+=arr[j];
                    }
                }
            }
        }
        System.out.println(tekrarEden);

    }
}
