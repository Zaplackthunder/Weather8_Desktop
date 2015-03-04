package ui;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class LForecastPanel extends JPanel{
	
	private JLabel tempLabel, sunLabel;

	public LForecastPanel(){
	
		//Temp, sky		
		this.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		this.setBackground(Color.yellow);
		tempLabel=new JLabel("<html><p style=\"font-size:30px\">--&deg C</p></html>");
		tempLabel.setBounds(10,10,(int)tempLabel.getPreferredSize().getWidth(),(int)tempLabel.getPreferredSize().getHeight());
		tempLabel.setOpaque(true);
		tempLabel.setBackground(Color.green);
		this.add(tempLabel);
		
		//Sky
		sunLabel=new JLabel("<html><p style=\"font-size:12px\">--------</p></html>");
		sunLabel.setBounds(120,60,(int)sunLabel.getPreferredSize().getWidth(),(int)sunLabel.getPreferredSize().getHeight());
		sunLabel.setOpaque(true);
		sunLabel.setBackground(Color.green);
		this.add(sunLabel);
		
		
		setPreferredSize(new Dimension(262,127));
		setMinimumSize(new Dimension(262,127));
		setMaximumSize(new Dimension(5000,5000));
		this.setBackground(Color.PINK);
	}
	
	public void setTemp(String temp, int unit){
		String s = "<html><p style=\"font-size:30px\">" + temp + "&deg ";
		switch(unit){
			case 0: s = s + "K";
				break;
			case 1: s = s + "C";
				break;
			case 2: s = s + "F";
				break;
		}
		
		tempLabel.setText(s+"</p></html>");

		tempLabel.setBounds(10,10,(int)tempLabel.getPreferredSize().getWidth(),(int)tempLabel.getPreferredSize().getHeight());
	}
	
	public void setSky(String sky){
		sunLabel.setText("<html><p style=\"font-size:12px\">" + sky + "</p></html>");

		sunLabel.setBounds(120,60,(int)sunLabel.getPreferredSize().getWidth(),(int)sunLabel.getPreferredSize().getHeight());
	}
}