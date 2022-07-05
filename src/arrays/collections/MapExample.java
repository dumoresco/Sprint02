package arrays.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    private long startTime;
    private long finalTime;
    private long totalTime;

    Map<Integer, String> hashMap = new HashMap<>();
    Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
    Map<Integer, String> treeMap = new TreeMap<>();


    public void preencherLista(){
        for (int i = 0; i < 50; i++) {

        hashMap.put(i, "Elemento " + (i));
        linkedHashMap.put(i, "Elemento " + (i));
        };
    }

    // ============================================ HASH MAP ====================================================
    // Adiciona elemento no Hash Map
    public long addElementOnMidHashMap(){
        startTime = System.nanoTime();

        hashMap.put(25, "Elemento novo");

        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long addElementOnFirstHashMap(){
        startTime = System.nanoTime();

        hashMap.put(0, "Adiciona primeiro elemento");

        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long addElementOnLastHashMap(){
        startTime = System.nanoTime();

        hashMap.put(hashMap.size(), "Adiciona primeiro elemento");

        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long searchElementOnHashMap(){
        startTime = System.nanoTime();

        hashMap.get(25);

        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long updateHashMap(){
        Map<Integer, String> newHashMap = new HashMap<>();
        startTime = System.nanoTime();

        for (int i = 0; i < 50; i++) {

            newHashMap.put(i, "Elemento " + (i));
        };

        hashMap = newHashMap;


        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long deleteElementOnHashMap(){
        startTime = System.nanoTime();

        hashMap.remove(25);

        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long deleteAllElementsOnHashMap(){
        startTime = System.nanoTime();

        hashMap.clear();

        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }


    // ============================================ LINKED HASH MAP ====================================================

    // Linked hash map mantém a ordem dos valores inseridos

    public long addElementOnMidLinkedHashMap(){
        startTime = System.nanoTime();

        linkedHashMap.put(25, "Elemento novo");

        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }


    public long addElementOnFirstLinkedHashMap(){
        startTime = System.nanoTime();

        linkedHashMap.put(0, "Adiciona primeiro elemento");

        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long addElementOnLastLinkedHashMap(){
        startTime = System.nanoTime();

        linkedHashMap.put(hashMap.size(), "Adiciona primeiro elemento");

        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long searchElementOnLinkedHashMap(){
        startTime = System.nanoTime();

        linkedHashMap.get(25);

        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long updateLinkedHashMap(){
        Map<Integer, String> newLinkedHashMap = new HashMap<>();
        startTime = System.nanoTime();

        for (int i = 0; i < 50; i++) {

            newLinkedHashMap.put(i, "Elemento " + (i));
        };

        linkedHashMap = newLinkedHashMap;


        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long deleteElementOnLinkedHashMap(){
        startTime = System.nanoTime();

        linkedHashMap.remove(25);

        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long deleteAllElementsOnLinkedHashMap(){
        startTime = System.nanoTime();

        linkedHashMap.clear();

        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    // ============================================ TREE MAP ====================================================

    public long addElementOnMidTreeMap(){
        startTime = System.nanoTime();

        treeMap.put(25, "Elemento novo");

        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }


    public long addElementOnFirstTreeMap(){
        startTime = System.nanoTime();

        treeMap.put(0, "Adiciona primeiro elemento");

        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long addElementOnLastTreeMap(){
        startTime = System.nanoTime();

        treeMap.put(hashMap.size(), "Adiciona primeiro elemento");

        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long searchElementOnTreeMap(){
        startTime = System.nanoTime();

        treeMap.get(25);

        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long updateTreeMap(){
        Map<Integer, String> newtTreeMap = new HashMap<>();
        startTime = System.nanoTime();

        for (int i = 0; i < 50; i++) {

            newtTreeMap.put(i, "Elemento " + (i));
        };

        treeMap = newtTreeMap;


        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long deleteElementOnTreeMap(){
        startTime = System.nanoTime();

        treeMap.remove(25);

        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long deleteAllElementsOnTreeMap(){
        startTime = System.nanoTime();

        treeMap.clear();

        finalTime = System.nanoTime();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    @Override
    public String toString() {
        return  "\n ===================================== HASH MAP ===========================================" +
                "\n Tempo para adicionar um elemento no meio da coleção HashMap: " + addElementOnMidHashMap() + "ms" +
                "\n Tempo para adicionar um elemento no início da coleção HashMap: " + addElementOnFirstHashMap() + "ms" +
                "\n Tempo para adicionar um elemento no final da coleção HashMap: " + addElementOnLastHashMap() + "ms" +
                "\n Tempo para buscar um elemento na coleção HashMap: " + searchElementOnHashMap() + "ms" +
                "\n Tempo para atualizar a coleção HashMap: " + updateHashMap() + "ms" +
                "\n Tempo para remover um elemento no meio da coleção HashMap: " + deleteElementOnHashMap() + "ms"  +
                "\n Tempo para remover todos os elementos da coleção HashMap: " + deleteAllElementsOnHashMap() + "ms" +
                "\n  " +
                "\n ===================================== LINKED HASH MAP ===========================================" +
                "\n Tempo para adicionar um elemento no meio da coleção Linked Hash Map: " + addElementOnMidLinkedHashMap() + "ms" +
                "\n Tempo para adicionar um elemento no início da coleção Linked Hash Map: " + addElementOnFirstLinkedHashMap() + "ms" +
                "\n Tempo para adicionar um elemento no final da coleção Linked Hash Map: " + addElementOnLastLinkedHashMap() + "ms" +
                "\n Tempo para buscar um elemento na coleção Linked Hash Map: " + searchElementOnLinkedHashMap() + "ms" +
                "\n Tempo para atualizar a coleção Linked Hash Map: " + updateLinkedHashMap() + "ms" +
                "\n Tempo para remover um elemento no meio da coleção Linked Hash Map: " + deleteElementOnLinkedHashMap() + "ms"  +
                "\n Tempo para remover todos os elementos da coleção Linked Hash Map: " + deleteAllElementsOnLinkedHashMap() + "ms"+
                "\n  " +
                "\n ===================================== TREE MAP ===========================================" +
                "\n Tempo para adicionar um elemento no meio da coleção Tree Map: " + addElementOnMidTreeMap() + "ms" +
                "\n Tempo para adicionar um elemento no início da coleção Tree Map: " + addElementOnFirstTreeMap() + "ms" +
                "\n Tempo para adicionar um elemento no final da coleção Tree Map: " + addElementOnLastTreeMap() + "ms" +
                "\n Tempo para buscar um elemento na coleção Tree Map: " + searchElementOnTreeMap() + "ms" +
                "\n Tempo para atualizar a coleção Tree Map: " + updateTreeMap() + "ms" +
                "\n Tempo para remover um elemento no meio da coleção Tree Map: " + deleteElementOnTreeMap() + "ms"  +
                "\n Tempo para remover todos os elementos da coleção Tree Map: " + deleteAllElementsOnTreeMap() + "ms";



    }
}
