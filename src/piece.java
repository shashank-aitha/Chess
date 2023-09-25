import java.util.logging.XMLFormatter;

public abstract class piece {
    protected String color;
    protected int x, y;

    public piece(String color, int x, int y){
        if(!"white".equals(color) && !"black".equals(color)){
            throw new IllegalArgumentException("Invalid color. Choose either 'white' or 'black'.");
        }
        this.color = color;
        this.x = x;
        this.y = y;
    }
    public String getColor(){
        return this.color;
    }
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public abstract boolean isValidMove(int finalX, int finalY);
}
