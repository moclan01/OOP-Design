package SongApp;

import java.util.ArrayList;
import java.util.List;

public class SearchBySinger implements SearchBehavior {
    private String singer;

    public SearchBySinger(String singer) {
        this.singer = singer;
    }

    private List<MusicFile> searchBySinger(List<Album> albums){
        List<MusicFile> result = new ArrayList<MusicFile>();
        
        for (Album album : albums) {
            for(MusicFile musicFile : album.getMusicFiles()){
                if(musicFile.hasSinger(singer)){
                    result.add(musicFile);
                }
            }
        }
        return result;
    }

    @Override
    public List<MusicFile> search(List<Album> albums) {
        return searchBySinger(albums);
    }

}
