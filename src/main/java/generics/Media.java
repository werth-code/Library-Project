package generics;

public abstract class Media <T>{
    String mediaName;
    MediaType mediaType;
    T content;

    public Media(String mediaName, MediaType mediaType, T content) {
        this.mediaName = mediaName;
        this.mediaType = mediaType;
        this.content = content;
    }

}
