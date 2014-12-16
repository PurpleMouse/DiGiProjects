package DiGiPets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class gui extends JFrame{
	private Container conts;
	private BorderLayout bl;
	private JPanel top,mid,bot;
	private JButton startBtn,loadBtn, quitBtn;
	private ButtonHandler bh;
	public gui(){//yeh dis default kinda
		conts = getContentPane();
		bl = new BorderLayout();
		bh = new ButtonHandler();
		top = new JPanel();
		mid = new JPanel();
		bot = new JPanel();
		startBtn = new JButton("Start");//text for clarity, take out later
		loadBtn = new JButton("Load");
		quitBtn = new JButton("Quit");
		setSize(800,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	 }
	public void initmen(){
		 //start menu gui
		this.setTitle("DiGi Pets - Main Menu");
		mid.setLayout(null);
		conts.add(top, bl.NORTH);
		conts.add(mid, bl.CENTER);
		conts.add(bot, bl.SOUTH);
		startBtn.addActionListener(bh);
		loadBtn.addActionListener(bh);
		quitBtn.addActionListener(bh);
		startBtn.setBounds(230, 200, 350, 70);
		loadBtn.setBounds(230, 300, 350, 70);
		quitBtn.setBounds(230, 400, 350, 70);
		mid.add(startBtn);
		mid.add(loadBtn);
		mid.add(quitBtn);
	 }
	 public void initstart(){
		 clean();
		 this.setTitle("DiGi Pets - Game");
		 //start game gui
		 
	 }
	 public void initload(){
		 clean();
		 this.setTitle("DiGi Pets - Load Game");
		 //start load gui
	 }
	 public void clean(){
		 conts.removeAll();
		 conts.repaint();
	 }
	 public void doquit(){
		 //quits game
		 if(JOptionPane.showConfirmDialog(this.getParent(), "Would you like to quit the game?") == JOptionPane.YES_OPTION)
			 System.exit(0);
		 else
			 return;
	 }
	 private class ButtonHandler implements ActionListener{//When the button is clicked
			public void actionPerformed( ActionEvent ae ){
				if (ae.getSource() == startBtn){
					//close first
					initstart();//then
					
				}
				if(ae.getSource() == loadBtn){
					//close first
					initload();//then
					
					
					
				}
				if(ae.getSource() == quitBtn){
					doquit();
				}
			} 
		} 

}