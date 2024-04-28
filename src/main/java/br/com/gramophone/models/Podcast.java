package br.com.gramophone.models;

import br.com.gramophone.math.Review;

public class Podcast extends Audio implements Review {
    private String host;
    private String description;

    public void newPodcast(String title, String gender, String host, String description) {
        super.newAudio(title, gender);
        this.host = host;
        this.description = description;
    }

    @Override
    public int getReview() {
        if (getTotalStreams() > 800) {
            return 5;
        } else {
            return 2;
        }
    }

    public String getInfo() {
        return "🗣️ Você está escutando: " + getTitle() +
                "\nArtista: " + host +
                "\nDescrição: " + description +
                "\nGênero: " + getGender() +
                "\nLikes: " + getTotalLikes() +
                "\nClassificação: " + getReview() + "⭐";
    }
}
