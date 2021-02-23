import java.util.LinkedList;
import java.util.Queue;

public class ExerciciosQueue {

    // Exercicio:
        // Crie uma fila e execute as seguintes operaçãoes:
        // Adicionar 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
        // Navegue na fila exibindo cada nome no console.
        // Retorne o primeiro item da fila sem removê-lo.
        // Retorne o primeiro item da fila, removendo o mesmo.
        // Adicione um novo nome: Daniel, verifique a posição que o mesmo
        // assumiu na fila.
        // Retorne o tamanho da lista.
        // Verifique se a lista está vazia.
        // Verifique se o nome Carlos está na lista.

    public static void main(String[] args) throws Exception {
        
        final String[] arrayPessoas = {"Juliana", "Pedro", "Carlos", "Larissa", "João"};
        Queue<String> listaPessoas = new LinkedList<>();
        
        // Adicionar 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
        for(int i = 0; i < arrayPessoas.length; i++){
            listaPessoas.add(arrayPessoas[i]);
        }

        // Navegue na fila exibindo cada nome no console.                
        for (String nomes : listaPessoas) {
            System.out.println(nomes);
        }

        // Retorne o primeiro item da fila sem removê-lo.
        System.out.println("Retorne o primeiro item da fila sem removê-lo: " + listaPessoas.peek());
        System.out.println(listaPessoas);

        // Retorne o primeiro item da fila, removendo o mesmo.
        System.out.println("Retorne o primeiro item da fila, removendo o mesmo: " + listaPessoas.poll());
        System.out.println(listaPessoas);

        // Adicione um novo nome: Daniel, verifique a posição que o mesmo
        listaPessoas.add("Daniel");
        System.out.println(listaPessoas);

        // Retorne o tamanho da lista.
        System.out.println("Tamanho da lista: " + listaPessoas.size());

        // Verifique se a lista está vazia.
        System.out.println("Lista está vazia?: " + listaPessoas.isEmpty());

        // Verifique se o nome Carlos está na lista.
        System.out.println("Lista contém Carlos?: " + listaPessoas.contains("Carlos"));
        
        System.out.println(listaPessoas);

    }
}
