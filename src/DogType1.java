public class DogType1 extends Dog{
    private String type1Param;
    DogType1(){}
    DogType1(int age,String name,String type1Param){
        super(age, name);
        this.type1Param=type1Param;
    }

    public String getType1Param() {
        return type1Param;
    }

    public void setType1Param(String type1Param) {
        this.type1Param = type1Param;
    }

    @Override
    public String toString() {
        return "DogType1{" +
                "type1Param='" + type1Param + '\'' +
                ", " + super.toString();
    }
}
