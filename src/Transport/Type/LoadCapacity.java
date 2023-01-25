package Transport.Type;

public enum LoadCapacity {
    N1(null,3.5f),
    N2(3.5f,12f),
    N3(12f,null);

    private Float loadLimitBase;
    private Float loadLimitMax;

    LoadCapacity(Float loadLimitBase, Float loadLimitMax) {
        this.loadLimitBase = loadLimitBase;
        this.loadLimitMax = loadLimitMax;
    }


    @Override
    public String toString() {
        return String.format("Грузоподьемность: %s,%s",(loadLimitBase!=null? "от "+loadLimitBase : ""),(loadLimitMax!=null? " до "+loadLimitMax : "")) ;
    }
}
