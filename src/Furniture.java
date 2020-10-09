public abstract class Furniture {
    private int weight;
    private String ManufacturedBy;
    Furniture(){}
    Furniture(int weight,String ManufacturedBy){
        this.ManufacturedBy=ManufacturedBy;
        this.weight=weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getManufacturedBy() {
        return ManufacturedBy;
    }

    public void setManufacturedBy(String manufacturedBy) {
        ManufacturedBy = manufacturedBy;
    }

    @Override
    public String toString() {
        return "weight=" + weight +
                ", ManufacturedBy='" + ManufacturedBy + '\'' +
                '}';
    }
}
