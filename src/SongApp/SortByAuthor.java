package SongApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByAuthor implements SortBehavior {
    private boolean ascending;
    

    public SortByAuthor(boolean ascending) {
        this.ascending = ascending;
    }


    private List<MusicFile> sortByAUthor(List<Album> albums) {
        List<MusicFile> result = new ArrayList<MusicFile>();
        
        for (Album album : albums) {
            for (MusicFile musicFile : album.getMusicFiles()) {
                result.add(musicFile);
            
            Collections.sort(result,new Comparator<MusicFile>() {
                
                @Override
                public int compare(MusicFile o1, MusicFile o2) {
                    if(ascending)
                        //sắp xếp tăng dần
                        return o1.getSong().getAuthor().compareTo(o2.getSong().getAuthor());
                        //sắp xếp giảm dần
                    else return o2.getSong().getAuthor().compareTo(o1.getSong().getAuthor());
                }
                
            });
        }
    }

        return result;
    }

    @Override
    public List<MusicFile> sort(List<Album> albums) {
        return sortByAUthor(albums);
    }

}
