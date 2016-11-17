package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.IPlotter;

public abstract class ShapeBuilder {

	protected Shape shape;
	
	public Shape getShape(){
		return shape;
	}
	
	public void createNewShape(){
		shape = new Shape();
	}
	public abstract void buildPointA();
	public abstract void buildPointB();
	public abstract void buildPointC();
	public abstract void buildPointD();
	public abstract void buildLine(Point fromPoint, Point toPoint);
}
