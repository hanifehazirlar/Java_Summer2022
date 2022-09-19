package lambda_functional_programming.day04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    public static void main(String[] args) {
        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);
       //Pojo->Plain Old Java Object
        List<Courses> coursesList = new ArrayList<>();
        //herbir class aslinda bir data turudur o yuzden <Courses> yazabiliriz icine
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println("ortalamaPuanlarVerilenSayidanBuyukMu = " + ortalamaPuanlarVerilenSayidanBuyukMu(coursesList, 95));//false
        System.out.println("kelimeKursAdlariIcindeVarMi() = " + kelimeKursAdlariIcindeVarMi(coursesList,"Day"));//true
        System.out.println("ortalamaPuaniMaxKurs(coursesList) = " + ortalamaPuaniMaxKurs(coursesList));//Turkish Night
        System.out.println("artanSiradaOrtalamaPuanaGoreSiralaIlkVerileriAtlaYazdir() = " + artanSiradaOrtalamaPuanaGoreSiralaIlkVerileriAtlaYazdir(coursesList,2));
        //[Course: Season=Summer, courseName=Turkish Day, averageScore=97, numberOfStudents=128,
        // Course: Season=Winter, courseName=Turkish Night, averageScore=98, numberOfStudents=154]
    }
    //1)Tüm ortalama puanların verilen sayıdan büyük olup olmadığını kontrol etmek için bir method oluşturun.
    public static boolean ortalamaPuanlarVerilenSayidanBuyukMu(List<Courses> coursesList,double num){
        return coursesList.stream().allMatch(t->t.getAverageScore()>num);

    }
    //2)Kurs adlarından en az birinin verilen kelimeyi içerip içermediğini kontrol etmek için bir method oluşturun
    public static boolean kelimeKursAdlariIcindeVarMi( List<Courses> coursesList,String word){
        return coursesList.stream().anyMatch(t->t.getCourseName().contains(word));
    }
    //3) Ortalama puanı en yüksek olan kursu yazdırmak için bir yöntem oluşturun
    public static String ortalamaPuaniMaxKurs(List<Courses> coursesList){
       // Object obj=coursesList.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get();
        // return obj.toString(); //Course: Season=Winter, courseName=Turkish Night, averageScore=98, numberOfStudents=154
       return coursesList.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
       // String courseName = coursesList.stream().max(Comparator.comparing(Courses::getAverageScore)).get().getCourseName(); //boylede olur
        //System.out.println("max "+courseName); 2.yol

    }
   //4) List öğelerini artan düzende ortalama puana göre sıralayın ve ilk verilenleri atlayın
    public static List<Courses> artanSiradaOrtalamaPuanaGoreSiralaIlkVerileriAtlaYazdir(List<Courses> coursesList,int kacTaneAtla ){
      return coursesList.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(kacTaneAtla).collect(Collectors.toList());
         //skip () methodu kac tane veriyi atlayacagini belirtir
        // collect(Collectors.toList() list`e cevirir
    }
}
