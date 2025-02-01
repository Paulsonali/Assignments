class StudenSwap {
    int age;
	String name;
	
    StudenSwap(int age,String name){
        this.age=age;
        this.name=name;
    }

	
	public void display() {
		System.out.println("Age"+":"+age+ "Name"+":"+name);
	}

    
}


public class StudenSwapTest {

public static void main(String[] args) {
    

    		// TODO Auto-generated method stub
		StudenSwap new1=new StudenSwap(23,"poonam");
		new1.display();
		StudenSwap new2=new StudenSwap(26,"Roshan");
		new2.display();
		
		swapFunction(new1, new2);
	
	}

	static void swapFunction(StudenSwap new11, StudenSwap new22) {
		int temp1=new11.age;//23
		String s1=new11.name;
		System.out.println("Before Swapping  " +temp1);
		System.out.println("Before Swapping  " +s1);
		int temp2=new22.age;//26
		String s2=new22.name;
		System.out.println("Before Swapping " +temp2);
		System.out.println("Before Swapping  " +s2);
        int temp=temp1;
		temp1=temp2;
		temp2=temp;
		String stemp=s1;
		s1=s2;
		s2=stemp;
		
		
		System.out.println("After Swapping " +temp1);
		System.out.println("After Swapping " + temp2);
		System.out.println("After Swapping " +s1);
		System.out.println("After Swapping " +s2);
		
     
		
		
	}
    
}
