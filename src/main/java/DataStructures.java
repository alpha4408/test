import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStructures {

    public static void main(String[] args) {

//
//        Arrays.stream(numbers).forEach(number -> System.out.println(number));

//        int [][][] twoDArrays = {{{1,2,3}, {2,2,2}},{{4,5,6}, {3,3,3}}};
//
//        int x = twoDArrays[0][0][1];
//        System.out.println(x);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

//        for(Integer num : numbers){
//            System.out.println(num);
//        }


        numbers.forEach(numz -> System.out.println(numz));





    }
}
