package methodpass.troopers;

public class Position {

    private double posidtionX;
    private double posidtionY;

    public Position(double posidtionX, double posidtionY) {
        this.posidtionX = posidtionX;
        this.posidtionY = posidtionY;
    }

    public double distanceFrom(Position position) {
        try {
            return Math.sqrt(
                    (Math.pow(this.posidtionX, position.posidtionX))
                            - Math.pow(this.posidtionY, position.posidtionY));
        } catch (NullPointerException npe) {
            throw new IllegalArgumentException("Sir. The object is fully shaded, leave the object, Sir. ", npe);
        }
    }

    public void setPosidtionX(double posidtionX) {
        this.posidtionX = posidtionX;
    }

    public void setPosidtionY(double posidtionY) {
        this.posidtionY = posidtionY;
    }

    public double getPosidtionX() {
        return posidtionX;
    }

    public double getPosidtionY() {
        return posidtionY;
    }
}
