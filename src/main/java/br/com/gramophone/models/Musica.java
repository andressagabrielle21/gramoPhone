package br.com.gramophone.models;

import br.com.gramophone.math.Review;

public class Musica extends Audio implements Review {
    private String artist;
    private String album;

    public void newMusic(String title, String gender, String artist, String album) {
        super.newAudio(title, gender);
        this.artist = artist;
        this.album = album;
    }

    @Override
    public int getReview() {
        if (getTotalLikes() > 500) {
            return 5;
        } else if (getTotalLikes() <= 450 && getTotalLikes() >= 100) {
            return 3;
        } else {
            return 2;
        }
    }

    public String getInfo() {
        return "🎵 Você está escutando: " + getTitle() +
                "\nArtista: " + artist +
                "\nÁlbum: " + album +
                "\nGênero: " + getGender() +
                "\nLikes: " + getTotalLikes() +
                "\nClassificação: " + getReview() + "⭐";
    }
}
