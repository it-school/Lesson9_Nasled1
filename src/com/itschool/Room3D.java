package com.itschool;

public class Room3D extends Room2D
{
    private double height;

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public Room3D(double width, double length, double height) {
        super(width, length);
        this.height = height;
        CheckCorrectness();
    }

    public Room3D(double size)
    {
        super(size);
        this.height = size;
        CheckCorrectness();
    }

    @Override
    public void CheckCorrectness() {  // заменить использованием побитовых операций
        super.CheckCorrectness();
        if ((this.height > 0) && (super.isError == false))  // ^ ! & |
            super.isError = false;
        else
            super.isError = true;
    }

    public double GetVolume() {
        return super.GetArea()*this.height;
    }
}
