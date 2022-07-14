package arrays.generics;

import java.util.*;

public class Pares<K extends Number,V> {

    private final Set<Par<K,V>> itens = new HashSet();

    public void add(K key, V value){

        if(key == null) return;
        Par<K,V> newPar = new Par<K,V>(key,value);
        if(itens.contains(newPar)){
            itens.remove(newPar);
        }
        itens.add(newPar);
    }

    public V getValue(K key){
        if(key == null) return null;

        Optional<Par<K,V>> optionalPar = itens.stream().filter(p -> key.equals(p.getKey())).findFirst();

        return (optionalPar.isPresent()) ? optionalPar.get().getValue() : null;
    }
}
