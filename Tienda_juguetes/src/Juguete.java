
public abstract class Juguete {

	//atributos
	private String nombre;
	   private int precio;
		private int stock;
	
	 public Juguete(String nombre, double precio, int stock) {
	        this.nombre = nombre;
	        this.precio = (int) precio;
	        this.stock = stock;
	    }

	
	    public void setnombre(String nombre) {
	        this.nombre = nombre;
	    }


	    public String getnombre() {
	        return nombre;
	    }

	    public void setPrecio(double precio) {
	        this.precio = (int) precio;
	    }

	    
	    public double getPrecio() {
	        return precio;
	    }

	  
	    public void setStock(int stock) {
	        this.stock = stock;
	    }


	    public int getStock() {
	        return stock;
	    }

	    public boolean estaDisponible() {
	        if (stock > 0) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	
	
	
	
}
