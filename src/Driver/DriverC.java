package Driver;

import Transport.Transport;

public class DriverC extends Driver{
    public final char categoryLicense ='C';

    public DriverC(String fullName, int experience) {
        super(fullName, experience);
    }

    @Override
    public String toString() {
        return "DriverC{" +
                "categoryLicense=" + categoryLicense +
                ", fullName='" + fullName + '\'' +
                ", driveLicense=" + driveLicense +
                ", experience=" + experience +
                '}';
    }

    public char getCategoryLicense() {
        return categoryLicense;
    }




}
