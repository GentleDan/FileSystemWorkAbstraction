package org.example;

public class File {

    private final int size;
    private final String fileName;
    private final MemoryCell cell;

    public File(String fileName, int size, MemoryCell cell) {
        this.fileName = fileName;
        this.size = size;
        this.cell = cell;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        return fileName;
    }

    public MemoryCell getCell() {
        return cell;
    }
}
