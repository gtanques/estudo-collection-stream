import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExHashSet {
        
    public static void main(String[] args) throws Exception {

        // Quando não necessário manter ordenação | Não ordenado, e não permite repetições | Performatica.
        Set<Double> notasAlunosSet = new HashSet<>();

        // Insere Valores 
        notasAlunosSet.add(5.8);
        notasAlunosSet.add(9.3);
        notasAlunosSet.add(6.5);
        notasAlunosSet.add(10.0);
        notasAlunosSet.add(5.4);
        notasAlunosSet.add(7.3);
        notasAlunosSet.add(3.8);
        notasAlunosSet.add(4.0);
        
        System.out.println(notasAlunosSet);

        // Remover nota da lista
        notasAlunosSet.remove(3.8);
        System.out.println(notasAlunosSet);


        Iterator<Double> iterator = notasAlunosSet.iterator();

        while(iterator.hasNext()){
            System.out.println("-> Iterator: " + iterator.next());
        }

        for (Double i : notasAlunosSet) {
            System.out.println("-> ForEach: " + i);
        }        
    }
}