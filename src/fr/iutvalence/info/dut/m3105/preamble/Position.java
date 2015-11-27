package fr.iutvalence.info.dut.m3105.preamble;

public class Position
{
	private int x;
	private int y;
	
	/**
	 * @param x
	 * @param y
	 */
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString()
	{
		return "Position [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
