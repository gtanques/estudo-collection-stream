import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExCollection {
    public static void main(String[] args) throws Exception {

        System.out.println("-------------ArrayList-------------");
        List<String> chamada = new ArrayList<>();
        
        chamada.add("Naruto");
        chamada.add("Hinata");
        chamada.add("Sasuke");
        chamada.add("Sakura");
        chamada.add("Shikamaru");
        chamada.add("Temari");

        System.out.println("\n==============Foreach==============");

        for(String a : chamada){
            System.out.println(a);                
        }        

        System.out.println("\n==============Desordenada==============");

        // Desordenada
        System.out.println(chamada);

        System.out.println("\n==============Ordenação==============");
                
        // Ordenação alfabética
        Collections.sort(chamada);
        
        // Ordenada
        System.out.println(chamada);

        System.out.println("\n==============Size==============");

        // Tamanho lista
        System.out.println("tamanho da lista: " + chamada.size());    

        System.out.println("\n==============Contains==============");
        
        // Contém
        String contem = chamada.contains("Naruto") ? "datte bayo!" : "baka...";
        System.out.println("Naruto? R:" + contem);
        
        System.out.println("\n==============Novo Index==============");

        // Alterar index
        chamada.set(5, "Tenten");

        // novo index 5
        System.out.println(chamada.get(5));


        System.out.println("\n==============Iterator==============");

        // Iterator
        Iterator<String> iterator = chamada.iterator();
        while (iterator.hasNext()) {            
            System.out.println(iterator.next());
        }                
    }       
}


