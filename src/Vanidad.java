import acm.program.*;


public class Vanidad extends ConsoleProgram {
	
	public void run(){
		println(muyVanidoso(22));
		println(muyVanidoso(23));
		println(muyVanidoso(24));
	}
	 private boolean muyVanidoso( int numero){
	 
		 if ((numero % 11) == 0){
			 return true;
		 }
		 if ((numero % 11) == 1){
			 return true;
		 }		 
		 return false;
	 }

}