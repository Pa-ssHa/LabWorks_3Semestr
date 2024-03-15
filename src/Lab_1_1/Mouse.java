package Lab_1_1;

public class Mouse extends Perdevice {
    private double garantYear;
    private boolean wire;
    public Mouse(double price, String model, double garantyYear, boolean wire){
        super(price, model);
        this.garantYear = garantyYear;
        this.wire = wire;
    }
    @Override
    public double getPrice(){
        return super.getPrice() +  1000*garantYear;
    }

    @Override
    public String toString() {
        String haveWire = wire ? "Да" : "Нет";
        return "Тип: Мышь; " + super.toString() + "; Беспроводная: " + haveWire;
    }
    public double getGarantYear(){
        return garantYear;
    }
    public boolean getWire(){
        return wire;
    }
    public void setGarantYear(double garantYear) {
        this.garantYear = garantYear;
    }
    public void setWire(boolean wire){
        this.wire = wire;
    }
}
