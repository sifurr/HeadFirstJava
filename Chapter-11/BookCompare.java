import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class BookCompare implements Comparator<Book> {
    public int compare(Book one, Book two) {
        return one.title.compareTo(two.title);
    }
}

class TestTreeComparator {
    public void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");

        BookCompare bookCompare = new BookCompare();
        Set<Book> tree = new TreeSet<>(bookCompare);
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}


/* 
class Book implements Comparable<Book> 
{
    String title;

    public Book(String t) 
    {
        title = t;
    }
    
    @Override
    public int compareTo(Book other)
    {
        return title.compareTo(other.title);
    }
}

*/