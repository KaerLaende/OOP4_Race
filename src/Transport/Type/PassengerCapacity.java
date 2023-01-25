package Transport.Type;

public enum PassengerCapacity {

    VERY_SMALL(null,10),
    SMALL (null,25),
    MEDIUM (40,50),
    LARGE (60,80),
    VERY_LARGE (100,120);

    private Integer loadLimitBase;
    private Integer loadLimitMax;

    PassengerCapacity(Integer loadLimitBase, Integer loadLimitMax) {
        this.loadLimitBase = loadLimitBase;
        this.loadLimitMax = loadLimitMax;
    }


    @Override
    public String toString() {
        return String.format("Пассажировместимость: %s,%s человек",(loadLimitBase!=null? "от "+loadLimitBase : ""),(loadLimitMax!=null? " до "+loadLimitMax : "")) ;
    }

}
