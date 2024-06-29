package org.example;

public class MemoryCell {

    private int cellStatus; // 0 - free cell, 1 - cell with data, 2 - selected cell
    private MemoryCell nextCell;

    public MemoryCell(int cellStatus) {
        this.cellStatus = cellStatus;
    }

    public int getCellStatus() {
        return cellStatus;
    }

    public void setCellStatus(int cellStatus) {
        this.cellStatus = cellStatus;
    }

    public MemoryCell getNextCell() {
        return nextCell;
    }

    public void setNextCell(MemoryCell nextCell) {
        this.nextCell = nextCell;
    }
}
