package com.itschool;

public class Room2D
{
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
        else
            isError = true;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0)
            this.length = length;
        else
            isError = true;
    }

    public Room2D()
    {
    }

    public void CheckCorrectness()
    {
        if (width > 0 && length > 0)
            isError = false;
        else
            isError = true;
    }

    public Room2D(double width)
    {
        this.width = this.length = width;
        CheckCorrectness();
    }

    public Room2D(double width, double length) {
            this.width = width;
            this.length = length;
            CheckCorrectness();
        }

    public boolean isError() {
        return isError;
    }

    protected boolean isError = false;
    private double width;
    private double length;

    public double GetArea()
    {
        return this.length*this.width;
    }
}
