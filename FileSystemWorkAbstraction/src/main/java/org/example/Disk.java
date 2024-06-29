package org.example;

public class Disk {

    private final int sectorSize;
    private final int memoryCapacity;
    private final MemoryCell[] cells;

    public Disk(int sizeDisk, int sectorSize) {
        this.sectorSize = sectorSize;
        memoryCapacity = sizeDisk / sectorSize;
        cells = new MemoryCell[memoryCapacity];
        fillData();
    }

    public void fillData() {
        for (int i = 0; i < memoryCapacity; i++) {
            cells[i] = new MemoryCell(0);
        }
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public MemoryCell[] getCells() {
        return cells;
    }

    public int getSectorSize() {
        return sectorSize;
    }
}
