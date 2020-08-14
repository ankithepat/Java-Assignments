package com.app.geometry;
import java.lang.Math;
public class Point2D
{
	private double x,y;
	public Point2D(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	public String getDetails()
	{
	return "X-Coodinate : "+x+" Y-Coordinate : "+y;
	}
	public boolean isEqual(Point2D anotherPoint)
	{
		return (x==anotherPoint.x && y==anotherPoint.y);
	}
	public Point2D createNewPoint(double xOff,double yOff)
	{
	Point2D newPoint=new Point2D(x+xOff,y+yOff);
	return newPoint;
	}
	public double calculateDistance(Point2D point2)
	{
		return Math.sqrt(Math.pow(y-point2.y,2)+Math.pow(x-point2.x,2));
	}
	
		
}
