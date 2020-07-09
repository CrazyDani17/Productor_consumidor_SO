package Third_version;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

import java.util.Arrays;

public class Productor extends Thread {
	public char buffer[];
	private int indice[];
	private char letras [] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	JLabel tespera;
	JLabel action;
	boolean infinito=false;
	JProgressBar buffer_bar;
	int buffer_size;
	JTextArea mensajes;
	
	public Productor(char bf[], int i[], JLabel te, JProgressBar bf_b, JLabel act, JTextArea m) {
		this.buffer = bf;
		this.indice = i;
		this.tespera = te;
		this.buffer_bar = bf_b;
		this.action = act;
		this.mensajes = m;
    }
	public void run() {
		char producto;
		int max=0;
		while(true) {
			if(infinito) {
				if(indice[0]<buffer_size) {
					producto=letras[(int)(Math.random() * 26)];
					//buffer[indice[0]]=producto;
					if(indice[0]<buffer_size-1) {
						indice[0]++;
					}
					else {
						buffer_size+=10;
						buffer = Arrays.copyOf(buffer, buffer_size);
						buffer_bar.setMaximum(buffer_size);
						indice[0]++;
					}
					buffer_bar.setValue(indice[0]+1);
					String ind = Long.toString(indice[0]);
					action.setText(ind);
					System.out.println("Productor a producido: " + producto + " Indice=" + indice[0]);
					mensajes.append("Productor a producido: " + producto + " Indice=" + indice[0] +"\n");
					try {
						//está produciendo
						sleep((int) (Math.random() * 2000));
						System.out.println("Productor está trabajando");
						mensajes.append("Productor está trabajando" +"\n");
		            }
					catch (InterruptedException e) {
						System.out.println(e);
					}
				}
			}
			else {
				if(indice[0]<buffer_size && max==0) {
					producto=letras[(int)(Math.random() * 26)];
					buffer[indice[0]]=producto;
					if(indice[0]<buffer_size-1) {
						indice[0]++;
					}
					else {
						max=1;
					}
					buffer_bar.setValue(indice[0]+1);
					String ind = Long.toString(indice[0]);
					action.setText(ind);
					System.out.println("Productor a producido: " + producto + " Indice=" + indice[0]);
					mensajes.append("Productor a producido: " + producto + " Indice=" + indice[0] +"\n");
					try {
						//está produciendo
						sleep((int) (Math.random() * 2000));
						System.out.println("Productor está trabajando");
						mensajes.append("Productor está trabajando" +"\n");
		            }
					catch (InterruptedException e) {
						System.out.println(e);
					}
				}
				else {
					try {
						//está esperando
						System.out.println("Productor está esperando");
						mensajes.append("Productor está esperando" +"\n");
						long inicio = System.nanoTime();
						sleep((int) (Math.random() * 2000));
						long fin = System.nanoTime();
						long tiempo = fin - inicio;
						String t = Long.toString(tiempo);
						tespera.setText(t);
						max=0;
		            }
					catch (InterruptedException e) {
						System.out.println(e);
					}
				}
			}
		}
	}
}
