package Song;

import java.util.HashSet;
import java.util.Set;

public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist() {
        if(nextSong == null) return false;
        
        Song ns = nextSong;
        Song ps = nextSong;
        while(ns!= null && ns.name != name) {
        	ps = ns;
        	ns = ns.nextSong;
        }
        
        if(ps != null && ps.nextSong != null && ps.nextSong.name == name) return true;
        
        return false;
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");
        Song third = new Song("test 3");
        Song fourth = new Song("test 4");

        first.setNextSong(third);
        third.setNextSong(fourth);
        fourth.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}
