package com.solid.lsp;

public class Square {

    private Rectangle sq;

    Square(int side) {
        this.sq = new Rectangle(side,side);
    }

    public void setSide(int side) {
        this.sq.setWidth(side);
        this.sq.setHeight(side);
    }

    public int getSide() {
        return this.sq.getHeight();
    }
    public int getWidth() {
        return this.sq.getWidth();
    }
    public int getHeight() {
        return this.sq.getHeight();
    }
    public int getArea() { 
        return this.sq.getArea();
    }
}
