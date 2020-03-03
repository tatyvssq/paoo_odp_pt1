package fatec_ipi_paoo_tarde_observer_pt1;

public interface Subject {
	
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();


}
