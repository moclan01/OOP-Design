package SongApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByName implements SortBehavior {
    private boolean ascending;
    

    public SortByName(boolean ascending) {
        this.ascending = ascending;
    }


    private List<MusicFile> sortByName(List<Album> albums) {
        List<MusicFile> result = new ArrayList<MusicFile>();
        
        for (Album album : albums) {
            for (MusicFile musicFile : album.getMusicFiles()) {
                result.add(musicFile);
            
            Collections.sort(result,new Comparator<MusicFile>() {
                
                @Override
                public int compare(MusicFile o1, MusicFile o2) {
                    if(ascending)
                        return o1.getSong().getTitle().compareTo(o2.getSong().getTitle());
                    else return o2.getSong().getTitle().compareTo(o1.getSong().getTitle());
                }
                
            });
        }
    }

        return result;
    }

    @Override
    public List<MusicFile> sort(List<Album> albums) {
        return sortByName(albums);
    }

    
}
