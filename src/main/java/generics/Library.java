package generics;

import java.util.HashSet;
import java.util.Set;

public class Library<T extends Media>{
    Set<T> bookshelf;

    public Library() {
        bookshelf = new HashSet<>();
    }
}
