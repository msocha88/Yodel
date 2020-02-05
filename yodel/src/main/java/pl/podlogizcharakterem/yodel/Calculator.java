package pl.podlogizcharakterem.yodel;

public class Calculator {

    private double totalLenght;
    private double width;
    private double rowLenght;
    private double sideLenght;
    private Kind kind;

    public void calculateFrenchRow() {

        sideLenght = totalLenght - width;
        rowLenght = Math.sqrt((Math.pow(sideLenght, 2) / 2));
    }

    public void calculateSide() {
        sideLenght = Math.round(Math.sqrt(2 * Math.pow(rowLenght, 2)));
        System.out.println(sideLenght);
    }

    public double getTotalLenght() {
        return totalLenght;
    }

    public void setTotalLenght(double totalLenght) {
        this.totalLenght = totalLenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSideLenght() {
        return sideLenght;
    }

    public void setSideLenght(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    public double getRowLenght() {
        return rowLenght;
    }

    public void setRowLenght(double rowLenght) {
        this.rowLenght = rowLenght;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }
}