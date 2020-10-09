public class Cup extends Dish{
    private int volume;
    Cup(){}
    Cup(int volume){
        this.volume=volume;
    }
    Cup(int volume,int weight){
        super(weight);
        this.volume=volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "volume=" + volume +
                ", " + super.toString();
    }
}
