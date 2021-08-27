
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int priceDiff = this.princePerSquare * this.squares - compared.princePerSquare * compared.squares;
        return Math.abs(priceDiff);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int price = this.squares * this.princePerSquare;
        int compPrice = compared.squares * compared.princePerSquare;

        if (price > compPrice) {
            return true;
        }
        return false;
    }

}
