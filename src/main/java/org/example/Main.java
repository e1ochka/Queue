package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);

        System.out.println("Первый элемент в очереди: " + queue.dequeue());
        System.out.println("Второй элемент в очереди: " + queue.dequeue());

        queue.enqueue(20);

        System.out.println("Новый первый элемент в очереди: " + queue.dequeue());
        System.out.println("Последний элемент в очереди: " + queue.dequeue());
    }
}