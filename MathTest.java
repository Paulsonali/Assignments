/* 1. 
 Create a class Math with following requirements
- A class level data member called PI set to 3.14.
- A class level public method called getCircleArea, which takes as input an integer parameter called radius. This function should return area of the circle as a double
 */

public class MathTest {
    public static void main(String[] args) {
        Math m=new Math();
		m.getCircleArea(12);
		
    }
}   


class Math{
    double PI=3.14;
	double r;
	
	public double getCircleArea(double r) {
		double area=PI*r*r;
		System.out.println(area);
		return area;
	}


}


