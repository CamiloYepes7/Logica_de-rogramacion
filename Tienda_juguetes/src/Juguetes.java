
public class Juguetes {

	public static void main(String[] args) {
		
	 Juguete jugue1 = new Juguete();

	        
	        System.out.println("Nombre del juguete: " + jugue1.getnombre());
	        System.out.println("Precio del juguete: $" + jugue1.getPrecio());
	        System.out.println("Cantidad en stock: " + jugue1.getStock());


	        if (jugue1.estaDisponible()) {
	            System.out.println("El juguete está disponible");
	        } else {
	            System.out.println("El juguete no está disponible.");
	        }
	    }
	}
