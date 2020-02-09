package playlist;

import java.io.IOException;

public class TestPlayList {

	public static void main(String[] args) throws IOException {
		Cancion primertema=new Cancion("How He loves",210);
		Cancion segundotema=new Cancion("Saviour King", 330);
		Cancion tercertema=new Cancion("This is Our God", 320);
		Playlist milista=new Playlist();
		//System.out.println(primertema.toString());
		milista.agregar(primertema);
		milista.agregar(segundotema);
		milista.agregar(tercertema);
		milista.archivar();
	

	}

}
