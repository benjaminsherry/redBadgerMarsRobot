package rover.entity;

import javax.swing.text.Position;
import java.util.HashSet;
import java.util.Set;

public class Grid {

    private final int xSize;
    private final int ySize;
    private Set<Location> scent;


    public Grid(int xSize, int ySize) {
        this.xSize = xSize;
        this.ySize = ySize;
        this.scent = new HashSet<>();
    }

    public int getxSize() {
        return xSize;
    }

    public int getySize() {
        return ySize;
    }

    public boolean onGrid(Location location){
        return (location.getX()>=0 && location.getY()>=0 && location.getX()<=xSize && location.getY()<=ySize);
    }

    public boolean containsScent(Location location){
        return scent.contains(location);
    }

    public void addScent(Location location){
        scent.add(location);
    }
}
