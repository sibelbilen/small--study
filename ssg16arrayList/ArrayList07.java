package ssg16arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList07 {

    public static void main(String[] args) {
       /*
       soru 7) bir liste olusturun ve listede
       kac tane farkli elemanin oldugunu yazdirin
       */
        List<Integer> myList=new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(11);
        myList.add(89);
        myList.add(89);
        int toplam=0;
        System.out.println(myList);
        for (int i = 0; i < myList.size(); i++) {

            if (myList.indexOf(myList.get(i))==myList.lastIndexOf(myList.get(i)))
            {
                toplam++;
            }

        }System.out.println(toplam+((myList.size()-toplam)/2));

    }

}
