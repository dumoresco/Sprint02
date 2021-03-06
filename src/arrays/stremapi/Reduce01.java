package arrays.stremapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce01 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;


        System.out.println(nums.stream().reduce(soma).get());
        System.out.println(nums.stream().reduce(100, soma));

    }
}
