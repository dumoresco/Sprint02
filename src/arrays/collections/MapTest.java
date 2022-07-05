package arrays.collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class MapTest {
    public static void main(String[] args) {

        Usuario consumidor1 = new Usuario("Eduardo", 123);
        Usuario consumidor2 = new Usuario("João", 321);

        Produto produto1 = new Produto("Teclado Razer", 2000);
        Produto produto2 = new Produto("iPhone XR", 5000);
        Produto produto3 = new Produto("TV 4K", 8000);

        List<Produto> produtoCom1 = new ArrayList<>();
        produtoCom1.add(produto1);
        produtoCom1.add(produto2);
        List<Produto> produtoCom2 = new ArrayList<>();
        produtoCom2.add(produto3);

        Map<Usuario, List<Produto>> map = new HashMap<>();
        map.put(consumidor1, produtoCom1);
        map.put(consumidor2, produtoCom2);
        for( Map.Entry<Usuario, List<Produto>> entry: map.entrySet()){
            System.out.println(entry.getKey().getNome());
            for(Produto produto : entry.getValue()){
                System.out.println(produto.getNome());
            }
        }



    }
}
