package java_patterns;

interface MediaPlayer{
	public void play(String audiotype,String filename);
}
class MediaAdapter implements MediaPlayer{
	private AdvanceMediaPlayer advncemediaplayer;
	public MediaAdapter(String audiotype){
		if(audiotype.equalsIgnoreCase("mp4")){
			advncemediaplayer=new Mp4();
			
		}
		else if (audiotype.equalsIgnoreCase("vlc")){
			advncemediaplayer=new Vlcplayer();
		}
		
	}
	public void play(String audiotype,String filename){
		if(audiotype.equalsIgnoreCase("vlc")){
			advncemediaplayer.playVlc(filename);
		}
		else if(audiotype.equalsIgnoreCase("mp4")){
			advncemediaplayer.playMp4(filename);
		}
		
	}
}
interface AdvanceMediaPlayer{
	public void playVlc(String filename);
	public void playMp4(String filename);
	
}
class Vlcplayer implements AdvanceMediaPlayer{
	public void playVlc(String filename){
		System.out.println("File "+filename+" is being played.");
	}

	@Override
	public void playMp4(String filename) {
		// TODO Auto-generated method stub
		
	}
}
class Mp4 implements AdvanceMediaPlayer{

	@Override
	public void playVlc(String filename) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playMp4(String filename) {
		// TODO Auto-generated method stub
		System.out.println("File "+filename+" is being played");
		
	}
	
}
class AudioPlayer implements MediaPlayer{
	MediaAdapter medadptr;
	@Override
	public void play(String audiotype, String filename) {
		// TODO Auto-generated method stub
		if (audiotype.equalsIgnoreCase("mp3")){
			System.out.println("File "+filename+" is getting played.");
		}
		else if(audiotype.equalsIgnoreCase("vlc")|| audiotype.equalsIgnoreCase("mp4")){
			medadptr=new MediaAdapter(audiotype);
			medadptr.play(audiotype, filename);
		}
		
	}
	
}
public class Adapter {
	public static void main(String[] args){
		AudioPlayer aud=new AudioPlayer();
		aud.play("mp3", "hello brother");
		aud.play("vlc", "yoyo");
		aud.play("vlc", "klwer");
	}
}
