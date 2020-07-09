package Second_version;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1057, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(Color.YELLOW);
		progressBar.setStringPainted(true);
		progressBar.setForeground(Color.MAGENTA);
		
		
		JLabel lblNewLabel = new JLabel("Proceso Consumidor");
		
		JLabel lblProcesoProductor = new JLabel("Proceso Productor");
		
		JPanel panel = new JPanel();
		panel.setBackground( Color.CYAN );
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground( Color.BLUE );
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground( Color.GRAY );
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground( Color.GRAY );
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground( Color.GRAY );
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground( Color.RED );
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground( Color.RED );
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground( Color.RED );
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.YELLOW);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.YELLOW);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.YELLOW);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.GRAY);
		panel_14.add(panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.GREEN);
		panel_14.add(panel_16);
		
		JLabel lblNewLabel_1 = new JLabel("Buffer de elementos");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Buffer finito");
		buttonGroup.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Buffer infinito");
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("Tiempo de ejecuci\u00F3n");
		
		JLabel lblNewLabel_3 = new JLabel("...");
		
		JLabel lblNewLabel_4 = new JLabel("Tama\u00F1o del buffer");
		
		JLabel lblTiempoDeDesperdicio = new JLabel("Tiempo de desperdicio");
		
		JLabel label = new JLabel("...");
		
		JLabel lblNewLabel_5 = new JLabel("Numero de elementos");
		
		JLabel lblNewLabel_6 = new JLabel("Producidos:");
		
		JLabel lblConsumidos = new JLabel("Consumidos:");
		
		JLabel label_1 = new JLabel("...");
		
		JLabel label_2 = new JLabel("...");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("1 consumidor");
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("2 cosumidores");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel_7 = new JLabel("Escenario con:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Consumidor:");
		
		JLabel lblProductor = new JLabel("Productor:");
		
		JLabel label_4 = new JLabel("Tiempo de ejecuci\u00F3n");
		
		JLabel label_5 = new JLabel("...");
		
		JLabel label_6 = new JLabel("Tiempo de desperdicio");
		
		JLabel label_7 = new JLabel("...");
		
		JLabel lblConsumidor = new JLabel("Consumidor2:");
		
		JLabel label_8 = new JLabel("Tiempo de ejecuci\u00F3n");
		
		JLabel label_9 = new JLabel("...");
		
		JLabel label_10 = new JLabel("Tiempo de desperdicio");
		
		JLabel label_11 = new JLabel("...");
		
		char default_buffer[] = new char[10];
		int i[] = new int[1];
		i[0]=0;
		
		Productor Productor1  = new Productor(default_buffer,i,label_7,progressBar);
		Consumidor Consumidor1 = new Consumidor(default_buffer,i,1,label,progressBar);
		Consumidor Consumidor2 = new Consumidor(default_buffer,i,2,label_11,progressBar);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton.isSelected()){
					Productor1.infinito=false;
				}
				if(rdbtnNewRadioButton_1.isSelected()) {
					Productor1.infinito=true;
				}
				if(rdbtnNewRadioButton_2.isSelected()) {
					int t_buffer = Integer.parseInt(textField.getText());
					char main_buffer[]=new char[t_buffer];
					progressBar.setMaximum(t_buffer);
					
					Productor1.buffer_size=t_buffer;
					Consumidor1.buffer_size=t_buffer;
					
					Productor1.buffer=main_buffer;
					Consumidor1.buffer=main_buffer;
					
					Productor1.start();
					Consumidor1.start();
				}
				if (rdbtnNewRadioButton_3.isSelected()) {
					int t_buffer = Integer.parseInt(textField.getText());
					char main_buffer[]=new char[t_buffer];
					progressBar.setMaximum(t_buffer);
					
					Productor1.buffer_size=t_buffer;
					Consumidor1.buffer_size=t_buffer;
					Consumidor2.buffer_size=t_buffer;
					
					Productor1.buffer=main_buffer;
					Consumidor1.buffer=main_buffer;
					Consumidor2.buffer=main_buffer;
					
					Productor1.start();
					Consumidor1.start();
					Consumidor2.start();
				}
			}
		});
		
		JButton btnDetener = new JButton("Detener");
		btnDetener.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2.isSelected()) {
					Productor1.stop();
					Consumidor1.stop();
				}
				if (rdbtnNewRadioButton_3.isSelected()) {
					Productor1.stop();
					Consumidor1.stop();
					Consumidor2.stop();
				}
			}
		});
		
		JLabel label_3 = new JLabel("New label");
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.YELLOW);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(Color.GRAY);
		panel_17.add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(Color.GREEN);
		panel_17.add(panel_19);
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE))
							.addGap(8)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel_9)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(lblNewLabel_11))
										.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
											.addComponent(label_3)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(lblNewLabel_10))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(panel, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
												.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
										.addComponent(lblNewLabel_1))
									.addGap(72)
									.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblProcesoProductor, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_12)
												.addComponent(lblNewLabel_13))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))))))))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTiempoDeDesperdicio, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_8)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNewLabel_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblConsumidor))
							.addGap(53)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblProductor, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
							.addGap(77))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_7)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblConsumidos, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_6))
							.addContainerGap(507, Short.MAX_VALUE))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(50)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnIniciar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnDetener)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnNewRadioButton)
								.addComponent(rdbtnNewRadioButton_1))
							.addGap(32)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_4)
									.addGap(18))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnNewRadioButton_3)
								.addComponent(rdbtnNewRadioButton_2))))
					.addContainerGap(491, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(13)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(67)
										.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(lblNewLabel)
											.addComponent(lblProcesoProductor))
										.addGap(28)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
												.addGap(18)
												.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(label_3)
											.addComponent(lblNewLabel_10)
											.addComponent(lblNewLabel_12))
										.addGap(18)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(lblNewLabel_9)
											.addComponent(lblNewLabel_11)
											.addComponent(lblNewLabel_13))
										.addGap(22)
										.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lblNewLabel_1)
										.addGap(19)))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblProductor)
										.addGap(13)
										.addComponent(label_4)
										.addGap(16)
										.addComponent(label_5)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(label_6)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(label_7))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblNewLabel_8)
										.addGap(22)
										.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
											.addGroup(groupLayout.createSequentialGroup()
												.addGap(107)
												.addComponent(lblNewLabel_5)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblNewLabel_6)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(label_1)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(lblConsumidos)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(label_2))))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblConsumidor)
										.addGap(13)
										.addComponent(label_8)
										.addGap(16)
										.addComponent(label_9)
										.addGap(7)
										.addComponent(label_10)
										.addGap(7)
										.addComponent(label_11))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(39)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnIniciar)
										.addComponent(btnDetener)))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_7)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(rdbtnNewRadioButton)
										.addComponent(lblNewLabel_4)
										.addComponent(rdbtnNewRadioButton_2))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(rdbtnNewRadioButton_1)
										.addComponent(rdbtnNewRadioButton_3)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(74)
							.addComponent(lblNewLabel_2)
							.addGap(16)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblTiempoDeDesperdicio)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label)))
					.addContainerGap())
		);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.GRAY);
		panel_11.add(panel_13);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.GREEN);
		panel_11.add(panel_12);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.RED);
		panel_8.add(panel_10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.GRAY);
		panel_8.add(panel_9);
		frame.getContentPane().setLayout(groupLayout);
	}
}
