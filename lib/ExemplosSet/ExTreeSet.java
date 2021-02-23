import java.util.Iterator;
import java.util.TreeSet;

public class ExTreeSet {
    public static void main(String[] args) throws Exception {
        // Quando necessário alterar a ordem atravez do uso de comparadores | Mantém a ordem e pode ser reordenada| Performatica apenas para leitura
        // sendo o mais pesado em relação a reordenação.
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        // treeCapitais.add("Belo Horizonte");
                
        System.out.println(treeCapitais);

        // Retorna topo da árvore
        System.out.println(treeCapitais.first());

        // Retorna final da árvore
        System.out.println(treeCapitais.last());

        // Retorna capital acima na árvore
        System.out.println("higher: " + treeCapitais.higher("Florianópolis"));

        // Retorna capital abaixo na árvore
        System.out.println("lower: " + treeCapitais.lower("Florianópolis"));

        // Retorna primeira capital removendo da lista
        System.out.println(treeCapitais.pollFirst());

        // Retorna ultima capital removendo da lista
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.iterator();

        while(iterator.hasNext()){
            System.out.println("-> Iterator: " + iterator.next());
        }

        for (String i : treeCapitais) {
            System.out.println("-> ForEach: " + i);
        }


    }
}
