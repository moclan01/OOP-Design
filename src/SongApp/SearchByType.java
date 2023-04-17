package SongApp;

import java.util.ArrayList;
import java.util.List;

public class SearchByType implements SearchBehavior{
    private String type;

    public SearchByType(String type) {
        this.type = type;
    }

    public List<MusicFile> searchByType(List<Album> albums) {
        List<MusicFile> result = new ArrayList<MusicFile>();

        for(Album album : albums){
            for(MusicFile musicFile : album.getMusicFiles()){
                if(musicFile.hasType(type)){
                    result.add(musicFile);
                }
            }
        }
        return result;
    }
    @Override
    public List<MusicFile> search(List<Album> albums) {
        return searchByType(albums);
    }
    

}
