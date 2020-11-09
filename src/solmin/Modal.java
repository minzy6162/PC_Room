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
		super(parent, "결재 창", ModalityType.APPLICATION_MODAL);
		
		
		
		setResizable(false);//창 크기 고정
		setSize(600, 500);
		setLayout(null);
		
		times = new JLabel("-------------시간-------------");
		times.setFont(new Font("HY동녘M", Font.PLAIN, 25));
		times.setSize(6000, 50);
		times.setLocation(0, 0);
		
		lb = new JLabel("원하는 시간대를 선택하세요.");
		lb.setFont(new Font("Hachoma", Font.PLAIN, 20));
		lb.setSize(300, 50);
		lb.setLocation(180,80);
		
		Choice ch = new Choice();
//		String[] arrJob = {"1시간    1000천원", "2시간    2000천원", "3시간    3000천원", "4시간    4000천원", "5시간    5000천원"};
//		ch1 = new JComboBox(arrJob);
		ch.addItem("1시간    1000천원");
		ch.addItem("2시간    2000천원");
		ch.addItem("3시간    3000천원");
		ch.addItem("4시간    4000천원");
		ch.addItem("5시간    5000천원");
		ch.setSize(100, 50);
		ch.setLocation(250,150);
		
		payment = new JLabel("-------------결제-------------");
		payment.setFont(new Font("HY동녘M", Font.PLAIN, 25));
		payment.setSize(6000, 50);
		payment.setLocation(0, 200);
		
		way = new JLabel("결제 방법을 선택해주세요.");
		way.setFont(new Font("Hachoma", Font.PLAIN, 20));
		way.setSize(300, 50);
		way.setLocation(180,260);
		
		card = new JButton("카드");
		card.setFont(new Font("굴림", Font.PLAIN, 20));
		card.setBounds(160, 350, 80, 40);
		
		card.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DBTime time1 = new DBTime();
				
					String t_time=ch.getSelectedItem();
						
					String DBConnection = "INSERT members VALUES("+ t_time + "')";
					
			
					DBTime.createCustomer(t_time);
					JOptionPane.showMessageDialog(null, "카드결제 되었습니다.");
					SingnIn_Up.main(null);
					setVisible(true);
			}
			
			});
		
		cash = new JButton("현금");
		cash.setFont(new Font("굴림", Font.PLAIN, 20));
		cash.setBounds(350, 350, 80, 40);
		
		cash.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DBTime time1 = new DBTime();
				
					String t_time=ch.getSelectedItem();
						
					String DBConnection = "INSERT members VALUES("+ t_time + "')";
					
			
						
					DBTime.createCustomer(t_time);
					JOptionPane.showMessageDialog(null, "결제 되었습니다.");
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
	       
	        //화면에서 사용자가 입력한 내용을 얻는다.
	        member m = new member();
	        String job = (String)ch1.getSelectedItem();

	        //m에 담는다.
	        m.settime(time);
	       
	        return m;
	    }
}
