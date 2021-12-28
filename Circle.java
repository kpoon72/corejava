package oopproj;

public class Circle {
 double radius;
 double area;
 double circumference;
 static final double pi=Math.PI;

 public void areaCricle(){
	 area= radius * radius * pi;
	 System.out.println("Radius of circle is : "+area);
 }
 
 public void circumferenceOfCircle() {

	 circumference=  Math.PI * (2 * radius);
	 System.out.println("Circumference of circle is : "+circumference);
	}
}
