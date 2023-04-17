package SongApp;

public class Song {
    private String title;
    private String lyrics;
    private String author;
    private String type;

    public Song(String title, String lyrics, String author, String type) {
        this.title = title;
        this.lyrics = lyrics;
        this.author = author;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
