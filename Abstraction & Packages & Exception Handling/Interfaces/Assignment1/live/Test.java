package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
	public static void main(String[] args) {
		Veena veena = new Veena();
		Saxophone saxophone = new Saxophone();
		Playable var1 = veena;
		Playable var2 = saxophone;
		
		veena.Play();
		saxophone.Play();
		var1.Play();
		var2.Play();
	}
}
