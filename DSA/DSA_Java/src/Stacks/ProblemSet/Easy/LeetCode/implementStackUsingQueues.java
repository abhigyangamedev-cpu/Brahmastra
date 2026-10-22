package Stacks.ProblemSet.Easy.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class implementStackUsingQueues {
    static class MyStack {
        static private Queue<Integer> queue;

        public MyStack() {
            queue = new LinkedList<>();
        }

        public static void push(int x) {
            int n = queue.size();
            queue.add(x);
            for(int i = 0; i < n; i++){
                queue.add(queue.poll());
            }

        }

        public static int pop() {
            return queue.poll();
        }

        public static int top() {
            return queue.peek();
        }

        public static boolean empty() {
            return queue.isEmpty();
        }

        public static void print() {
            for (int ele : queue) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);

        obj.print();

        System.out.println(obj.top());

        System.out.println(obj.pop());

        obj.print();

        System.out.println(obj.pop());
        System.out.println(obj.pop());

        System.out.println(obj.empty());

    }
}
