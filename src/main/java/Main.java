import br.com.gramophone.models.Audio;
import br.com.gramophone.models.Musica;
import br.com.gramophone.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica music1 = new Musica();
        music1.newMusic("No Hard Feelings", "Indie/Folk", "The Avett Brothers", "All the ways you can say goodbye");
        for (int i = 0; i < 400 ; i++) {
            music1.likeThisAudio();
        }
        System.out.println(music1.getInfo());

        System.out.println("\n ***************************** \n");

        Podcast pod2 = new Podcast();
        pod2.newPodcast("Bom dia, Obvious", "Comportamento", "Marcella Ceribelli", "Conversas com mulheres sobre mulheres.");
        for(int i = 0; i < 909; i++) {
            pod2.likeThisAudio();
        }
        for (int i = 0; i < 1000; i++) {
            pod2.playThisAudio();
        }
        System.out.println(pod2.getInfo());
    }
}