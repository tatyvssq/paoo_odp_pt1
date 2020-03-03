package fatec_ipi_paoo_tarde_observer_pt1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class Editora {
	
	private Entregavel ent = new Entregavel();
	private List <Observer> observers = new ArrayList <>();
	private int n;
	
	public void addObserver(Observer o) {
		observers.add(o);
		
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
		
	}

	public void notifyObservers() {
		List <Observer> aux = new ArrayList <> ();
		for (Observer o : observers) {
			o.update(null);
			
		}
		
	}
	
	public void iniciar() {
		Random gerador = new Random();
		Calendar hoje = Calendar.getInstance(); 
		
		
		/*while (true) {
			n = gerador.nextInt(10) + 1;
			notifyObservers();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("===========================================================");
		}*/
	}

}
