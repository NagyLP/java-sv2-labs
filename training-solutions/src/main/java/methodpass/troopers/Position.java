package methodpass.troopers;

public class Position {

    private double posX;
    private double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double distanceFrom(Position position) {
        try {
            return Math.sqrt(
                    (Math.pow(this.posX, position.posX))
                            - Math.pow(this.posY, position.posY));
        } catch (NullPointerException npe) {
            throw new IllegalArgumentException("Sir. The object is fully shielded, leave the object, Sir. ", npe);
        }
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
}
