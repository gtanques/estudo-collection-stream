import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExerciciosSet {
    public static void main(String[] args) throws Exception {
        Set<Integer> listaHashSetInteiros = new HashSet<>();
        LinkedHashSet<Integer> listaLinkedHashSetInteiros = new LinkedHashSet<>();
        TreeSet<Integer> listaTreeSetInteiros = new TreeSet<>();

        Integer[] arrayInteiros = { 4, 2, 23, 14, 55 };

        // Adicionar 5 números Inteiros
        for (int i = 0; i < arrayInteiros.length; i++) {
            listaHashSetInteiros.add(arrayInteiros[i]);
            listaLinkedHashSetInteiros.add(arrayInteiros[i]);
            listaTreeSetInteiros.add(arrayInteiros[i]);
        }

        System.out.println(listaHashSetInteiros);
        System.out.println(listaLinkedHashSetInteiros);
        System.out.println(listaTreeSetInteiros);

        System.out.println(listaHashSetInteiros.remove(3));
        System.out.println(listaLinkedHashSetInteiros.remove(3));
        System.out.println(listaTreeSetInteiros.pollFirst());

        listaHashSetInteiros.add(33);
        listaLinkedHashSetInteiros.add(23);
        listaTreeSetInteiros.add(23);

        System.out.println(listaHashSetInteiros);
        System.out.println(listaLinkedHashSetInteiros);
        System.out.println(listaTreeSetInteiros);

        System.out.println(listaHashSetInteiros.size());
        System.out.println(listaLinkedHashSetInteiros.size());
        System.out.println(listaTreeSetInteiros.size());

        System.out.println(listaHashSetInteiros.isEmpty());
        System.out.println(listaLinkedHashSetInteiros.isEmpty());
        System.out.println(listaTreeSetInteiros.isEmpty());

        listaHashSetInteiros.clear();
        listaLinkedHashSetInteiros.clear();
        listaTreeSetInteiros.clear();

        System.out.println(listaHashSetInteiros.isEmpty());
        System.out.println(listaLinkedHashSetInteiros.isEmpty());
        System.out.println(listaTreeSetInteiros.isEmpty());


    }
}
