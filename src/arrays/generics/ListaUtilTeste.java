package arrays.generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("PHP", "Javascript", "Java", "C#", "C++");

        String lastLangs = (String) ListaUtil.getUltimo1(langs);


        List<String> langs2 = Arrays.asList("PHP", "Javascript", "Java", "C#", "C++");

        String lastLangs2 = ListaUtil.getUltimo2(langs);

        System.out.println(lastLangs);
        System.out.println(lastLangs2);
    }
}
