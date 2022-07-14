package arrays.generics;

import java.util.Objects;

public class Par<K, V> {

    private K key;
    private V value;

    public Par(){};

    public Par(K key, V value) {
        super();
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

//    public int compareTo(Par<K,V> o){
//        return 0;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Par<?, ?> par = (Par<?, ?>) o;
        return Objects.equals(key, par.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
