package SongApp;

import java.util.ArrayList;
import java.util.List;

public class Website {
    private List<Album> albums;

    public Website() {
        this.albums = new ArrayList<Album>();
    }

    public void addAlbum(Album album) {
        this.albums.add(album);
    }

    public List<MusicFile> searchBy(SearchBehavior ... sBehaviors){
        List<MusicFile> result = new ArrayList<MusicFile>();
        boolean isFirstSearch = true;
        for(SearchBehavior sBehavior : sBehaviors){
            // kiểm tra lần search đầu tiên
            if(isFirstSearch){
                result.addAll(sBehavior.search(albums));
                isFirstSearch = false;  
            } else {
                // tạo danh sách album mới
                Album sAlbum = new Album();
                List<Album> sAlbums = new ArrayList<Album>();

                for(MusicFile musicFile : result){
                    sAlbum.addMusicFile(musicFile);
                }
                sAlbums.add(sAlbum);
                result = sBehavior.search(sAlbums);
            }
        }

        return result;
    }

    public List<MusicFile> sortBy(SortBehavior ... sBehaviors){
        List<MusicFile> result = new ArrayList<MusicFile>();
        for(SortBehavior sBehavior : sBehaviors){
                result.addAll(sBehavior.sort(albums));
        }
        return result;
    }
}
