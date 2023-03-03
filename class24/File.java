package com.class24;

public abstract class File {

    int size;

    File(int size) {
        this.size = size;
    }

    abstract void open();

    void edit() {
        System.out.println("Editing the file");
    }

    void close() {
        System.out.println("Closing the file");
    }

}

class JavaFile extends File {
    JavaFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("We need Notepad++ to open Java files");
    }

    @Override
    void edit() {
        System.out.println("Editing the file in Intellij");
    }
}

class WordFile extends File {
    WordFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("Opening the file in Microsoft word");
    }
}

class PdfFile extends File {
    PdfFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("Opening the file in acrobat reader");
    }
}
