package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.NetworkInterface;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator extends JFrame implements ActionListener {
	double broj1,broj2,rezultat;
	int plus = 0, puta = 0, podeljeno = 0, minus = 0; 
	
	JPanel panel = new JPanel();
	JTextArea area = new JTextArea(2, 10);
	JButton button0 = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	
	JButton buttonplus = new JButton();
	JButton buttonminus = new JButton();
	JButton buttonputa = new JButton();
	JButton buttonpodeljeno = new JButton();
	JButton buttoncisto = new JButton();
	JButton buttontacka = new JButton();
	JButton buttonjednako = new JButton();
	
	
	public Calculator() {
		setSize(340, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Calculator");
		
		add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		Border border = BorderFactory.createLineBorder(Color.RED, 4);
		panel.add(area);
		area.setBackground(Color.black);
		Border areaBorder = BorderFactory.createLineBorder(Color.blue,3);
		area.setBorder(areaBorder);
		Font FONT = new Font("Ariel", Font.BOLD, 33);
		area.setFont(FONT);
		area.setForeground(Color.white);
		area.setPreferredSize(new Dimension(2, 10));
		area.setLineWrap(true);
		
		
		button1.setPreferredSize(new Dimension(100, 40));
		button1.setIcon(new ImageIcon("C:\\Users\\Danijel\\Desktop\\DUGMICI\\1.jpg"));
		button2.setPreferredSize(new Dimension(100, 40));
		button2.setIcon(new ImageIcon("C:\\Users\\Danijel\\Desktop\\DUGMICI\\2.jpg"));
		button3.setPreferredSize(new Dimension(100, 40));
		button3.setIcon(new ImageIcon("C:\\Users\\Danijel\\Desktop\\DUGMICI\\3.jpg"));
		button4.setPreferredSize(new Dimension(100, 40));
		button4.setIcon(new ImageIcon("C:\\Users\\Danijel\\Desktop\\DUGMICI\\4.jpg"));
		button5.setPreferredSize(new Dimension(100, 40));
		button5.setIcon(new ImageIcon("C:\\Users\\Danijel\\Desktop\\DUGMICI\\5.jpg"));
		button6.setPreferredSize(new Dimension(100, 40));
		button6.setIcon(new ImageIcon("C:\\Users\\Danijel\\Desktop\\DUGMICI\\6.jpg"));
		button7.setPreferredSize(new Dimension(100, 40));
		button7.setIcon(new ImageIcon("C:\\Users\\Danijel\\Desktop\\DUGMICI\\7.jpg"));
		button8.setPreferredSize(new Dimension(100, 40));
		button8.setIcon(new ImageIcon("C:\\Users\\Danijel\\Desktop\\DUGMICI\\8.jpg"));
		button9.setPreferredSize(new Dimension(100, 40));
		button9.setIcon(new ImageIcon("C:\\Users\\Danijel\\Desktop\\DUGMICI\\9.jpg"));
		button0.setPreferredSize(new Dimension(100, 40));
		button0.setIcon(new ImageIcon("C:\\Users\\Danijel\\Desktop\\DUGMICI\\0.jpg"));
		
		buttontacka.setPreferredSize(new Dimension(100, 40));
		buttontacka.setIcon(new ImageIcon("C:\\Users\\Danijel\\Desktop\\DUGMICI\\TACKA.jpg"));
		buttonminus.setPreferredSize(new Dimension(100, 40));
		buttonminus.setIcon(new ImageIcon("C:\\Users\\Danijel\\Desktop\\DUGMICI\\MINUS.jpg"));
		buttonputa.setPreferredSize(new Dimension(100, 40));
		buttonputa.setIcon(new ImageIcon("C:\\Users\\Danijel\\Desktop\\DUGMICI\\X.jpg"));
		buttonpodeljeno.setPreferredSize(new Dimension(100, 40));
		buttonpodeljeno.setIcon(new ImageIcon("C:\\Users\\Danijel\\Desktop\\DUGMICI\\PODELJENO.jpg"));
		buttonplus.setPreferredSize(new Dimension(100, 40));
		buttonplus.setIcon(new ImageIcon("C:\\Users\\Danijel\\Desktop\\DUGMICI\\PLUS.jpg"));
		buttonjednako.setPreferredSize(new Dimension(100, 40));
		buttonjednako.setIcon(new ImageIcon("C:\\Users\\Danijel\\Desktop\\DUGMICI\\JEDNAKO.jpg"));
		buttoncisto.setPreferredSize(new Dimension(100, 40));
		buttoncisto.setIcon(new ImageIcon("C:\\Users\\Danijel\\Desktop\\DUGMICI\\C.jpg"));
		
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		
		panel.add(buttontacka);
		panel.add(buttonminus);
		panel.add(buttonputa);
		panel.add(buttonpodeljeno);
		panel.add(buttonplus);
		panel.add(buttonjednako);
		panel.add(buttoncisto);
		
		button1.addActionListener((ActionListener) this);
		button2.addActionListener((ActionListener) this);
		button3.addActionListener((ActionListener) this);
		button4.addActionListener((ActionListener) this);
		button5.addActionListener((ActionListener) this);
		button6.addActionListener((ActionListener) this);
		button7.addActionListener((ActionListener) this);
		button8.addActionListener((ActionListener) this);
		button9.addActionListener((ActionListener) this);
		button0.addActionListener((ActionListener) this);
		
		
		buttontacka.addActionListener((ActionListener) this);
		buttonminus.addActionListener((ActionListener) this);
		buttonputa.addActionListener((ActionListener) this);
		buttonpodeljeno.addActionListener((ActionListener) this);
		buttonplus.addActionListener((ActionListener) this);
		buttonjednako.addActionListener((ActionListener) this);
		buttoncisto.addActionListener((ActionListener) this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source== buttoncisto) {
			broj1=0.0;
			broj2=0.0;
			area.setText("");
		}
		if (source == button1) {
			area.append("1");
		}
		
		if (source == button2) {
			area.append("2");
		}
		
		if (source == button3) {
			area.append("3");
		}
		
		if (source == button4) {
			area.append("4");
		}
		if (source == button5) {
			area.append("5");
		}
		if (source == button6) {
			area.append("6");
		}
		if (source == button7) {
			area.append("7");
		}
		if (source == button8) {
			area.append("8");
		}
		if (source == button9) {
			area.append("9");
		}
		if (source == button0) {
			area.append("0");
		}
		if (source == buttontacka) {
			area.append(".");
		}
		if (source == buttonplus) {
			broj1 = citac();   // String iz TextErije je smesten u broj 1
			area.setText("+");  
			plus = 1;  // ukljuci sabiranje iskljuci ostalo
			puta =0;
			minus=0;
			podeljeno=0;
		}
		
		if (source == buttonpodeljeno) {
			broj1 = citac();
			area.setText("");
			plus = 0;
			puta =0;
			minus=0;
			podeljeno=1;
		}
		
		if (source == buttonminus) {
			broj1 = citac();
			area.setText("-");
			plus = 0;
			puta =0;
			minus=1;
			podeljeno=0;
		}
		
		if (source == buttonputa) {
			broj1 = citac();
			area.setText("");
			plus = 0;
			puta =1;
			minus=0;
			podeljeno=0;
		}
		
		if (source == buttonjednako) {
			broj2 = citac();   
			if (plus>0) {   // ukoliko je plus = 1 a sve ostalo iskljuco sa 0 ( zato plus>0 jer je plus = 1)
				rezultat = broj1+broj2;  // izvrsi sabiranje 2 broja
				area.setText(Double.toString(rezultat));
			}
			if (minus>0) {  // isto ukoliko je minus = 1 ukljucen,  (minus>0)
				rezultat = broj1-broj2;
				area.setText(Double.toString(rezultat));
			}
			
			if (puta>0) {
				rezultat = broj1*broj2;
				area.setText(Double.toString(rezultat));
			}
			
			if (podeljeno>0) {
				rezultat = broj1/broj2;
				area.setText(Double.toString(rezultat));
			}
		}
		
		
	}
	// String koji je ispisan u TextEriji uzmi i stavi u promenljivu br1 
	public double citac() {
		double br1;
		String s;
		s = area.getText();  // promenljiva kupi tekst sa teksterije
		br1 = Double.valueOf(s);  // tekst sa tekst erije stavljamo u promenljivu br1 koja je po tipu double
		return br1;
		
	}
		

/*" Objasnjenje:
	primer:5+5 =10;
	Kada protisnemo broj 5 (area.append(5) ce dodati broj 5 - napomena samo dodati na texteriju
	Kada pritisnemo +, metoda citac() pretvorice String iz texterije (5+) u Double vrednosti i ubaciti u promenjivu broj1
	Kada ponovo pritisnemo broj 5(area.append(5) ce ponovo dodati broj 5
	I na kraju kada pritisnemo jednako opet String sa texterije koji je sada +5 pretvorice u Double vrednosti i smestiti u broj2
	Zatim pomocu jednakosti rezultat = broj1+broj2 izracunati vrednost 
	I na kraju ispisati vredosti pomocu area.setText(Double.toString(rezultat))
	area.setText(Double.toString(rezultat)) - isto pretvara String rezultat u Double vrednosti i ispisuje na ekranu

*/




		

		




		
		
		








	
	
	








	
	
	
	

}
