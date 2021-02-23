import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExLinkedHashSet {
    public static void main(String[] args) throws Exception {

        // Quando necessário manter ordenação de inserção | Mantém ordem de inserção | Mais lenta, por manter a ordenação
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        // Inserir números
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(1);
        
        System.out.println(sequenciaNumerica);

        // remover
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while(iterator.hasNext()){
            System.out.println("-> Iterator: " + iterator.next());
        }

        for (Integer i : sequenciaNumerica) {
            System.out.println("-> ForEach: " + i);
        }

    }
}