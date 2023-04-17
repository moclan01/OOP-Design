package SongApp;

import java.util.ArrayList;
import java.util.List;

public class Website {
    private List<Album> albums;

    public Website(List<Album> albums) {
        this.albums = new ArrayList<Album>();
    }

    public void addAlbum(Album album) {
        this.albums.add(album);
    }

    public void sortBy(SortBehavior ... behaviors){
        
    }
}
