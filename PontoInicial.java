package fatec_ipi_paoo_tarde_observer_pt1;

public class PontoInicial {

	public static void main(String[] args) {
		
		Editora gerador = new Editora();
		
		gerador.addObserver(new Joao());
		gerador.addObserver(new Jose());
		gerador.addObserver(new Maria());
		gerador.iniciar();
		

	}

}
