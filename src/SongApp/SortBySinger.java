package SongApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBySinger implements SortBehavior{
    private boolean ascending;
    

    public SortBySinger(boolean ascending) {
        this.ascending = ascending;
    }


    private List<MusicFile> sortBySinger(List<Album> albums) {
        List<MusicFile> result = new ArrayList<MusicFile>();
        
        for (Album album : albums) {
            for (MusicFile musicFile : album.getMusicFiles()) {
                result.add(musicFile);
            
            Collections.sort(result,new Comparator<MusicFile>() {
                
                @Override
                public int compare(MusicFile o1, MusicFile o2) {
                    if(ascending)
                        return o1.getSinger().compareTo(o2.getSinger());    
                    else return o2.getSinger().compareTo(o1.getSinger());
                }
                
            });
        }
    }

        return result;
    }

    @Override
    public List<MusicFile> sort(List<Album> albums) {
        return sortBySinger(albums);
    }
    
}
