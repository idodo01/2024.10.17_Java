package Study_20241023.my_collection;


import java.util.*;

public class MyListMain {
    public static void main(String[] args) {
        // 1.
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        Vector vector = new Vector();
        
        vector.add("test"); // 넣는 데이터
//        vector.get(5); // index 번호로
        vector.contains("test"); // 포함 여부 확인

        /********************************************/
        // 2. 스택
        Stack<String> stack = new Stack<>();

        // 1) push
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        System.out.println(stack);

        // 2) peek: 값을 확인할 수 있다 (값이 없어지지 않고 그대로 있음)
        System.out.println("다음에 뽑을 데이터:" + stack.peek());

        // 3) pop: 값을 뽑아내서 확인한다 (값이 실제로 없어짐)
        String result = stack.pop();
        System.out.println(result + "를 뽑았다");
        System.out.println(stack);

        result = stack.pop();
        System.out.println(result + "를 뽑았다");
        System.out.println(stack);

        result = stack.pop();
        System.out.println(result + "를 뽑았다");
        System.out.println(stack);

        result = stack.pop();
        System.out.println(result + "를 뽑았다");
        System.out.println(stack);

        /*********************************************/
        // 3. 큐
        Queue<String> queue = new LinkedList<>();

        // 1) offer
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        System.out.println(queue);

        // 2) peek
        System.out.println("다음에 뽑을 데이터:" + queue.peek());

        // 3) poll
        result = queue.poll();
        System.out.println(result + "를 뽑았다");
        System.out.println(queue);

        result = queue.poll();
        System.out.println(result + "를 뽑았다");
        System.out.println(queue);

        result = queue.poll();
        System.out.println(result + "를 뽑았다");
        System.out.println(queue);

        result = queue.poll();
        System.out.println(result + "를 뽑았다");
        System.out.println(queue);


    }
}

