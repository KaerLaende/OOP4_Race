package Driver;

import Transport.Competing;
import Transport.Transport;

import java.util.Objects;

public abstract class Driver {

    char categoryLicense;
    final String fullName;
    boolean driveLicense;
    int experience;

    public char getCategoryLicense() {
        return categoryLicense;
    }

    public boolean isDriveLicense() {
        return driveLicense;
    }

    public void setDriveLicense(boolean driveLicense) {
        this.driveLicense = driveLicense;
    }

    public int getExperience() {
        return experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setExperience(int experience) {
        if (experience<0){
            this.experience =0;
        }
        else {
            this.experience = experience;
        }
    }

    public Driver(String fullName, int experience) {
        if (fullName != null && !fullName.isEmpty() && !fullName.isBlank()) {
            this.fullName = fullName;
        } else {
            this.fullName = "ФИО";
        }
        this.driveLicense = driveLicense;
        if(experience>0){
            this.experience = experience;
            this.driveLicense=true;
        }
        else  {
            this.experience=0;
            this.driveLicense=false;
        }
    }

    public <T extends Transport> void pressGaz(T t) {
        System.out.print(fullName + " нажал на газ и его ");
        t.startMove();
    }

    public<T extends Transport> void stop(T t){
        System.out.print(fullName+" жмёт тормоз и ");
        t.finishMove();

    }

    public<T extends Transport&Competing> void refuel(T t){
        System.out.print(fullName+" решил заправится: ");
        t.pitStop();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return categoryLicense == driver.categoryLicense && driveLicense == driver.driveLicense && experience == driver.experience && fullName.equals(driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryLicense, fullName, driveLicense, experience);
    }

}
