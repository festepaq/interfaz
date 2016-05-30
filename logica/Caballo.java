package logica;

import java.util.ArrayList;
import java.util.List;

public class Caballo extends Pieza{
	
	private static List<Movimiento> movimientos;
	
	static {
		movimientos = new ArrayList<>(8);
		Movimiento dosArribaUnoDerecha = new Movimiento(1, 2, true, true, true, 1);
		Movimiento unoArribaDosDerecha = new Movimiento(2, 1, true, true, true, 1);
		Movimiento unoAbajoDosDerecha = new Movimiento(2, -1, true, true, true, 1);
		Movimiento dosAbajoUnoDerecha = new Movimiento(1, -2, true, true, true, 1);
		Movimiento dosAbajoUnoIzquierda = new Movimiento(-1, -2, true, true, true, 1);
		Movimiento unoAbajoDosIzquierda = new Movimiento(-2, -1, true, true, true, 1);
		Movimiento unoArribaDosIzquierda = new Movimiento(-2, 1, true, true, true, 1);
		Movimiento dosArribaUnoIzquierda = new Movimiento(-1, 2, true, true, true, 1);
		movimientos.add(dosArribaUnoDerecha);
		movimientos.add(unoArribaDosDerecha);
		movimientos.add(unoAbajoDosDerecha);
		movimientos.add(dosAbajoUnoDerecha);
		movimientos.add(dosAbajoUnoIzquierda);
		movimientos.add(unoAbajoDosIzquierda);
		movimientos.add(unoArribaDosIzquierda);
		movimientos.add(dosArribaUnoIzquierda);
	}

	public Caballo(Color color){
		super(color);
	}
	
	@Override
	public List<Movimiento> dameMovimientos() {
		return movimientos;
	}
}
