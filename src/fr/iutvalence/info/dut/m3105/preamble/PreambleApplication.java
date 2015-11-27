package fr.iutvalence.info.dut.m3105.preamble;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		// avec decorateur
		Shape recFill = new Fill(new Border(new Shadow(new Rectangle(4,2),15,80),3), 0,0,1);
		recFill.Draw(new Position(1,0));
		
		Shape circFill = new Fill(new Border(new Shadow(new Circle(3),0,50),5), 255,255,1);
		circFill.Draw(new Position(2,0));
		
		// avec builder
		Shape recFillVerif = new RectangleBuilder(4, 2).withShadow(15,80).withBorder(3).fill(0, 0, 1).toRectangle();
		recFillVerif.Draw(new Position(1,0));
		
		Shape circFillVerif = new CircleBuilder(3).withShadow(0, 50).withBorder(5).fill(255, 255, 1).toCircle();
		circFillVerif.Draw(new Position(2,0));
	}

}
