package Driver;

import Transport.Transport;

public class DriverD extends Driver {
    private final char categoryLicense ='D';

    public DriverD(String fullName, int experience) {
        super(fullName, experience);
    }

    public char getCategoryLicense() {
        return categoryLicense;
    }

    @Override
    public String toString() {
        return "DriverD{" +
                "categoryLicense=" + categoryLicense +
                ", fullName='" + fullName + '\'' +
                ", experience=" + experience +
                '}';
    }
}
