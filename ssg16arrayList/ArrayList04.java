package ssg16arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList04 {

    public static void main(String[] args) {
        /*
        bir dogal sayi listesi olusturun
        ve olusturdugunuz listedeki cift ogeleri toplayin
         */
        List<Integer> myList=new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(11);
        myList.add(89);
        int sum=0;
        for (Integer w:myList
        ) {
            if (w%2==0){
                sum+=w;
            }

        }
        System.out.println(sum);

    }
}
