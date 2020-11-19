package pract12;

public class MusicDocument implements IDocument {
    private String document;

    public MusicDocument() {
        this.document = "Music document!";
    }

    public String infoDocument() {

        return document;
    }
}