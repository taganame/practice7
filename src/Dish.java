public abstract class Dish {
    private int weight;
    Dish(){};
    Dish(int weight){
        this.weight=weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "weight=" + weight +
                '}';
    }

}
