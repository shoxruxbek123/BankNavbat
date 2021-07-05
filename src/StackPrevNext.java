

import java.util.Scanner;
import java.util.Stack;



public class StackPrevNext {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<String> stack = new Stack<>();

        int a = 0;
        switch (a){
            case 1 :{
                stack.add("Telegram");
                System.out.println(stack);
                break;}
            case 2 :{
                stack.add("Instagram");
                System.out.println(stack);
                break;}
            case 3 :{
                stack.add("Facebook");
                System.out.println(stack);
                break;}
            case 4 :{
                stack.add("Youtube");
                System.out.println(stack);
                break;}
            case 5 :{
                stack.add("Tik Tok");
                System.out.println(stack);
                break;
            }
            default:{
                break;
            }
        }
    }




}