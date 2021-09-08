package chapter03;

public class SongTest {

	public static void main(String[] args) {
		
/*		Song song = new Song();
		song.setAlbum("real");
		song.setArtist("아이유");
		song.setComposer("이민수");
		song.setTitle("좋은 날");
		song.setTrack(3);
		song.setYear(2010);
*/
		Song song1 = new Song("좋은 날", "아이유", "이민수", "Real", 2010, 3);
		song1.show();
		
		Song song2 = new Song("신호등", "이무진");
		song2.show();
	}

}
