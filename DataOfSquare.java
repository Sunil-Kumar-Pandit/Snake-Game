import java.util.*;
import java.awt.*;
public class DataOfSquare
{
	ArrayList<Color>C=new ArrayList<Color>();
	int color;
	SquarePanel square;
	public DataOfSquare(int col)
	{
		C.add(Color.blue);
		C.add(Color.red);
		C.add(Color.white);
		//C.add(Color.black);
		square=new SquarePanel(C.get(color));
	}
	public void lightMeUp(int c)
	{
		square.ChangeColor(C.get(c));
	}
}