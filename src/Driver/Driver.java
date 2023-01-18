package Driver;

import Transport.Competing;
import Transport.Transport;

public abstract class Driver {

    /*abstract*/ char categoryLicense; //<- мне надо что бы была переменная которую обязательно надо определить в наследниках, как это сделать?
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

        //А что если мне надо что бы этот метод был переопределен
        // но при этом я хочу оставить это тело?

    public<T extends Transport> void stop(T t){
        System.out.print(fullName+" жмёт тормоз и ");
        t.finishMove();

    }
    public<T extends Transport&Competing> void refuel(T t){
        System.out.print(fullName+" решил заправится: ");
        t.pitStop();
    }


}
