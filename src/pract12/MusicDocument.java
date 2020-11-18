package pract12;

public class MusicDocument implements IDocument {
    private String document;

    public MusicDocument() {
        this.document = "Music document : lala-la-la-lala-la !";
    }

    public String infoDocument() {

        return document;
    }
}