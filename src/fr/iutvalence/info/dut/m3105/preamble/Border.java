package fr.iutvalence.info.dut.m3105.preamble;

public class Border extends Shape
{
	public Shape shape;
	public int thickness;
	
	/**
	 * @param shape
	 * @param thinckness
	 */
	public Border(Shape shape, int thickness)
	{
		this.shape = shape;
		this.thickness = thickness;
	}
	
	@Override
	public String toString()
	{
		return "Border [shape=" + shape + ", thickness=" + thickness + "]";
	}

}
