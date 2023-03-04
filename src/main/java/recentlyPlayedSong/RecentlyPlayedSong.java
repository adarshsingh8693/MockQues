package recentlyPlayedSong;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RecentlyPlayedSong {
	
	
	    private int capacity;
	    private Map<String, List<String>> store;

	    public RecentlyPlayedSong(int capacity) {
	        this.capacity = capacity;
	        this.store = new HashMap<String, List<String>>();
	    }

	    public void addSong(String user, String song) {
	        List<String> playlist = store.get(user);
	        if (playlist == null) {
	            playlist = new LinkedList<String>();
	            store.put(user, playlist);
	        }

	        playlist.add(song);

	        
	        if (playlist.size() > capacity) {
	            playlist.remove(0);
	        }
	    }

	    public List<String> getRecentlyPlayed(String user) {
	        List<String> playlist = store.get(user);
	        if (playlist == null) {
	            return Collections.emptyList();
	        }
	        return new ArrayList<String>(playlist);
	    }
	}
	
	
	

