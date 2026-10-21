package Stacks.LeetCode.Easy;

import java.util.Stack;

public class implementQueueUsingStacks {

    static class MyQueue {
        static private Stack<Integer> main;
        static private Stack<Integer> helper;

        public MyQueue() {
            main = new Stack<>();
            helper = new Stack<>();
        }

        public static void push(int x) {

            while(main.size()>0){
                helper.push(main.pop());
            }

            main.push(x);

            while(helper.size()>0){
                main.push(helper.pop());
            }
        }

        public static int pop() {
            return main.pop();
        }

        public static int peek() {
            return main.peek();

        }

        public static boolean empty() {
            return main.size()==0;
        }


        public static void print() {
            for (int ele : main) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args){
        MyQueue obj = new MyQueue();

        obj.push(1);
        obj.push(2);
        obj.push(3);

        obj.print();

        System.out.println(obj.peek());

        System.out.println(obj.pop());

        obj.print();

        System.out.println(obj.pop());
        System.out.println(obj.pop());

        System.out.println(obj.empty());
    }
}
