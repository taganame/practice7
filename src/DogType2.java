public class DogType2 extends Dog {
    private String type2Param;
    DogType2(){}
    DogType2(int age,String name,String type2Param){
        super(age, name);
        this.type2Param=type2Param;
    }

    public String getType2Param() {
        return type2Param;
    }

    public void setType2Param(String type2Param) {
        this.type2Param = type2Param;
    }

    @Override
    public String toString() {
        return "DogType2{" +
                "type2Param='" + type2Param + '\'' +
                ", " + super.toString();
    }
}
