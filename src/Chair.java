public class Chair extends Furniture{
   private String ChairType;
   Chair(){}
   Chair(int weight,String ManufacturedBy,String ChairType){
       super(weight,ManufacturedBy);
       this.ChairType=ChairType;
   }

    public void setChairType(String chairType) {
        ChairType = chairType;
    }

    public String getChairType() {
        return ChairType;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "ChairType='" + ChairType + '\'' +
                ", " + super.toString();
    }
}
