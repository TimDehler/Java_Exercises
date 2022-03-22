package rooms;

public class Room {

    private boolean isFree;
    private int space;

    public Room(boolean isFree, int space) {
        this.isFree = isFree;
        this.space = space;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public boolean isFree() {
        return isFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "isFree=" + isFree +
                ", space=" + space +
                '}';
    }
}
