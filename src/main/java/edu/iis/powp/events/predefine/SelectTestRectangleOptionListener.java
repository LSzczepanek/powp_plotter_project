package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

public class SelectTestRectangleOptionListener implements ActionListener{

	 @Override
	    public void actionPerformed(ActionEvent e)
	    {
		  	RectangleBuilder rectangle = new RectangleBuilder();
		  	rectangle.build(Application.getComponent(DriverManager.class).getCurrentPlotter());
	    }

}
