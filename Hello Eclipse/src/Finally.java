
public class Finally {
	public static void main(String[] args) {

	    try {
	        System.out.println("ciao");
	        
	    }
	    catch (Exception e) {
	    	System.out.println("ciao2");
	    	return;
	    }
	    
	    finally {
	        System.out.println("finally trumps return.");
	    }
	}
}
