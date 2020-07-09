package Second_version;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Consumidor extends Thread {
	public char buffer[];
	private int indice[];
	private int number;
	int buffer_size;
	JProgressBar buffer_bar;
	JLabel tespera;
	//JLabel tejecucion;
	
	public Consumidor(char bf[],int i[], int n, JLabel te, JProgressBar bf_b) {
		this.buffer = bf;
		this.indice = i;
		this.number = n;
		this.tespera = te;
		this.buffer_bar = bf_b;
    }
	public void run(){
		System.out.println("Consumidor "+number+" empezó");
		while(true) {
			if(indice[0]>0){
				System.out.println("Consumidor "+number+" a consumido: " + buffer[indice[0]] + " Indice=" + indice[0]);
				indice[0]--;
				buffer_bar.setValue(indice[0]);
				try {
					//está consumiendo
					sleep((int) (Math.random() * 2000));
	            }
				catch (InterruptedException e) {
					System.out.println(e);
				}
			}
			else {
				try {
					//está esperando
					System.out.println("Consumidor "+ number + " está esperando");
					long inicio = System.nanoTime();
					sleep((int) (Math.random() * 2000));
					long fin = System.nanoTime();
					long tiempo = fin - inicio;
					String t = Long.toString(tiempo);
					tespera.setText(t);
	            }
				catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}
}
