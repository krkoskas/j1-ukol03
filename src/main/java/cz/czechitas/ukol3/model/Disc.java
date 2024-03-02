package cz.czechitas.ukol3.model;

public class Disc {
    private long capacity;
    private long spaceUsed;

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public long getSpaceUsed() {
        return spaceUsed;
    }

    public void setSpaceUsed(long spaceUsed) {
        this.spaceUsed = spaceUsed;
    }

    @Override
    public String toString() {
        return "Dick{" +
                "capacity=" + capacity +
                ", spaceUsed=" + spaceUsed +
                '}';
    }
}
