public enum RoomType {
    SINGLE(1, 70),
    DOUBLE(2, 90),
    FAMILY(4, 120),
    SUITE(2, 200);

    private final int capacity;
    private final int nightlyRate;

    RoomType(int capacity, int nightlyRate){
        this.capacity = capacity;
        this.nightlyRate = nightlyRate;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNightlyRate() {
        return nightlyRate;
    }
}
