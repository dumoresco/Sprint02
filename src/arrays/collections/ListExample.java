package arrays.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {
    ArrayList<String> arrayList = new ArrayList<>();
    LinkedList<String> linkedList = new LinkedList<>();

    private long initialTime;
    private long finalTime;
    private long totalTime;

    // Método para popular a lista com 1 milhão de elementos
    public void preencherLista(){
        for (int i = 0; i < 1000000; i++) {
            arrayList.add("Elemento " + (i + 1));
            linkedList.add("Elemento" + (i + 1));
        };
    }



    // ADICIONA ELEMENTO NO MEIO DA LISTA
    public long addElementOnMidArrayList(){
        initialTime = System.currentTimeMillis();
        arrayList.add(500000, "Elemento adicionado");
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;
        return totalTime;
    }

    // ADICIONA ELEMENTO NO PRIMEIRO INDEX DA LISTA
    public long addElementOnFirstArrayList(){
        initialTime = System.currentTimeMillis();
         arrayList.add(0, "Inicio da lista");
        finalTime = System.currentTimeMillis();
         totalTime = finalTime - initialTime;
         return totalTime;
    }

    // ADICIONA ELEMENTO NO ÚLTIMO INDEX DA LISTA
    public long addElementOnLastArrayList(){
        initialTime = System.currentTimeMillis();
        arrayList.add("Final da lista");
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;
        return totalTime;
    }

    public long getElementOnArrayList(){
        initialTime = System.currentTimeMillis();
        arrayList.get(500000);
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;
        return totalTime;
    }

    public long updateOnArrayList(){
        initialTime = System.currentTimeMillis();

        ArrayList<String> newArrayList = new ArrayList<>();

        for (int i = 0; i < linkedList.size() ; i++) {
            newArrayList.add("Novo elemento" + (i+1));
        }

        arrayList = newArrayList; // Substitui a linked list original pela nova
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;
        return totalTime;
    };


    // REMOVE UM ELEMENTO NO MEIO DA LISTA
    public long removeElementOnArrayList(){
        initialTime = System.currentTimeMillis();
        arrayList.remove(50000);
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;
        return totalTime;
    };

    // REMOVE TODOS OS ELEMENTOS DA LISTA
    public long removeAllOnArrayList(){
        initialTime = System.currentTimeMillis();
        arrayList.clear();
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;
        return totalTime;
    };

    // ==================================================== LINKED LIST =======================================================

    // ADICIONA UM ELEMENTO NO MEIO DA LINKED LIST
    public long addElementOnMidLinkedList(){
        initialTime = System.currentTimeMillis();
        linkedList.add(500000, "Elemento adicionado");
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;
        return totalTime;
    }

    // ADICIONA UM ELEMENTO NO PRIMEIRO INDEX DA LINKED LIST
    public long addElementOnFirstLinkedList(){
        initialTime = System.currentTimeMillis();
        linkedList.add(0, "Inicio da lista");
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;
        return totalTime;
    }

    // ADICIONA UM ELEMENTO NO ULTIMO INDEX DA LINKED LIST
    public long addElementOnLastLinkedList(){
        initialTime = System.currentTimeMillis();
        linkedList.add("Final da lista");
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;
        return totalTime;
    }

    // PEGA UM ELEMENTO DA LINKED LIST
    public long getElementOnLinkedList(){
        initialTime = System.currentTimeMillis();
        linkedList.get(500000);
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;
        return totalTime;
    }

    // FAZ UM UPDATE NA LINKED LIST
    public long updateOnLinkedList(){
        initialTime = System.currentTimeMillis();

        LinkedList<String> newLinkedList = new LinkedList<>();

        for (int i = 0; i < linkedList.size() ; i++) {
            newLinkedList.add("Novo elemento" + (i+1));
        }

        linkedList = newLinkedList; // Substitui a linked list original pela nova
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;
        return totalTime;
    };

    // REMOVE UM ELEMENTO NO MEIO DA LINKED LIST
    public long removeElementOnLinkedList(){
        initialTime = System.currentTimeMillis();
        linkedList.remove( 50000);
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;
        return totalTime;
    };

    // REMOVE TODOS OS ELEMENTOS DA LINKED LIST
    public long removeAllOnLinkedList(){
        initialTime = System.currentTimeMillis();
        linkedList.clear();
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;
        return totalTime ;
    };





    @Override
    public String toString() {
           return  "=======================================ARRAY LIST================================================== " +
                   "\nTempo para adicionar um elemento no meio da Array List: " + addElementOnMidArrayList() + "ms" +
                   "\nTempo para adicionar um elemento no início da Array List: " + addElementOnFirstArrayList() + "ms" +
                   "\nTempo para adicionar um elemento no final da Array List: " + addElementOnLastArrayList() + "ms" +
                   "\nTempo para buscar um elemento na Array List: " + getElementOnArrayList() + "ms" +
                   "\nTempo para atualizar na Array List: " + updateOnArrayList() + "ms" +
                   "\nTempo para remover um elemento no meio da Array List:  " + removeElementOnArrayList() + "ms" +
                   "\nTempo para remover todos os elementos da Array List: " + removeAllOnArrayList() + "ms" +
                   "\n" +
        "           \n=======================================LINKED LIST================================================== " +
                    "\nTempo para adicionar um elemento no meio da Linked List: " + addElementOnMidLinkedList() + "ms" +
                    "\nTempo para adicionar um elemento no início da Linked List: " + addElementOnFirstLinkedList() + "ms" +
                    "\nTempo para adicionar um elemento no final da Linked List: " + addElementOnLastLinkedList() + "ms" +
                    "\nTempo para buscar um elemento na Linked List: " + getElementOnLinkedList() + "ms" +
                    "\nTempo para atualizar a Linked List: " + updateOnLinkedList() + "ms" +
                    "\nTempo para remover um elemento no meio da Linked List: " + removeElementOnLinkedList() + "ms" +
                    "\nTempo para remover todos os elementos da Linked List: " + removeAllOnLinkedList() + "ms";



    };






}
