package arrays.stremapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class DesafioMap {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Consumer<String> print = System.out::println;

        /*
        * 1. Número para string binária... 6 => "110"
        * 2. Inverter a string... "110" => "011"
        * 3. Converter a volta para inteiro => "011" => 3
        *  */

        UnaryOperator<String> reverter = n -> new StringBuilder(n).reverse().toString();
        Function<String, Integer> binaryToInteger = s -> Integer.parseInt(s, 2);
       nums.stream().map(Integer::toBinaryString).map(reverter).map(binaryToInteger).forEach(System.out::println);





    }

}
