package arrays.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class SetExample {
    private HashSet<Integer> hashSet = new HashSet<Integer>();
    private LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
    private TreeSet<Integer> treeSet = new TreeSet<Integer>();

    private long startTime;
    private long finalTime;
    private long totalTime;

    // Método para popular a lista com 1 milhão de elementos
    public void preencherLista(){
        for (int i = 0; i < 1000000; i++) {
            hashSet.add(i);
            linkedHashSet.add(i);
            treeSet.add(i);
        };
    }

    // =========================================== HASH SET ===================================================
    // HashSet só aceita inserção de elementos no final da coleção
    // Adiciona elemento na collection HashSet
    public long addElementOnHashSet(){
        startTime = System.currentTimeMillis();

        hashSet.add(1);

        finalTime = System.currentTimeMillis();
        totalTime = finalTime - startTime;
        return totalTime;
    };

    // Atualiza collection HashSet
    public long updateELementOnHashSet(){
        startTime = System.currentTimeMillis();
        HashSet<Integer> newHashSet = new HashSet<>();
        for (int i = 0; i < hashSet.size(); i++) {

            newHashSet.add(i);

        }
        hashSet = newHashSet;
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    // Deleta um elemento na collection HashSet
    public long deleteElementOnHashSet(){
        startTime = System.currentTimeMillis();

        linkedHashSet.remove(1);

        finalTime = System.currentTimeMillis();
        totalTime = finalTime - startTime;
        return totalTime;
    }


    // Deleta todos os elementos na colletion HashSet
    public long deleteAllElementOnHashSet(){
        startTime = System.currentTimeMillis();

        linkedHashSet.clear();

        finalTime = System.currentTimeMillis();
        totalTime = finalTime - startTime;
        return totalTime;
    }



    // =========================================== LINKED HASH SET ===================================================
    public long addElementOnLinkedHashSet(){
        startTime = System.currentTimeMillis();

        linkedHashSet.add(1);

        finalTime = System.currentTimeMillis();
        totalTime = finalTime - startTime;
        return totalTime;
    };

    public long updateELementOnLinkedHashSet(){
        startTime = System.currentTimeMillis();
        LinkedHashSet<Integer> newLinkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < hashSet.size(); i++) {

            newLinkedHashSet.add(i);

        }
        linkedHashSet = newLinkedHashSet;
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long deleteElementOnLinkedHashSet(){
        startTime = System.currentTimeMillis();

        hashSet.remove(1);

        finalTime = System.currentTimeMillis();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long deleteAllElementOnLinkedHashSet(){
        startTime = System.currentTimeMillis();

        hashSet.clear();

        finalTime = System.currentTimeMillis();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    // =========================================== TREE HASH SET ===================================================
    public long addElementOnTreeSet(){
        startTime = System.currentTimeMillis();

        treeSet.add(1);

        finalTime = System.currentTimeMillis();
        totalTime = finalTime - startTime;
        return totalTime;
    };

    public long updateELementOnTreeSet(){
        startTime = System.currentTimeMillis();
        TreeSet<Integer> newTreeSet = new TreeSet<>();
        for (int i = 0; i < hashSet.size(); i++) {

            newTreeSet.add(i);

        }
        treeSet = newTreeSet;
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long deleteElementOnTreeSet(){
        startTime = System.currentTimeMillis();

        treeSet.remove(1);

        finalTime = System.currentTimeMillis();
        totalTime = finalTime - startTime;
        return totalTime;
    }

    public long deleteAllElementOnTreeSet(){
        startTime = System.currentTimeMillis();

        treeSet.clear();

        finalTime = System.currentTimeMillis();
        totalTime = finalTime - startTime;
        return totalTime;
    }


    @Override
    public String toString() {
        return  "=======================================HASH SET================================================== " +
                "\nTempo para adicionar um elemento no HashSet: " + addElementOnHashSet() + "ms" +
                "\nTempo para atualizar uma collection HashSet: " + updateELementOnHashSet() + "ms" +
                "\nTempo para deletar um elemento no HashSet: " + deleteElementOnHashSet() + "ms" +
                "\nTempo para deletar todos os elementos no HashSet: " + deleteAllElementOnHashSet() + "ms" +
                "\n "+
                "\n=======================================LINKED HASH SET================================================== " +
                "\nTempo para adicionar um elemento no Linked HashSet: " + addElementOnLinkedHashSet() + "ms" +
                "\nTempo para atualizar uma collection Linked HashSet: " + updateELementOnLinkedHashSet() + "ms" +
                "\nTempo para deletar um elemento no Linked HashSet: " + deleteElementOnLinkedHashSet() + "ms" +
                "\nTempo para deletar todos os elementos no Linked HashSet: " + deleteAllElementOnLinkedHashSet() + "ms" +
                "\n "+
                "\n=======================================TREE SET================================================== " +
                "\nTempo para adicionar um elemento no TreeSet: " + addElementOnTreeSet() + "ms" +
                "\nTempo para atualizar uma collection TreeSet: " + updateELementOnTreeSet() + "ms" +
                "\nTempo para deletar um elemento no TreeSet: " + deleteElementOnTreeSet() + "ms" +
                "\nTempo para deletar todos os elementos no TreeSet: " + deleteAllElementOnTreeSet() + "ms";




    };
};


