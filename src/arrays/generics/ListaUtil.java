package arrays.generics;

import java.util.List;

public class ListaUtil {
    public static Object getUltimo1(List<?> lista){
        return lista.get(lista.size()-1);
    }
    // Permite não se preocupar com casting
    public static <T> T getUltimo2(List<T> lista){
        return lista.get(lista.size()-1);
    }
}
