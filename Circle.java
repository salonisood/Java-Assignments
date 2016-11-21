class Circle

{
double radius;
double diameter;
double area;
double Perimeter;


Circle (double radius, double diameter) 

    { this.radius= radius; 
      this.diameter= diameter;
    }

public double Calculation1() 
     { 
     area= radius* radius* java.lang.Math.PI;
     return area;
     }

public double Calculation2() 
     { 
     area= diameter* diameter* java.lang.Math.PI/4;
     return area;
     }
public double Calculation3() 
     { 
     Perimeter= 2*radius* java.lang.Math.PI;
     return Perimeter;
     }
public double Calculation4() 
     { 
    Perimeter= diameter* java.lang.Math.PI;
     return Perimeter;
     }
 public static void main (String [] args)
    {
     Circle c= new Circle (10,20);
     System.out.println("The radius of the circle is " +c.radius);
     System.out.println("The diameter of the circle is " +c.diameter);
     System.out.println("The area of the circle using the radius is " +c.Calculation1());
     System.out.println("The area of the circle using the diameter is " +c.Calculation2());
     System.out.println("The perimeter of the circle using the radius is " +c.Calculation3());
     System.out.println("The perimeter of the circle using the diameter is " +c.Calculation4());
    }
    

}
