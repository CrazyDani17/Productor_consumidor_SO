package Fourth_version;

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
import javax.swing.Box;
import javax.swing.JScrollPane;

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
		frame.setBounds(100, 100, 1232, 522);
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
		
		JLabel lblConsumidor_1 = new JLabel("Consumidor1");
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		
		JLabel lblNewLabel_10 = new JLabel("Consumidor 2");
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		
		JLabel lblNewLabel_12 = new JLabel("Productor");
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.YELLOW);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(Color.GRAY);
		panel_17.add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(Color.GREEN);
		panel_17.add(panel_19);
		
		JTextArea textArea = new JTextArea();
		
		char default_buffer[] = new char[10];
		int i[] = new int[1];
		i[0]=0;
		
		Productor Productor1  = new Productor(default_buffer,i,label_7,progressBar,lblNewLabel_13,textArea);
		Consumidor Consumidor1 = new Consumidor(default_buffer,i,1,label,progressBar,lblNewLabel_9,textArea);
		Consumidor Consumidor2 = new Consumidor(default_buffer,i,2,label_11,progressBar,lblNewLabel_11,textArea);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton.isSelected()){
					Productor1.infinito=false;
					Consumidor1.infinito=false;
					Consumidor2.infinito=false;
				}
				if(rdbtnNewRadioButton_1.isSelected()) {
					Productor1.infinito=true;
					Consumidor1.infinito=true;
					Consumidor2.infinito=true;
				}
				if(rdbtnNewRadioButton_2.isSelected()) {
					int t_buffer;
					if(rdbtnNewRadioButton_1.isSelected()){
						t_buffer=4;
					}
					else {
						t_buffer = Integer.parseInt(textField.getText());
					}
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
					int t_buffer;
					if(rdbtnNewRadioButton_1.isSelected()){
						t_buffer=4;
					}
					else {
						t_buffer = Integer.parseInt(textField.getText());
					}
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
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnDetenerC1 = new JButton("Detener C1");
		btnDetenerC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consumidor1.stop();
			}
		});
		
		JButton btnDetenerC2 = new JButton("Detener C2");
		btnDetenerC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consumidor2.stop();
			}
		});
		
		JButton btnIniciarC2 = new JButton("Iniciar C2");
		btnIniciarC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consumidor2.start();
			}
		});
		
		JButton btnIniciarP = new JButton("Iniciar P");
		btnIniciarP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Productor1.start();
			}
		});
		
		JButton btnIniciarC1 = new JButton("Iniciar C1");
		btnIniciarC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Consumidor1.start();
			}
		});
		
		JButton btnDetenerP = new JButton("Detener P");
		btnDetenerP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Productor1.stop();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(50)
							.addComponent(lblNewLabel)
							.addGap(151)
							.addComponent(lblProcesoProductor, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(12)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE))
									.addGap(8)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(panel, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
											.addGap(12)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
												.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
											.addGap(107)
											.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
											.addGap(7)
											.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblConsumidor_1)
											.addGap(7)
											.addComponent(lblNewLabel_10)
											.addGap(98)
											.addComponent(lblNewLabel_12))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel_9)
											.addGap(49)
											.addComponent(lblNewLabel_11)
											.addGap(98)
											.addComponent(lblNewLabel_13))
										.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1))
									.addGap(7)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(29)
											.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_8)
										.addComponent(lblNewLabel_2)
										.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTiempoDeDesperdicio, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
										.addComponent(label, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_5)
										.addComponent(lblNewLabel_6)
										.addComponent(label_1)
										.addComponent(lblConsumidos, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_2)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(12)
									.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
									.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(12)
											.addComponent(btnIniciar)
											.addGap(12)
											.addComponent(btnDetener)
											.addGap(8))
										.addGroup(groupLayout.createSequentialGroup()
											.addContainerGap()
											.addComponent(btnDetenerC1)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(btnDetenerC2)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnIniciarC1)
										.addComponent(btnDetenerP))
									.addGap(7)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(btnIniciarC2)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(rdbtnNewRadioButton))
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(9)
													.addComponent(btnIniciarP)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(rdbtnNewRadioButton_1)))
											.addGap(32)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_4)
												.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(8)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(rdbtnNewRadioButton_2)
												.addComponent(rdbtnNewRadioButton_3)
												.addComponent(lblConsumidor)
												.addComponent(label_8)
												.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(372)
											.addComponent(lblNewLabel_7)))
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(21)
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(30)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblProductor, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_4)
										.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))))))
					.addGap(405))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblProcesoProductor))
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(35)
											.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(7)
											.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(12)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(panel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(3)
													.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(18)
													.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
												.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
											.addGap(41)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblConsumidor_1)
												.addComponent(lblNewLabel_10)
												.addComponent(lblNewLabel_12))
											.addGap(18)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_9)
												.addComponent(lblNewLabel_11)
												.addComponent(lblNewLabel_13))
											.addGap(22)
											.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
											.addGap(7)
											.addComponent(lblNewLabel_1))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(38)
											.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
											.addGap(7)
											.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel_8)
											.addGap(13)
											.addComponent(lblNewLabel_2)
											.addGap(16)
											.addComponent(lblNewLabel_3)
											.addGap(7)
											.addComponent(lblTiempoDeDesperdicio)
											.addGap(7)
											.addComponent(label)
											.addGap(40)
											.addComponent(lblNewLabel_5)
											.addGap(7)
											.addComponent(lblNewLabel_6)
											.addGap(7)
											.addComponent(label_1)
											.addGap(13)
											.addComponent(lblConsumidos)
											.addGap(7)
											.addComponent(label_2)))
									.addGap(7)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(7))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblConsumidor)
									.addGap(13)
									.addComponent(label_8)
									.addGap(16)
									.addComponent(label_9)
									.addGap(7)
									.addComponent(label_10)
									.addGap(7)
									.addComponent(label_11)
									.addGap(227)))
							.addComponent(lblNewLabel_7)
							.addGap(3)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(rdbtnNewRadioButton)
										.addComponent(btnDetenerC2)
										.addComponent(btnIniciarC2)
										.addComponent(btnDetenerP))
									.addComponent(rdbtnNewRadioButton_1))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(4)
									.addComponent(lblNewLabel_4)
									.addGap(8)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(rdbtnNewRadioButton_2)
									.addComponent(rdbtnNewRadioButton_3))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnDetenerC1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnIniciar)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(btnDetener)
											.addComponent(btnIniciarC1)
											.addComponent(btnIniciarP))))))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblProductor)
							.addGap(13)
							.addComponent(label_4)
							.addGap(16)
							.addComponent(label_5)
							.addGap(7)
							.addComponent(label_6)
							.addGap(7)
							.addComponent(label_7)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		frame.getContentPane().setLayout(groupLayout);
		
	}
}
