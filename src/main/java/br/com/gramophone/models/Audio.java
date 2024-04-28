package br.com.gramophone.models;

public class Audio {
    private String title;
    private int totalStreams;
    private int totalLikes;
    private String gender;

    public void newAudio(String title, String gender) {
        this.title = title;
        this.gender = gender;
    }

    public void playThisAudio() {
        totalStreams += 1;
    }

    public void likeThisAudio() {
        totalLikes += 1;
    }

    public String getTitle() {
        return title;
    }

    public String getGender() {
        return gender;
    }

    public int getTotalStreams() {
        return totalStreams;
    }

    public int getTotalLikes() {
        return totalLikes;
    }


}
