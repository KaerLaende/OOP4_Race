package Driver;

import Transport.Competing;
import Transport.Transport;

public abstract class Driver {
    /*abstract*/ char categoryLicense; //<- мне надо что бы была переменная которую обязательно надо определить в наследниках, как это сделать?
    final String fullName;
    boolean driveLicense;
    int experience;

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
        else if (experience<0 || experience==0) { //можно убрать IF, но мне понятнее если оставить
            this.experience=0;
            this.driveLicense=false;
        }
    }

    // Ниже в этих методах >Должно!< вызываться метод Transport.startMove
    protected void startMove(){
        System.out.println(fullName+" нажал на газ"); //А что если мне надо что бы этот метод был переопределен

    }  // но при этом я хочу оставить это тело?

    protected void stop(){
        System.out.println(fullName+" жмёт тормоз"/*и машина остановилась ->.finishMove()*/);
    }// как это сделать?
    protected void refuel(){
        System.out.println(fullName+" решил заправится");
    }


}
