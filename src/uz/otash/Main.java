package uz.otash;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// Queue (navbat) FIFO (First in First Out) yoki LIFO(last in last out)

        Queue<String> stringQueue = new ArrayDeque<>();
        stringQueue.add("Otabek");
        stringQueue.add("Ilhom");
        stringQueue.add("Shoxrux");


        System.out.println(stringQueue);
        String poll = stringQueue.poll();
        System.out.println("poll" + poll);
        System.out.println(stringQueue);


        String peek = stringQueue.peek();
        System.out.println("peek" + " " + peek);
        System.out.println(stringQueue);

        String element = stringQueue.element();
        System.out.println("element = " + element);
        System.out.println(stringQueue);

        String remove = stringQueue.remove();
        System.out.println("remmove = " + remove);
        System.out.println(stringQueue);

        boolean b = stringQueue.offer("Shoxrux");
        System.out.println("offer = " + b);
        System.out.println(stringQueue);



//        Stack<>  LIFO(last in first out) yoki FILO(firt in first out)
        Stack<String> stringStack = new Stack<>();
        stringStack.add("Otabek");
        stringStack.add(0,"Shoxrux");
        stringStack.add("Ilhom");
        stringStack.peek();

        System.out.println(stringStack);

        }
    }

