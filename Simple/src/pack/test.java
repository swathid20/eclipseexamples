package pack;
@FunctionalInterface
interface Add
{
   public int getSum(int a,int b);
   
}
public class test {
	
	public class Test123 {
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Add add1 =( a,  b) ->  a+b ;
	        System.out.println(add1.getSum(5, 6));
	        
	        
	      
	    }
	}


}
