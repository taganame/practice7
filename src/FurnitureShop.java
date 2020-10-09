import java.util.Arrays;

public class FurnitureShop {
    private Furniture[] furniture;
    private Furniture[] furniture(int b) {
        furniture=new Furniture[b];
        for (int i = 0; i < b; i++) {
            if (Math.random() * 10 > 5)
                furniture[i] = new Chair((int)(Math.random()*20), "Manufactory" + (int)(Math.random() * 1000), "ChairType" + (int)(Math.random() * 1000));
            else
                furniture[i] = new Table((int)(Math.random()*20), "Manufactory" + (int)(Math.random() * 1000), "TableType" + (int)(Math.random() * 1000));
        }
        return furniture;
    }

    public void out() {
        int b=(int)(Math.random()*10+2);
        Furniture furnitures[]=furniture(b);
        for (int i = 0; i < b; i++) {
            System.out.println(furnitures[i].toString());
        }
    }
}
