// this is a class to show the use and implimentation of annotations

// this is parent/base/super class

// this is funtional interface

@FunctionalInterface
interface Demo
{
    void disp();
    //void disp2();
}

class plane
{
    public void planeFliesAtGoodHeight()
    {
        System.out.println(" Plane is flying. ");
    }
}

// this is child class or subclass
class Cargoplane extends plane
{
    // this is overriden method
    @Override
    public void planeFliesAtGoodHeight()
    {
        System.out.println(" CargoPlane flies low. ");
    }
}

public class A9
{
    public static void main(String args[])
    {
        // object of child class 
        plane cp = new Cargoplane();
        cp.planeFliesAtGoodHeight();
    }
}