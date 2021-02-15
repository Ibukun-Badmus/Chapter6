import java.util.Scanner;

public class Sphere {
    public void determineSphereVolume() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of sphere: ");

        double radius = input.nextDouble();

        System.out.printf("Volume is %f\n", sphereVolume(radius));
    }


    public double sphereVolume(double radius) {

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}

