package Fourth_version;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class Consumidor extends Thread {
	public char buffer[];
	private int indice[];
	private int number;
	int buffer_size;
	boolean infinito;
	JProgressBar buffer_bar;
	JLabel tespera;
	JLabel action;
	JTextArea mensajes;
	//JLabel tejecucion;
	
	public Consumidor(char bf[],int i[], int n, JLabel te, JProgressBar bf_b, JLabel act, JTextArea m) {
		this.buffer = bf;
		this.indice = i;
		this.number = n;
		this.tespera = te;
		this.buffer_bar = bf_b;
		this.action = act;
		this.mensajes = m;
    }
	public void run(){
		System.out.println("Consumidor "+number+" empezó");
		while(true) {
			if(indice[0]>0){
				if(infinito!=true) {
					System.out.println("Consumidor "+number+" a consumido: " + buffer[indice[0]] + " Indice=" + indice[0]);
					mensajes.append("Consumidor "+number+" a consumido: " + buffer[indice[0]] + " Indice=" + indice[0] +"\n");
				}
				else {
					System.out.println("Consumidor "+number+" a consumido: en el Indice=" + indice[0]);
					mensajes.append("Consumidor "+number+" a consumido: en el Indice=" + indice[0] +"\n");
				}
				if(indice[0]>0){
					indice[0]--;
				}
				buffer_bar.setValue(indice[0]);
				String ind = Long.toString(indice[0]);
				action.setText(ind);
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
					mensajes.append("Consumidor "+ number + " está esperando"+"\n");
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
