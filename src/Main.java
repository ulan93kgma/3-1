import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> myFavoriteBooks = new ArrayList<>();
        myFavoriteBooks.add("Граф Монте-Кристо");
        myFavoriteBooks.add("Таинственный остров");
        myFavoriteBooks.add("Мартин Иден");
        myFavoriteBooks.add("Робинзон Крузо");
        myFavoriteBooks.add("Дети Капитана Гранта");
        System.out.println(myFavoriteBooks);
        myFavoriteBooks.remove(4);
        System.out.println(myFavoriteBooks);
        myFavoriteBooks.forEach(System.out::println);
        myFavoriteBooks.set(3, "Дети Капитана Гранта");
        System.out.println("  ");
        System.out.println(myFavoriteBooks.get(3));
        myFavoriteBooks.clear();
        myFavoriteBooks.add("Ведьмак");
        myFavoriteBooks.add("Крестный отец");
        myFavoriteBooks.add("Однажды в Америке");
        System.out.println(myFavoriteBooks);
    }
}
