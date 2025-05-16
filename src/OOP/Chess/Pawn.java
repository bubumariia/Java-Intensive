package OOP.Chess;

public class Pawn {
    private int x, y;
    private String color;
    private boolean isFirstMove;

    public String toString(){
        return "x = " + this.x + ";" + "y = " + this.y;
    }
    public Pawn(int x, int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
        isFirstMove = true;


    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public boolean canMove(int nx, int ny){
        if (nx != x){
            return false;
        }
        if (y == 2){
            return nx == 2 && ny > y;
        }else{
            return y + 1 == ny;
        }
    }

    public void move(int nx, int ny){
        if (canMove(nx,ny)){
            this.x = nx;
            this.y = ny;
        }
    }
    public boolean canBeat(int nx, int ny ){
        if (x + 1 != nx){
            return false;
        }
        return y + 1 == ny || y - 1 == ny;
    }
    public void beat(int nx, int ny){
        if (canBeat(nx,ny)){
            this.x = nx;
            this.y = ny;
        }
    }
}
