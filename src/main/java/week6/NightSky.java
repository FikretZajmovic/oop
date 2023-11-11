package week6;

import java.util.Random;

class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density)
    {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height)
    {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine()
    {
        int starsInLine = 0;
        Random random = new Random();
        for (int i = 0; i < this.width; i++) {
            if (random.nextDouble() <= this.density) {
                System.out.print("*");
                starsInLine++;
            } else {
                System.out.print(" ");
            }
        }
        starsInLastPrint += starsInLine;
    }
    public void print() {
        starsInLastPrint = 0;
        for (int i = 0; i < this.height; i++) {
            printLine();
            System.out.println();
        }
    }
    public int starsInLastPrint()
    {
        return starsInLastPrint;
    }
}
