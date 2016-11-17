package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.IPlotter;

public class RectangleBuilder extends ShapeBuilder {

	private IPlotter plotter;

	// director method

	public void build(IPlotter plotter) {
		createNewShape();
		this.plotter = plotter;
		buildPointA();
		buildPointB();
		buildPointC();
		buildPointD();

		buildLine(shape.getPointA(), shape.getPointB());
		buildLine(shape.getPointB(), shape.getPointC());
		buildLine(shape.getPointC(), shape.getPointD());
		buildLine(shape.getPointD(), shape.getPointA());
	}

	@Override
	public void buildPointA() {
		// TODO Auto-generated method stub
		shape.setPointA(new Point(-100, -60));

	}

	@Override
	public void buildPointB() {
		// TODO Auto-generated method stub
		shape.setPointB(new Point(0, -60));

	}

	@Override
	public void buildPointC() {
		// TODO Auto-generated method stub
		shape.setPointC(new Point(0, 100));

	}

	@Override
	public void buildPointD() {
		// TODO Auto-generated method stub
		shape.setPointD(new Point(-100, 100));

	}

	@Override
	public void buildLine(Point fromPoint, Point toPoint) {
		// TODO Auto-generated method stub
		plotter.setPosition(fromPoint.x, fromPoint.y);
		plotter.drawTo(toPoint.x, toPoint.y);

	}

	// private void build(IPlotter ploter){
	//
	// ploter.setPosition(-100, -60);
	// ploter.drawTo(0, -60);
	//
	//
	// ploter.setPosition(0, -60);
	// ploter.drawTo(0, 100);
	//
	//
	// ploter.setPosition(0, 100);
	// ploter.drawTo(-100, 100);
	//
	//
	// ploter.setPosition(-100, 100);
	// ploter.drawTo(-100, -60);
	//
	//
	// }
	// FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());

}
