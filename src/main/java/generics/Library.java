package generics;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Library<T extends Media>{
    HashSet<T> bookshelf;
    LinkedList<T> volume;

    public Library() {
        bookshelf = new HashSet<>();
        volume = new LinkedList<>();
    }

    public Set<T> getBookshelf() {
        return bookshelf;
    }

    public void addToBookshelf(T media) {
        bookshelf.add(media);
    }

    public LinkedList<T> getVolume() {
        return volume;
    }

    public void addToVolume(T media) {
        volume.add(media);
    }
}
