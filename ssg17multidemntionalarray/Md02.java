package ssg17multidemntionalarray;

public class Md02 {
    public static void main(String[] args) {
        /*
        soru 2) verilen bir multi-dimensional array in
        tum elementlerini yazdiran bir method olusturun
         */
        int sayilar[][]={{1,2,3},{11,22,33},{1,5,9}};

        elementYazdir(sayilar);

    }public static void elementYazdir (int[][]sayilar){
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.println(sayilar[i][j]);

            }

        }

    }
}
