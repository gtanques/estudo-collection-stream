import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExQueue {
    public static void main(String[] args) throws Exception {

        // Ordena em sistema de filas
        // Permite adição, leitura e remoção considerando a regra básica
        // de uma fila: Primeiro que entra primeiro que sai.
        // Não permite mudança na ordenação.
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("João");
        filaBanco.add("Maria");
        filaBanco.add("José");
        filaBanco.add("Marcia");
        filaBanco.add("Marcos");
        filaBanco.add("Carla");
        filaBanco.add("Ana");

        System.out.println(filaBanco);

        // Retorna e remove primeiro elemento da fila ou null
        System.out.println(filaBanco.poll());

        // Retorna primeiro elemento da fila sem remover ou null
        String primeiroCliente = filaBanco.peek();            
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        // Retorna primeiro elemento da fila sem remover em caso de null retorna exception
        // filaBanco.clear();
        String PrimeiroElementoDaFila = filaBanco.element();
        System.out.println(PrimeiroElementoDaFila);


        for(String i : filaBanco){
            System.out.println("ForEach: " + i);
        }

        Iterator<String> iterator = filaBanco.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator: " + iterator.next());
        }

    }
}
