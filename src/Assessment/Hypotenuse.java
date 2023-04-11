package Assessment;

import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1 of your triangle: ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter side 2 of your triangle: ");
        double side2 = scanner.nextDouble();

        Hypotenuse testHypotenuse = new Hypotenuse(side1, side2);
        testHypotenuse.hypotenuse();
    }
    private double side1;
    private double side2;

    public Hypotenuse(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double hypotenuse(){
        //hypotenuse = square root of (side1 squared + side2 squared)
        double hypotenuse = Math.sqrt(Math.pow(getSide1(), 2) + Math.pow(getSide2(), 2));
        System.out.printf("The hypotenuse is %.2f", hypotenuse);
        return hypotenuse;
    }
}