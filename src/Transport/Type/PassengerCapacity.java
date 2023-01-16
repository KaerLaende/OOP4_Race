package Transport.Type;

public enum PassengerCapacity {

    VERY_SMALL(0,10),
    SMALL (0,25),
    MEDIUM (40,50),
    LARGE (60,80),
    VERY_LARGE (100,120);

    private int loadLimitBase;
    private int loadLimitMax;

    PassengerCapacity(int loadLimitBase, int loadLimitMax) {
        this.loadLimitBase = loadLimitBase;
        this.loadLimitMax = loadLimitMax;
    }


    @Override
    public String toString() {
        return String.format("Пассажировместимость: %s,%s человек",(loadLimitBase!=0?/*null - не возможен в свойствах екземпляра Enum*/ "от "+loadLimitBase : ""),(loadLimitMax!=0? " до "+loadLimitMax : "")) ;
    }

}
