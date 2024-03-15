package Lab_2_2;

public class Traffic {
    private String familyName;
    private double hourTime;

    public Traffic(String familyName, double hourTime) {
        this.familyName = familyName;
        this.hourTime = hourTime;
    }

    public String getFamilyName() {
        return familyName;
    }

    public double getHourTime() {
        return hourTime;
    }
}
