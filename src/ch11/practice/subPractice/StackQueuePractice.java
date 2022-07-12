package ch11.practice.subPractice;

import java.util.*;

public class StackQueuePractice {
    public static void main(String[] args) {
        Queue queue = new LinkedList();

        queue.offer("00");
        queue.offer("02");
        queue.offer("01");


        System.out.println("===== queue test =====");
        System.out.println("queue.element() : " + queue.element());
        System.out.println("- queue 내용물 -");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println("- queue 내용물 -");
        System.out.println("===== queue test =====");
        System.out.println();
        System.out.println("===== PriorityQueue test =====");

        Queue priorityQueue = new PriorityQueue();

        priorityQueue.offer(123);
        priorityQueue.offer(54);
        priorityQueue.offer(333);
        priorityQueue.offer(1);

        System.out.println("- PriorityQueue 내용물 -");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
        System.out.println("- PriorityQueue 내용물 -");
        System.out.println("===== PriorityQueue test =====");
        System.out.println();
        System.out.println("===== stack test =====");
        Stack stack = new Stack();
        stack.push(1);
        stack.push(4);
        stack.push(3);
        stack.push(9);

        System.out.println("stack에서 9 검색 결과 : " +stack.search(9));
        System.out.println("- stack 내용물 -");

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
        System.out.println("- stack 내용물 -");
        System.out.println("stack에서 9 검색 결과 : " +stack.search(9));
        System.out.println("stack에서 9 검색 결과 : " +stack.search(9));
        System.out.println("===== stack test =====");
    }
}
