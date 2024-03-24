
/*
Test the runtime of the algorithm
Mykyta Kuznietsov
AUCSC 112 LEC
1796090
February 27th 2024
 */


import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.enqueue(new Node<Integer>(1));
        queue.enqueue(new Node<Integer>(2));
        queue.enqueue(new Node<Integer>(3));
        queue.enqueue(new Node<Integer>(4));
        queue.enqueue(new Node<Integer>(5));


        System.out.println(queue.front().getData());
        System.out.println(queue.dequeue().getData());
        System.out.println(queue.front().getData());
        System.out.println(queue.dequeue().getData());
        System.out.println(queue.front().getData());

        System.out.println(queue.dequeue().getData());
        System.out.println(queue.front().getData());
        System.out.println(queue.dequeue().getData());
        System.out.println(queue.front().getData());
        System.out.println(queue.dequeue().getData());
        System.out.println(queue.front().getData());
        System.out.println(queue.dequeue().getData());

    }
}