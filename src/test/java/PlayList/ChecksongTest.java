package PlayList;

import java.util.Scanner;

import org.testng.annotations.Test;

import recentlyPlayedSong.RecentlyPlayedSong;

public class ChecksongTest {
	@Test
	public void song() {
	for(;;)	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the song eg(S1,S2,S3,S4)");
	String Song=sc.next();
	
	RecentlyPlayedSong store = new RecentlyPlayedSong(3);

	store.addSong("user1", "S1");
	store.addSong("user1", "S2");
	store.addSong("user1", "S3");



	store.addSong("user1", Song);

	System.out.println(store.getRecentlyPlayed("user1"));  // Output: [S2, S3, S4]


	}
	}
}
