package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle extends Shape
{
	public int width;
	public int height;
	
	/**
	 * @param width
	 * @param height
	 */
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString()
	{
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
}
