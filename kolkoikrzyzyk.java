package kolkoikrzyzyk;


	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	import javax.swing.GroupLayout;
	import javax.swing.LayoutStyle;
	


	public class kolkoikrzyzyk extends JFrame {
		
		
		public kolkoikrzyzyk() {
			initpanel();
		}
		int licznik=0;
		int krzyzyk=0;
		int kolko=0;
		public void button1ActionPerformed(ActionEvent e) {
			
			if(button1.getText().equals("")){
				if(Main.turagracza1 ==true){
					button1.setText("X");
					button12.setText("tura: O");
					licznik++;
					Main.sprawdzktowygral();
					Main.turagracza1 =false;
				}else{
					button1.setText("O");
					button12.setText("tura: X");
					licznik++;
					Main.sprawdzktowygral();
					Main.turagracza1= true;
				}
			}
		}

		public void button2ActionPerformed(ActionEvent e) {
			if(button2.getText().equals("")){
				if(Main.turagracza1 ==true){
					button2.setText("X");
					button12.setText("tura: O");
					licznik++;
					Main.sprawdzktowygral();
					Main.turagracza1 =false;
				}else{
					button2.setText("O");
					button12.setText("tura: X");
					licznik++;
					Main.sprawdzktowygral();
					Main.turagracza1= true;
				}
			}

		}

		public void button3ActionPerformed(ActionEvent e) {
			if(button3.getText().equals("")){
				if(Main.turagracza1 ==true){
					button3.setText("X");
					button12.setText("tura: O");
					licznik++;
					Main.sprawdzktowygral();
					Main.turagracza1 =false;
				}else{
					button3.setText("O");
					button12.setText("tura: X");
					licznik++;
					Main.sprawdzktowygral();
					Main.turagracza1= true;
				}
			}

		}

		public void button4ActionPerformed(ActionEvent e) {
			if(button4.getText().equals("")){
				if(Main.turagracza1 ==true){
					button4.setText("X");
					button12.setText("tura: O");
					licznik++;
					Main.sprawdzktowygral();
					Main.turagracza1 =false;
				}else{
					button4.setText("O");
					button12.setText("tura: X");
					licznik++;
					Main.sprawdzktowygral();
					Main.turagracza1= true;
				}
			}

		}

		public void button5ActionPerformed(ActionEvent e) {
			if(button5.getText().equals("")){
				if(Main.turagracza1 ==true){
					button5.setText("X");
					button12.setText("tura: O");
					licznik++;
					Main.sprawdzktowygral();
					Main.turagracza1 =false;
				}else{
					button5.setText("O");
					button12.setText("tura: X");
					licznik++;
					Main.sprawdzktowygral();
					Main.turagracza1= true;
				}
			}

		}

		public void button6ActionPerformed(ActionEvent e) {
			if(button6.getText().equals("")){
				if(Main.turagracza1 ==true){
					button6.setText("X");
					button12.setText("tura: O");
					licznik++;
					Main.sprawdzktowygral();
					Main.turagracza1 =false;
				}else{
					button6.setText("O");
					button12.setText("tura: X");
					licznik++;
					Main.sprawdzktowygral();
					Main.turagracza1= true;
				}
			}

		}

		public void button7ActionPerformed(ActionEvent e) {
			if(button7.getText().equals("")){
				if(Main.turagracza1 ==true){
					button7.setText("X");
					button12.setText("tura: O");
					licznik++;
					Main.sprawdzktowygral();
					Main.turagracza1 =false;
				}else{
					button7.setText("O");
					button12.setText("tura: X");
					licznik++;
					Main.sprawdzktowygral();
					Main.turagracza1= true;
				}
			}

		}

		public void button8ActionPerformed(ActionEvent e) {
			if(button8.getText().equals("")){
				if(Main.turagracza1 ==true){
					button8.setText("X");
					button12.setText("tura: O");
					licznik++;
					Main.sprawdzktowygral();
					Main.turagracza1 =false;
				}else{
					button8.setText("O");
					button12.setText("tura: X");
					licznik++;
					Main.sprawdzktowygral();
					Main.turagracza1= true;
				}
			}

		}

		public void button9ActionPerformed(ActionEvent e) {
			if(button9.getText().equals("")){
				if(Main.turagracza1 ==true){
					button9.setText("X");
					button12.setText("tura: O");
					licznik++;
					Main.sprawdzktowygral();
					Main.turagracza1 =false;
				}else{
					button9.setText("O");
					button12.setText("tura: X");
					licznik++;
					Main.sprawdzktowygral();
					Main.turagracza1= true;
				}
			}

		}
		public void button10ActionPerformed(ActionEvent e) {
			Main.nowagra();
				
			

		}

		public void initpanel() {

			button1 = new JButton();
			
			button2 = new JButton();
			button3 = new JButton();
			button4 = new JButton();
			button5 = new JButton();
			button6 = new JButton();
			button7 = new JButton();
			button8 = new JButton();
			button9 = new JButton();
			button10 = new JButton();
			button11 = new JButton();
			button12 = new JButton();
			button13 = new JButton();
			button14 = new JButton();

			
			setTitle("Kolko i krzyzyk");
			Container contentPane = getContentPane();

			button1.setText("");
			button1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button1ActionPerformed(e);
				}
			});

			button2.setText("");
			button2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button2ActionPerformed(e);
				}
			});

			button3.setText("");
			button3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button3ActionPerformed(e);
				}
			});

			button4.setText("");
			button4.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button4ActionPerformed(e);
				}
			});

			button5.setText("");
			button5.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button5ActionPerformed(e);
				}
			});

			button6.setText("");
			button6.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button6ActionPerformed(e);
				}
			});

			button7.setText("");
			button7.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button7ActionPerformed(e);
				}
			});

			button8.setText("");
			button8.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button8ActionPerformed(e);
				}
			});

			button9.setText("");
			button9.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button9ActionPerformed(e);
				}
			});
			button10.setText("Nowa Gra");
			button10.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button10ActionPerformed(e);
				}
			});

			GroupLayout contentPaneLayout = new GroupLayout(contentPane);
			contentPane.setLayout(contentPaneLayout);
			contentPaneLayout.setHorizontalGroup(
				contentPaneLayout.createParallelGroup()
					.addGroup(contentPaneLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(contentPaneLayout.createParallelGroup()
							.addGroup(contentPaneLayout.createSequentialGroup()
								.addComponent(button1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(button2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(button3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(button11, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
								.addComponent(button12, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
							.addGroup(contentPaneLayout.createSequentialGroup()
								.addComponent(button4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(button5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(button6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(button13, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
								.addComponent(button14, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
								)
							.addGroup(contentPaneLayout.createSequentialGroup()
								.addComponent(button7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(button8, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(button9, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(button10, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
								
								))
						.addContainerGap(11, Short.MAX_VALUE))
			);
			contentPaneLayout.setVerticalGroup(
				contentPaneLayout.createParallelGroup()
					.addGroup(contentPaneLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(button1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addComponent(button2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addComponent(button3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addComponent(button11, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addComponent(button12, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(button4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addComponent(button5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addComponent(button6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addComponent(button10, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(button7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addComponent(button8, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addComponent(button9, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addComponent(button13, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addComponent(button14, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							
							)
						.addContainerGap(15, Short.MAX_VALUE))
			);
			pack();
			setLocationRelativeTo(getOwner());
			
		}

		
		public JButton button1;
		public JButton button2;
		public JButton button3;
		public JButton button4;
		public JButton button5;
		public JButton button6;
		public JButton button7;
		public JButton button8;
		public JButton button9;
		public JButton button10;
		public JButton button11;
		public JButton button12;
		public JButton button13;
		public JButton button14;
	
	}

