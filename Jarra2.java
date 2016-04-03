package prJarra;

public class Jarra {

	public void llenaDesde(Jarra j) {
		while ((this.cantidad < this.capacidad) && (j.cantidad > 0)) {
			this.cantidad++;
			j.cantidad--;
		}
	}
}