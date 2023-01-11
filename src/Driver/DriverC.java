package Driver;

public class DriverC extends Driver{
    final char categoryLicense ='C';

    public DriverC(String fullName, int experience) {
        super(fullName, experience);
    }

    public char getCategoryLicense() {
        return categoryLicense;
    }

    public void startMove() {
        System.out.println(fullName + " нажал на газ");
    }
    public void stop(){
        System.out.println(fullName+" жмёт тормоз");
    }
    public void refuel(){
        System.out.println(fullName+" решил заправится");
    }
}
