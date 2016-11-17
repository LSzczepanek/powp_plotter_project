package edu.iis.powp.events.predefine;

public class Shape {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	
	
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}
	public Point getPointA() {
		return pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public Point getPointD() {
		return pointD;
	}
	
	
	
}

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	Point(){
		
	}
}