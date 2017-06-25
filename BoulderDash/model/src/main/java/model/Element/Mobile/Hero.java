package model.Element.Mobile;

import model.Element.Sprite;

public class Hero extends Mobile {
	
	private static final Sprite SPRITE = new Sprite('H', "Hero.png");

	public int pickUpDiamond() {
		throw new UnsupportedOperationException();
	}
	
/*	public void moveHero() 
	{
		int order = controller.PlayerController.getOrder();
		swicth (order) 
		{
			case 12: 
				moveLeft();
				break;
			case KeyEvent.VK_RIGHT: 
				moveRight();
				break;
			case KeyEvent.VK_UP: 
				moveUp();
				break;
			case  KeyEvent.VK_DOWN:
				moveDown();
				break;
		}*/
	}
