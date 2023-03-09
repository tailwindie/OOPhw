public class Program {
    private static void ShowProducts(Product[] all){
        for (Product product : all) {
            System.out.println(product);
            System.out.println("----");
        }
    }
    public static void main(String[] args) {
        Product milk = new Milk("Янта", 99, 6, "Литр", "3 месяца", 2);
        Product limonade = new Drinks("Черноголовка", 39, 12, "Литр", 2);
        Product bread = new Bread("Из опары", 29, 1, "шт", "3 дня", "1 сорт");
        Product eggs = new Eggs("Первой категории", 69, 10, "шт", "1 месяц", 10);
        Product masks = new Masks("Чистая линия", 379, 12, "шт", 12);
        Product paper = new ToiletPaper("Zeva", 285, 12, "шт", 12, 2);
        Product diapers = new Diapers("Pampers", 1299, 56, "шт.", 1, "да", 12, 5, 7, "Свободный");
        Product nipple = new Nipple("Соска", 129, 1, "шт.", 0, "да");
    
        Product[] all = new Product[] {milk, limonade, bread, eggs, masks, paper, diapers, nipple};

        ShowProducts(all);
    }

}
