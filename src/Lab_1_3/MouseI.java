package Lab_1_3;

public class MouseI extends PerdeviceI3 {
    private double garantYear;
    private boolean wire;
    private double diagonal;
    private double price;
    private String model;
    public MouseI(double price, String model, double garantyYear, boolean wire){
        this.garantYear = garantyYear;
        this.wire = wire;
        this.price = price;
        this.model = model;
        this.diagonal = diagonal;
    }

    public void setGarantYear(double garantYear) {
        this.garantYear = garantYear;
    }
    public void setWire(boolean wire){
        this.wire = wire;
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
    @Override
    public String getModel() {
        return model;
    }
    @Override
    public double getPrice(){
        return price +  1000*garantYear;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setModel(String model) {
        this.model = model;
    }

}
