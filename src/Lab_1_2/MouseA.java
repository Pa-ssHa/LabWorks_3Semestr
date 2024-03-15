package Lab_1_2;

public class MouseA extends PerdeviceA2{
    private double garantYear;
    private boolean wire;
    public MouseA(double price, String model, double garantyYear, boolean wire){
        super(price, model);
        this.garantYear = garantyYear;
        this.wire = wire;
    }
    @Override
    public double getPrice(){
        return super.getPrice() +  1000*garantYear;
    }

    public String getInfo() {
        String haveWire = wire ? "Да" : "Нет";
        return "Тип: Мышь; " + "Модель: " + getModel() + "; цена: " + getPrice() + "; Беспроводная: " + haveWire;
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
