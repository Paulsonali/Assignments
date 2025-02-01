class AreaOfCircle {


    double PI=3.14;
      double  radius;
      double area;
      
      AreaOfCircle(double radius){
          this.radius=radius;
          //System.out.println(radius);
          //display(radius);
          
      
  
  }
      public void display() {
          area=PI*radius*radius;
          System.out.println(area);
          
      }  
  }
  
  public class AreaOfCircleTest {
      public static void main(String[] args) {
          // TODO Auto-generated method stub
          AreaOfCircle area=new AreaOfCircle(3);
          area.display();
  
      }
      
  }
  




    
}
