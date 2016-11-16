package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

public class RectangleBuilder implements ActionListener {

	
	
	  @Override
	    public void actionPerformed(ActionEvent e)
	    {
		  	RectangleBuilder rectangle = new RectangleBuilder();
		  	rectangle.figureScript(Application.getComponent(DriverManager.class).getCurrentPlotter());
	    }
	  
	  
	  
	  private void figureScript(IPlotter ploter){
		  
	        ploter.setPosition(-100, -60);
	        ploter.drawTo(0, -60);
	        
	        
	        ploter.setPosition(0, -60);
	        ploter.drawTo(0, 100);
	       
	        
	        ploter.setPosition(0, 100);
	        ploter.drawTo(-100, 100);
	      
	        
	        ploter.setPosition(-100, 100);
	        ploter.drawTo(-100, -60);
	      
		  
	  }
	  //FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
}
