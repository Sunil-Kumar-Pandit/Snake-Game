import java.awt.event.*;
public class KeyboardListener extends KeyAdapter
{
	public void keyPressed(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
		case 39://->Right
			if(ThreadsController.directionSnake!=2)
				ThreadsController.directionSnake=1;
			break;
		case 38://->top
			if(ThreadsController.directionSnake!=4)
				ThreadsController.directionSnake=3;
			break;
		case 37://->left
			if(ThreadsController.directionSnake!=1)
				ThreadsController.directionSnake=2;
			break;
		case 40://->top
			if(ThreadsController.directionSnake!=3)
				ThreadsController.directionSnake=4;
			break;
			default: break;
		}
	}
}