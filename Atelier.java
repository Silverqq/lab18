
public class Atelier {
    public void dressWomen(Clothing[] clothes2) {
        System.out.println("Женская одежда:");
        for (Clothing clothing : clothes2) {
            System.out.println("Размер: " + clothing.getSize() + ", Цена: $" + clothing.getCost() + ", Цвет: " + clothing.getColor());
            ((WomenClothing) clothing).dressWomen();
        }
    }

    public void dressMen(Clothing[] clothes2) {
        System.out.println("Мужская одежда:");
        for (Clothing clothing : clothes2) {
            System.out.println("Размер: " + clothing.getSize() + ", Цена: $" + clothing.getCost() + ", Цвет: " + clothing.getColor());
            ((MenClothing) clothing).dressMen();
        }
    }
}