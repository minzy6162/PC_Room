package solmin;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Dialog.ModalityType;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import database.DBTime;

public class Modal extends JDialog {
	
	JPanel p;
	JLabel times, lb, payment, way;
	JComboBox ch1;
	JButton card, cash;
	
	public Modal(Window parent) {
		super(parent, "���� â", ModalityType.APPLICATION_MODAL);
		
		
		
		setResizable(false);//â ũ�� ����
		setSize(600, 500);
		setLayout(null);
		
		times = new JLabel("-------------�ð�-------------");
		times.setFont(new Font("HY����M", Font.PLAIN, 25));
		times.setSize(6000, 50);
		times.setLocation(0, 0);
		
		lb = new JLabel("���ϴ� �ð��븦 �����ϼ���.");
		lb.setFont(new Font("Hachoma", Font.PLAIN, 20));
		lb.setSize(300, 50);
		lb.setLocation(180,80);
		
		Choice ch = new Choice();
//		String[] arrJob = {"1�ð�    1000õ��", "2�ð�    2000õ��", "3�ð�    3000õ��", "4�ð�    4000õ��", "5�ð�    5000õ��"};
//		ch1 = new JComboBox(arrJob);
		ch.addItem("1�ð�    1000õ��");
		ch.addItem("2�ð�    2000õ��");
		ch.addItem("3�ð�    3000õ��");
		ch.addItem("4�ð�    4000õ��");
		ch.addItem("5�ð�    5000õ��");
		ch.setSize(100, 50);
		ch.setLocation(250,150);
		
		payment = new JLabel("-------------����-------------");
		payment.setFont(new Font("HY����M", Font.PLAIN, 25));
		payment.setSize(6000, 50);
		payment.setLocation(0, 200);
		
		way = new JLabel("���� ����� �������ּ���.");
		way.setFont(new Font("Hachoma", Font.PLAIN, 20));
		way.setSize(300, 50);
		way.setLocation(180,260);
		
		card = new JButton("ī��");
		card.setFont(new Font("����", Font.PLAIN, 20));
		card.setBounds(160, 350, 80, 40);
		
		card.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DBTime time1 = new DBTime();
				
					String t_time=ch.getSelectedItem();
						
					String DBConnection = "INSERT members VALUES("+ t_time + "')";
					
			
					DBTime.createCustomer(t_time);
					JOptionPane.showMessageDialog(null, "ī����� �Ǿ����ϴ�.");
					SingnIn_Up.main(null);
					setVisible(true);
			}
			
			});
		
		cash = new JButton("����");
		cash.setFont(new Font("����", Font.PLAIN, 20));
		cash.setBounds(350, 350, 80, 40);
		
		cash.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DBTime time1 = new DBTime();
				
					String t_time=ch.getSelectedItem();
						
					String DBConnection = "INSERT members VALUES("+ t_time + "')";
					
			
						
					DBTime.createCustomer(t_time);
					JOptionPane.showMessageDialog(null, "���� �Ǿ����ϴ�.");
					SingnIn_Up.main(null);
					setVisible(true);
			}
			
			});
		
		
		
		
		add(times);
		add(lb);
		add(ch);
		add(payment);
		add(way);
		add(card);
		add(cash);
	}
	
	  public member getViewData(){
	       
	        //ȭ�鿡�� ����ڰ� �Է��� ������ ��´�.
	        member m = new member();
	        String job = (String)ch1.getSelectedItem();

	        //m�� ��´�.
	        m.settime(time);
	       
	        return m;
	    }
}
