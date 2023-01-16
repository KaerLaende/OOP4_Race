package Driver;

import Transport.Transport;

public class DriverB extends Driver {
    public final char categoryLicense ='B';

    public DriverB(String fullName, int experience) {
        super(fullName, experience);
    }

    public char getCategoryLicense() {
        return categoryLicense;
    }


}
