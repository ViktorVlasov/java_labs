package pract12;

public  class TextDocument implements IDocument {
    private String document;

    public TextDocument() {
        this.document = "New document for text";
    }

    public String infoDocument() {
        return document;

    }
}