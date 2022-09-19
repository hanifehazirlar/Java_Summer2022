package day32_stringBuilder;

public class C02_append_Insert {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Java daha ne yapsin");
        sb.append("?");
        System.out.println(sb); // Java daha ne yapsin?
        // append istedigimiz String'i en sona ekler

        sb.insert(4," her seyi dusunmus,");
        System.out.println(sb); // Java her seyi dusunmus, daha ne yapsin?

        // araya ekleme yapmak istedigimizde append degil insert kullanmaliyiz

        sb.insert(24,"valla cok guzel",0,6); // sb'nin 24.karakterinden sonra(veya24.indexten itibaren)
                                                                 // "valla cok guzel" ifadesinin
                                                                // 1.karakterinden(0.indexinden) 6.karakterine(6.dahil degil) kadar olan kısmı
                                                               //  alır ve ekler
        // 6 yazan kısımda length degri kullanılır
        System.out.println(sb); // Java her seyi dusunmus, valla daha ne yapsin?

        StringBuilder sb1=new StringBuilder();
        sb1.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println(sb1); // abbaccca


    }
}
