package SongApp;

import java.util.List;

public class MusicFile {
    private Song song;
    private String singer;
    private String pathMusicFile;
    private long accessTimes;

    public MusicFile(Song song, String singer, String pathMusicFile, long accessTimes) {
        this.song = song;
        this.singer = singer;
        this.pathMusicFile = pathMusicFile;
        this.accessTimes = accessTimes;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getPathMusicFile() {
        return pathMusicFile;
    }

    public void setPathMusicFile(String pathMusicFile) {
        this.pathMusicFile = pathMusicFile;
    }

    public long getAccessTimes() {
        return accessTimes;
    }

    public void setAccessTimes(long accessTimes) {
        this.accessTimes = accessTimes;
    }

    @Override
    public String toString() {
        return song.getTitle() + ", " + song.getAuthor() + ", " + accessTimes;
    }

    public boolean hasName(String name){
        return song.getTitle().contains(name);
    }

    public boolean hasAuthor(String author){
        return song.getAuthor().contains(author);
    }

    public boolean hasSinger(String singer){
        return this.singer.contains(singer);
    }

    public boolean hasType(String type){
        return song.getType().contains(type);
    }

}
