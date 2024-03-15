package Lab_1_2;

public class ScreenA extends PerdeviceA2 {
    private double diagonal;
    public ScreenA(double price, String model, double diagonal ){
        super(price, model);
        this.diagonal = diagonal;
    }
    public double getDiagonal(){
        return diagonal;
    }
    public void setDiagonal(double diagonal){
        this.diagonal = diagonal;
    }

    @Override
    public String getInfo() {
        return "Тип: Монитор; " + "Модель: " + getModel() + "; цена: " + getPrice() + "; Диагональ: " + diagonal + " дюймов";
    }
}
