import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class Try {

    public static void main(String[] args) {

        List<Integer> numList = List.of(1,2,3,4,5,6);
        //stacks
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

//        System.out.println(stack.peek());
//        System.out.println(stack.search(3));
//
//        System.out.println("Alpha");

        //Queues
        Queue<Person> people = new LinkedList<>();

        people.add(new Person("Alpha", 10));
        people.add(new Person("Ben", 27));
        people.add(new Person("Ritah", 23));

//        System.out.println(people);
//
//        people.forEach(person -> System.out.println(person));
//
        people.offer(new Person("Lovinto", 12));

        System.out.println(people);

        if(people.contains(new Person("Alpha", 10))){
            System.out.println("The bitch is here");
        }else {
            System.out.println("No bitch");
        }





    }

     record Person(String name, int age){

    }
}
