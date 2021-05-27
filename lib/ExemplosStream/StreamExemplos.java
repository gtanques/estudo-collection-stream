import java.io.IOException;
import java.util.stream.Collectors;

public class StreamExemplos{
    public static void main(String[] args){
        List<String> estudantes = new ArrayList<>();
        estudantes.addAll(Arrays.asList("Pedro", "Thayse", "Marcelo", "Carla", "Juliana", "Thiago", "Rafael"));

        // Contagem do elemento
        System.out.println("Contagem: " +
            estudantes
                .stream()
                .count());

        // Retorna o elemento com maior número de letras
        System.out.println("Contagem: " +
            estudantes
                .stream()
                .max(Comparator.comparingInt(String::length)));

        // Retorna o elemento com menor número de letras
        System.out.println("Contagem: " +
            estudantes
                .stream()
                .min(Comparator.comparingInt(String::length)));

        // Retorna os elementos que tem a letra R
        System.out.println("Contém R: " +
            estudantes
                .stream()
                .filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        // Retorna uma nova coleção, com os nomes contatenados a quantidade de letra dos elementos
        System.out.println("Retorna nova coleção com numero de letras dos elementos: " +
            estudantes
                .stream()
                .map(estudante -> estudante.concat(" - ")
                .concat(String.valueOf(estudante.length())))
                .collect(Collectors.toList()));

        // Exibe elementos e retorna a mesma coleção
        System.out.println("Retorna os elementos " +
            estudantes
                .stream()
                .peek(System.out::println)
                .collect(Collectors.toList()));

        // Retorna os Elementos
        System.out.println("Somente retorna os elementos da lista");
        estudantes
            .stream()
            .forEach(System.out::println);

        // Retorna true se todos os elementos possuem a letra W no nome
        System.out.println("Existem W em todos os elementos?: " +
                estudantes.stream()
                .allMatch((elemento) -> elemento.contains("W")));

        // Retorna true se algum dos elementos possuem a letra 'a' minuscula
        System.out.println("Existem 'a' em algum dos elementos?: " +
                estudantes
                    .stream()
                    .anyMatch((elemento) -> elemento.contains("a")));

        // Retorna true se nenhum dos elementos possuem a letra 'a' minuscula
        System.out.println("Nenhum dos elementos possuem 'a'?: " +
                estudantes
                    .stream()
                    .noneMatch((elemento) -> elemento.contains("a")));

        // Retorna o primeiro elemento da coleção
        System.out.print("Retorna o primeiro elemento da coleção: ");
            estudantes
                .stream()
                .findFirst()
                .ifPresent(System.out::println);


        // Exemplo de operação encadeada
        System.out.print("Operação encadeada: ");
        System.out.println(
                estudantes
                    .stream()
                    .peek(System.out::println)
                    .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                    .peek(System.out::println)
                    .filter((estudante) -> estudante.toLowerCase().contains("r"))
                    .collect(Collectors.toList())
        );
    }
}