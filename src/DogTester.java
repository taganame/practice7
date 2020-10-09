public class DogTester {
    public static void main(String[] args) {
        Dog dogType1=new DogType1(12,"Авель","Параметр собаки 1");
        Dog dogType2=new DogType2(15,"Кайн","Параметр собаки 2");
        System.out.println(dogType1.toString()+'\n'+dogType2);
        dogType1.setName("кВаС");
        dogType2.setName("ВЯтсКИй");
        System.out.println(dogType1.toString()+'\n'+dogType2);
    }
}
