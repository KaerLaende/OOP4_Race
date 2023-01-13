package Driver;

public class DriverC extends Driver{
    final char categoryLicense ='C';

    public DriverC(String fullName, int experience) {
        super(fullName, experience);
    }

    public char getCategoryLicense() {
        return categoryLicense;
    }


}
