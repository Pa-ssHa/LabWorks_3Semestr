package Lab_1_1;

public class Screen extends Perdevice{
    private double diagonal;
    public Screen(double price, String model, double diagonal ){
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
    public String toString() {
        return "Тип: Монитор; " + super.toString() + "; Диагональ: " + diagonal + " дюймов";
    }
}

