package playlist;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Playlist {
//---------------------------ATRIBUTOS-----------------------------------
	private ArrayList<Cancion> canciones=new ArrayList();
	private String nombre;
	private int cantidadcanciones;
	private int tiempodeplaylist;
//--------------------------CONSTRUCTORES--------------------------------
	public Playlist(String nombre) 
	{
		setNombre(nombre);
	}
	public Playlist() 
	{
		
	}
//GETTERS Y SETTERS
	public ArrayList<Cancion> getCanciones() 
	{
		return this.canciones;
	}
	public void setCanciones(ArrayList<Cancion> canciones) 
	{
		this.canciones=canciones;
	}
	public String getNombre() 
	{
		return this.nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public int getCantidadCanciones() 
	{
		return this.cantidadcanciones;
	}
	public void setCantidadCanciones(int cantidadcanciones) 
	{
		this.cantidadcanciones=cantidadcanciones;
	}
	public int getTiempoDePlaylist() 
	{
		return this.tiempodeplaylist;
	}
	public void setTiempoDePlaylist(int tiempodeplaylist) 
	{
		this.tiempodeplaylist=tiempodeplaylist;
	}
//--------------------------------------METODOS RESOLUTIVOS-------------------------------------
//METODO PARA CONTAR LAS CANTIDAD DE CANCIONES;
	public int cantidadTotalCanciones() {
		setCantidadCanciones(getCanciones().size());
		return getCantidadCanciones();
	}
	public void agregar(Cancion tema) 
	{
		getCanciones().add(tema);
	}
//corregir buscar cancion en playlist por titulo
//utilizar catch y exception;
	public void quitar(String tema) 
	{	int x=0;
		try {
		for(Cancion cancion:getCanciones())
			if(cancion.getTitulo().matches(tema)){	
				getCanciones().remove(x);
				return;
			}
			x++;
		}
		catch(Exception MiException){
			System.out.println("Cancion no encontrada ");
		}
		finally 
		{
			System.out.println("Busqueda Finalizada ");
		}
	}
//METODO PARA CONSULTAR LAS CANCIONES QUE TIENE
	public void cancionesQueTiene() 
	{
		for(Cancion temas:getCanciones()) 
		{
			System.out.println(temas);
		}
	}
//METODO PARA CALCULAR LA DURACION TOTAL
	public int totalDuracion()
	{
		int total=0;
		for(Cancion total1:getCanciones()){
			total+=total1.getDuracion();
		}
		return total;
	}
//METODO PARA ARCHIVAR
	//repasar porque tengo que utlizar el IOException para archivos?
	public void archivar() throws IOException 
	{	String x=("C:\\Users\\54113\\Downloads");
		BufferedWriter a=new BufferedWriter(new FileWriter(x +"Mi Lista.txt"));
		for(Cancion c:getCanciones()) 
		{
			a.write("Titulo:"+c.getTitulo()+"\t"+"Duracion"+c.getDuracion());
			a.newLine();
		}
		a.close();
	}
	
//METODO EQUALS
	
	
}
