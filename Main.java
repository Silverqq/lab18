enum ClothingSize {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    private int euroSize;

    // Конструктор перечисления
    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        if (this == XXS) {
            return "Детский размер";
        }
        return "Взрослый размер";
    }

    public int getEuroSize() {
        return euroSize;
    }
}

interface MenClothing {
    void dressMen();
}

interface WomenClothing {
    void dressWomen();
}

class TShirt extends Clothing implements MenClothing, WomenClothing {
    public TShirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Одеваем мужскую футболку");
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем женскую футболку");
    }
}

class Pants extends Clothing implements MenClothing, WomenClothing {
    public Pants(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Одеваем мужские штаны");
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем женские штаны");
    }
}

class Skirt extends Clothing implements WomenClothing {
    public Skirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем юбку");
    }
}

class Tie extends Clothing implements MenClothing {
    public Tie(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Одеваем галстук");
    }
}

public class Main {
    public static void main(String[] args) {
        Clothing[] clothes = new Clothing[3];
        clothes[0] = new TShirt(ClothingSize.XS, 19.99, "Red");
        clothes[1] = new Pants(ClothingSize.S, 39.99, "Blue");
        clothes[2] = new Skirt(ClothingSize.L, 29.99, "Black");

        Clothing[] clothes2 = new Clothing[3];
        clothes2[0] = new TShirt(ClothingSize.M, 19.99, "Red");
        clothes2[1] = new Pants(ClothingSize.M, 39.99, "Blue");
        clothes2[2] = new Tie(ClothingSize.XS, 14.99, "Yellow");

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        System.out.println();
        atelier.dressMen(clothes2);
    }
}