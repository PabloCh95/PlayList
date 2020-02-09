package playlist;

public class Cancion {
//----------------------------Atributos-----------------------------------------
	private String titulo;
	private int duracion;
//----------------------------Constructores-------------------------------------
	public Cancion(String titulo,int duracion) 
	{
		setTitulo(titulo);
		setDuracion(duracion);
	}
//GETTERS Y SETTERS
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
//METODO EQUALS
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", duracion=" + duracion + "]";
	}
	
}
