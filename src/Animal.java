public abstract class Animal {
    private String name;
    private int numLHeads = 1;
    private int numLimbs = 4;
    private boolean hasTail = true;

    public abstract void sound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumLHeads() {
        return numLHeads;
    }

    public void setNumLHeads(int numLHeads) {
        this.numLHeads = numLHeads;
    }

    public int getNumLimbs() {
        return numLimbs;
    }

    public void setNumLimbs(int numLimbs) {
        this.numLimbs = numLimbs;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
}
