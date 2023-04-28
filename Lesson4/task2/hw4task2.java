package Lesson4.task2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class hw4task2 {
    public static void main(String[] args) {
        /*
         * Реализуйте очередь с помощью LinkedList со следующими методами:
         * enqueue() - помещает элемент в конец очереди,
         * dequeue() - возвращает первый элемент из очереди и удаляет его,
         * first() - возвращает первый элемент из очереди, не удаляя.
         */
        Deque<Integer> deq = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            deq.push(rnd.nextInt(10, 20));
        }
        System.out.println(deq);
        
        enqueue(deq, 15);
        dequeue(deq);
        first(deq);
    }

    public static Deque<Integer> enqueue(Deque<Integer> deq, Integer Integer) {
        deq.add(Integer);
        System.out.println(deq);
        return deq;
    }

    public static void dequeue(Deque<Integer> deq) {
        System.out.println(deq.getFirst());
        deq.remove();
        System.out.println(deq);
        //return deq;
    }

    public static void first(Deque<Integer> deq) {
        System.out.println(deq.peek());
        System.out.println(deq);
        //return deq;
    }

    

}
