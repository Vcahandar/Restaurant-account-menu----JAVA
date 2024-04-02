package lesson9.Mentor.Restoran;

public class Menu {

    Kabab kabab;
    Meze meze;
    Ichki ichki;

    public Menu(Kabab kabab, Meze meze, Ichki ichki) {
        this.kabab = kabab;
        this.meze = meze;
        this.ichki = ichki;
    }

    public double calculateTotalPrice() {
        return kabab.getPrice() + meze.getPrice() + ichki.getPrice();
    }
}
