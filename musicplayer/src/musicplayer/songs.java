package musicplayer;

public class songs {
	private int id;
	private String songname;
	private String singername;
	private String lyrics;
	private String albumname;
	private String duration;

	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getName() {
		return songname;
	}
	public void setName(String name) {
		this.songname = name;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getSinger() {
		return singername;
	}
	public void setSinger(String singer) {
		this.singername = singer;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	public String getAlbum() {
		return albumname;
	}
	public void setAlbum(String album) {
		this.albumname = album;
	}

	songs(int number,String name,String duration,String singer,String lyrics,String album) {
		this.id=number;
		this.songname=name;
		this.duration=duration;
		this.singername=singer;
		this.lyrics=lyrics;
		this.albumname=album;
	}

	public String toString(){
		return  "\nID of the song\n"
				+this.id+
				"\nName of the song\n"
				+this.songname+
				"\nDuration of the song\n"
				+ this.duration+
				"\nSinger of the song\n"
				+this.singername+
				"\nLyrics writer of the song\n"
				+this.lyrics+
				"\nAlbum of the song\n"+this.albumname;
	}
	songs(){

	}

}
