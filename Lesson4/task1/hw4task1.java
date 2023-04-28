package Lesson4.task1;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;



public class hw4task1 {
    public static void main(String[] args) {
        /*Пусть дан LinkedList с несколькими
        элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
         */

        LinkedList<Object> ll = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            ll.add(i, rnd.nextInt(0, 30));
        }
        System.out.println(ll);
        LinkedList<Object> revll = reverseLL(ll);
        LinkedList<Object> revll2 = reverseLL2(ll);
        System.out.println(revll);
        System.out.println(revll2);
                  
        }

    public static LinkedList<Object> reverseLL(LinkedList<Object> list) {
        LinkedList<Object> revlist = new LinkedList<Object>();
        for (int i = list.size()-1; i >= 0; i--){
            revlist.add(list.get(i));
        }   
        return revlist;
    }
    public static LinkedList<Object> reverseLL2(LinkedList<Object> list) {
        Collections.reverse(list);

        return list;   
    }
       

} 

