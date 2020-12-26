package generics;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Library<T extends Media>{
    Set<T> bookshelf;
    LinkedList<T> volume;

    public Library() {
        bookshelf = new HashSet<>();
        volume = new LinkedList<>();
    }
}
