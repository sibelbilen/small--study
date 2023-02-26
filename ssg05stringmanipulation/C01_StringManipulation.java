package ssg05stringmanipulation;

public class C01_StringManipulation {
    /*
   1.replace(): karakter degistirmeyi saglar
   2.replaceAll(): karakter- data gruplarını degistirmeyi saglar
   3.trim(): bastaki ve sondaki bosluklari siler
   4.isEmpty():bos mu diye kontrol eder
   5.isBlank():bosluk olup olmagini kontrol eder
   6.toUpperCase()-toLowerCase: buyultmeye ve kucultmeye yarar
   7.charAt():Stringdeki indexleri alıyor indexler 0dan baslar
   8.subString():ilk indexten ikinci indexe kadar keser ikinci index dahil degildir
   9.split: bir Stringi ikiye bolmemizi saglar
   10.lenght():karakter sayısını verir
   11.contains(): icerme durumunu kontrol eder
   12.startsWith:ne ile basladıgını kontrol eder
   13.endsWith: ne ile sonlandıgını kontrol eder
   14.equals():esit mi diye kontrol eder/sayisal deger ve char degerlerini kontrol etmek icin "==" kullanır
   15.indexOf():girilen karakterin index numarsını verir
   16.lastIndexOf: girilen karakterin sondan baslarayak bastan kacıncı indexte oldugunu verir
   17.valueOf(): String'i double'a cevirmemizi saglar
   */
    public static void main(String[] args) {
        /*
        soru 1)Girilen iki String veriyi karşılaştıran Java kodu yazınız.
        */

        String str="JAVA";
        String str2="java";

        System.out.println(str.equalsIgnoreCase(str2));

    }

}
