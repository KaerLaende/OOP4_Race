package Driver;

import Transport.Transport;

public class DriverB extends Driver {
    final char categoryLicense ='D';

    public DriverB(String fullName, int experience) {
        super(fullName, experience);
    }

    public char getCategoryLicense() {
        return categoryLicense;
    }


}
