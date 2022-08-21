package classandobject;

public class Circle {
    int radius;
    Circle()  //default constructor
    {
    	radius=23;
    }
    Circle (int i) //parameter constructor
    {
    	radius=i;
    }
    double calculateArea()
    {
        return 3.14*radius*radius;
    }
    
    public String toString()
    {
        return "Radius="+radius+   "AreaOFcircle=:"+calculateArea();
    }

}