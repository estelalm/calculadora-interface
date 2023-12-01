package br.sp.senai.jandira;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calcular extends JFrame implements ActionListener{

	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btn0 = new JButton("0");
	JButton btnponto = new JButton(".");
	
	JButton btnMais = new JButton("+");
	JButton btnMenos = new JButton("-");
	JButton btnVezes = new JButton("x");
	JButton btnDividido = new JButton("/");
	JButton btnIgual = new JButton("=");
	JButton btnClear = new JButton("C");
	
	JTextField display = new JTextField();
	
	JLabel lblTitulo = new JLabel("Calculadora");
	JButton btnInfo = new JButton("?");

	
	public Calcular () {
		
		setTitle("Calculadora de IMC");
		setSize(320, 430);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		
		Container c = getContentPane();
		c.setBackground(new Color(161, 209, 169));
		
		lblTitulo.setBounds(40,10,100,20);
		lblTitulo.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTitulo.setForeground(new Color(61, 71, 62));
		
		btnInfo.addActionListener(this);
		btnInfo.setBounds(250,10,20,20);
		btnInfo.setBackground(new Color(129, 184, 137));
		btnInfo.setForeground(new Color(61, 71, 62));
		btnInfo.setBorder(null);
		
		
		//display
		display.setBounds(40, 40, 230, 50);
		display.setBackground(new Color(129, 184, 137));
		display.setForeground(new Color(61, 71, 62));
		display.setEditable(false);
		display.setFont(new Font("Arial", Font.PLAIN, 16));
		display.setHorizontalAlignment(JTextField.CENTER);
//		display.setEnabled(false);
		
		//botões números
		btn1.addActionListener(this);
		btn1.setBounds(40,100,50,50);
		btn1.setBackground(new Color(129, 184, 137));
		btn1.setForeground(new Color(61, 71, 62));
		btn1.setBorder(null);
		
		btn2.addActionListener(this);
		btn2.setBounds(100,100,50,50);
		btn2.setBackground(new Color(129, 184, 137));
		btn2.setForeground(new Color(61, 71, 62));
		btn2.setBorder(null);
		
		btn3.addActionListener(this);
		btn3.setBounds(160,100,50,50);
		btn3.setBackground(new Color(129, 184, 137));
		btn3.setForeground(new Color(61, 71, 62));
		btn3.setBorder(null);
		
		btn4.addActionListener(this);
		btn4.setBounds(40,160,50,50);
		btn4.setBackground(new Color(129, 184, 137));
		btn4.setForeground(new Color(61, 71, 62));
		btn4.setBorder(null);

		btn5.addActionListener(this);
		btn5.setBounds(100,160,50,50);
		btn5.setBackground(new Color(129, 184, 137));
		btn5.setForeground(new Color(61, 71, 62));
		btn5.setBorder(null);
		
		btn6.addActionListener(this);
		btn6.setBounds(160,160,50,50);
		btn6.setBackground(new Color(129, 184, 137));
		btn6.setForeground(new Color(61, 71, 62));
		btn6.setBorder(null);
		
		btn7.addActionListener(this);
		btn7.setBounds(40,220,50,50);
		btn7.setBackground(new Color(129, 184, 137));
		btn7.setForeground(new Color(61, 71, 62));
		btn7.setBorder(null);
		
		btn8.addActionListener(this);
		btn8.setBounds(100,220,50,50);
		btn8.setBackground(new Color(129, 184, 137));
		btn8.setForeground(new Color(61, 71, 62));
		btn8.setBorder(null);
		
		btn9.addActionListener(this);
		btn9.setBounds(160,220,50,50);
		btn9.setBackground(new Color(129, 184, 137));
		btn9.setForeground(new Color(61, 71, 62));
		btn9.setBorder(null);
		
		btn0.addActionListener(this);
		btn0.setBounds(100,280,50,50);
		btn0.setBackground(new Color(129, 184, 137));
		btn0.setForeground(new Color(61, 71, 62));
		btn0.setBorder(null);
		
		btnponto.addActionListener(this);
		btnponto.setBounds(40,280,50,50);
		btnponto.setBackground(new Color(129, 184, 137));
		btnponto.setForeground(new Color(61, 71, 62));
		btnponto.setBorder(null);
		
		//operações 
		
		btnIgual.addActionListener(this);
		btnIgual.setBounds(160,280,50,50);
		btnIgual.setBackground(new Color(129, 184, 137));
		btnIgual.setForeground(new Color(61, 71, 62));
		btnIgual.setBorder(null);
		
		btnMais.addActionListener(this);
		btnMais.setBounds(220,100,50,50);
		btnMais.setBackground(new Color(129, 184, 137));
		btnMais.setForeground(new Color(61, 71, 62));
		btnMais.setBorder(null);

		btnMenos.addActionListener(this);
		btnMenos.setBounds(220,160,50,50);
		btnMenos.setBackground(new Color(129, 184, 137));
		btnMenos.setForeground(new Color(61, 71, 62));
		btnMenos.setBorder(null);

		btnVezes.addActionListener(this);
		btnVezes.setBounds(220,220,50,50);
		btnVezes.setBackground(new Color(129, 184, 137));
		btnVezes.setForeground(new Color(61, 71, 62));
		btnVezes.setBorder(null);

		btnDividido.addActionListener(this);
		btnDividido.setBounds(220,280,50,50);
		btnDividido.setBackground(new Color(129, 184, 137));
		btnDividido.setForeground(new Color(61, 71, 62));
		btnDividido.setBorder(null);
		
		btnClear.addActionListener(this);
		btnClear.setBounds(40, 340,230,40);
		btnClear.setBackground(new Color(222, 106, 106));
		btnClear.setForeground(new Color(61, 71, 62));
		btnClear.setBorder(null);

		add(lblTitulo);
		add(btnInfo);
		add(display);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		add(btn0);
		add(btnponto);
		add(btnIgual);
		add(btnMais);
		add(btnMenos);
		add(btnVezes);
		add(btnDividido);
		add(btnClear);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
//		String sinal = "";
		double valor1 = 0;
		double valor2 = 0;
		
		Operacoes calculo = new Operacoes();
		
		//informações da calculadora
		if(e.getSource() == btnInfo) {
			JOptionPane.showMessageDialog(null, "Calculadora JFrame \nVersão: 1.0 (01/12/2023)\n \nAutor: Estela Alves de Moraes (DS1BIT-A) \n "
					+ "\nAvisos:\n", "Informações", JOptionPane.PLAIN_MESSAGE);
		}
		
		//limpar
		if(e.getSource() == btnClear) {
			display.setText("");
		}
		
		if(e.getSource() == btn1) {
			display.setText(display.getText() + "1");
		}
		if(e.getSource() == btn2) {
			display.setText(display.getText() + "2");
		}
		if(e.getSource() == btn3) {
			display.setText(display.getText() + "3");
		}
		if(e.getSource() == btn4) {
			display.setText(display.getText() + "4");
		}
		if(e.getSource() == btn5) {
			display.setText(display.getText() + "5");
		}
		if(e.getSource() == btn6) {
			display.setText(display.getText() + "6");
		}
		if(e.getSource() == btn7) {
			display.setText(display.getText() + "7");
		}
		if(e.getSource() == btn8) {
			display.setText(display.getText() + "8");
		}
		if(e.getSource() == btn9) {
			display.setText(display.getText() + "9");
		}
		if(e.getSource() == btn0) {
			display.setText(display.getText() + "0");
		}
		
		if(e.getSource() == btnponto) {
			display.setText(display.getText() + ".");
		}
		
		String textoDisplay = display.getText();
		String valores[] = textoDisplay.split(" ");

		try {
			calculo.setN1(Double.parseDouble(valores[0])); 
		}catch(Exception error) {
		}
		
		// operações 
		// valores.length -> ao realizar uma operação com dois números ainda é
		// possivel obter o resultado sem clicar no botão de "igual" e
		// continuar realizando as operações com o resultado.
		try {if(e.getSource() == btnMais) {
			if(valores.length == 3) {
				calculo.setN2(Double.parseDouble(valores[2]));
				display.setText(Double.toString(calculo.somar()) + " + ");
			}else if(valores.length == 2) {
				display.setText(display.getText().replace(valores[1], "+"));
				}
			else {
				display.setText(display.getText() + " + ");
			}

		}
		if(e.getSource() == btnMenos) {
			if(valores.length == 3) {
				calculo.setN2(Double.parseDouble(valores[2]));
				display.setText(Double.toString(calculo.subtrair()) + " - ");
			}else if(valores.length == 2) {
				display.setText(display.getText().replace(valores[1], "-"));
				} else{
					display.setText(display.getText() + " - ");
				}

			}
		if(e.getSource() == btnVezes) {
			if(valores.length == 3) {
				calculo.setN2(Double.parseDouble(valores[2]));
				display.setText(Double.toString(calculo.multiplicar()) + " x ");
			}else if(valores.length == 2) {
				display.setText(display.getText().replace(valores[1], "x"));
				}
			else {
				display.setText(display.getText() + " x ");
			}
		}
		if(e.getSource() == btnDividido) {
			if(valores.length == 3) {
				calculo.setN2(Double.parseDouble(valores[2]));
				display.setText(Double.toString(calculo.dividir()) + " / ");
			}else if(valores.length == 2) {
				display.setText(display.getText().replace(valores[1], "/"));
				}
			else {
				display.setText(display.getText() + " / ");
			}
		}}catch(Exception erro) {
		}
		
		
		
		
		//botão de igual -> finalizar a operação 
		if(e.getSource() == btnIgual) {
			
			try {
				String sinal = valores [1];
				String resultado;
				
				//identifica se é possui ponto para mostrar o resultado como double ou int
				if(valores[0].contains(".")) {
					calculo.setN1(Double.parseDouble(valores[0])); 
					calculo.setN2(Double.parseDouble(valores[2]));
				} else {
					calculo.setN1(Integer.parseInt(valores[0])); 
					calculo.setN2(Integer.parseInt(valores[2]));
				}
				 
				if(sinal.equals("+")) {
					
					if(valores[0].contains(".")) {
						resultado = Double.toString(calculo.somar());
					}else {
						int returnConvertido = (int)calculo.somar();
						resultado = Integer.toString(returnConvertido);
					}
					display.setText(resultado);
				}
				if(sinal.equals("-")) {
					if(valores[0].contains(".")) {
						resultado = Double.toString(calculo.subtrair());
					}else {
						int returnConvertido = (int)calculo.subtrair();
						resultado = Integer.toString(returnConvertido);
					}

						display.setText(resultado);
					

				}
				if(sinal.equals("x")) {
					if(valores[0].contains(".")) {
						resultado = Double.toString(calculo.multiplicar());
					}else {
						int returnConvertido = (int)calculo.multiplicar();
						resultado = Integer.toString(returnConvertido);
					}
					display.setText(resultado);
				}
				if(sinal.equals("/")) {
					if(valores[0].contains(".")) {
						resultado = Double.toString(calculo.dividir());
					}else {
						int returnConvertido = (int)calculo.dividir();
						resultado = Integer.toString(returnConvertido);
					}
					display.setText(resultado);
				}
			}catch (Exception erro) {
			}

		}
	}
	
	public static void main(String[] args) {
		 new Calcular();
	}
}
