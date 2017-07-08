package model.Element.Mobile;

import java.awt.Point;

import model.IMap;
import model.Map;
import model.Element.Element;
import model.Element.Permeability;
import model.Element.Sprite;

public class Mobile extends Element implements IMobile{
	
	private Point position;
	protected Boolean alive = true;
	private IMap map;
	
	public Mobile(Sprite sprite, Permeability permeability, Map map) {
		super(sprite, permeability);
		this.setMap(map);
	}
	
   /* Mobile(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability) {
        super(sprite, permeability);
        this.setMap(map);
        this.setX(x);
        this.setY(y);
    }*/

	/**
	 * Moves the element according to its previous position and the pressed key
	 */
	@Override
	public void moveUp() {
        this.setY(this.getY() + 1);
        this.setHasMoved();
	}

	@Override
	public void moveDown() {
        this.setY(this.getY() - 1);
        this.setHasMoved();
	}

	@Override
	public void moveRight() {
        this.setY(this.getX() + 1);
        this.setHasMoved();
	}

	@Override
	public void moveLeft() {
        this.setY(this.getX() - 1);
        this.setHasMoved();
	}

    @Override
    public void doNothing() {
        this.setHasMoved();
    }
    
    private void setHasMoved() {
        this.getMap().setMapHasChanged();
    }

    @Override
    public final int getX() {
        return this.getPosition().x;
    }


    public final void setX(final int x) {
        this.getPosition().x = x;
        if (this.isKilled()) {
            this.die();
        }
    }


    @Override
    public final int getY() {
        return this.getPosition().y;
    }


    public final void setY(final int y) {
        this.getPosition().y = (y + this.getMap().getHeight()) % this.getMap().getHeight();
        if (this.isKilled()) {
            this.die();
        }
    }
	

 
    public IMap getMap() {
        return this.map;
    }

    private void setMap(final IMap map) {
        this.map = map;
    }
    
    @Override
    public Boolean isAlive() {
        return this.alive;
    }
    
    protected void die() {
        this.alive = false;
        this.setHasMoved();
    }
    
    @Override
    public Boolean isKilled() {
        return this.getMap().getTheMap(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING;
    }
	
    @Override
    public Point getPosition() {
        return this.position;
    }


    public void setPosition(final Point position) {
        this.position = position;
    }

	/**
	 * change the status of the element if needed
	 * @return
	 */
	public boolean visible() {
		return false;
	}
}