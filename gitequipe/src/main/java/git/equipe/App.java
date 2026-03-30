package git.equipe;

import java.util.ArrayList;
import java.util.List;

import git.equipe.modelo.Animal;
import git.equipe.modelo.Gato;
import git.equipe.modelo.Tigre;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Animal> animais = new ArrayList<>();

        Animal tigre = new Tigre("Tibre-siberiano", "fêmea", 5);
        Animal gato = new Gato( "Gato Persa", "macho", 3);

        animais.add(tigre);
        animais.add(gato);

        for (Animal animal : animais) {
            System.out.println(animal);
            System.out.println("Som: " + animal.emitirSom());
            System.out.println("-------------------");
        }
    }
    
}
