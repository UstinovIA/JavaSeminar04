package Seminar04.Homework;

//Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

public class Task02 {
    public static void main(String[] args) {
        myQueue queue = new myQueue();
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.first());
        System.out.println(queue.dequeue());
    }
}

