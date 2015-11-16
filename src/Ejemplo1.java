import acm.program.*;

public class Ejemplo1 extends ConsoleProgram{

	//sleepIn recibe dos parametros booleanos
	//el primero es weekday y vale true si es un dia laborable
	//el segundo parametro es vacation y vale true si es un dia festivo
	//Devuelve true si es un dia no laborable o estamos de vacaciones
	
	
	public boolean sleepIn(boolean weekday, boolean vacation) {
		  if (!weekday || vacation){
			  return true;
		  }
		  return false;
		}
	
	//monkeyTrouble recibe dos parámetros booleanos
	//el primero indica si sonrie el mono A
	//el segundo indica si sonrie el mono B
	
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile){
		if (aSmile && bSmile){
			return true;
	}
		if (!aSmile && !bSmile){
			return true;
		}
		return false;
}
	
	//sumDoble 
	
	public int sumDouble(int a, int b) {
		  		  if (a != b){
			  return (a+b);
		  }
		  		  else {
		  			  return (a +b)*2;
		  		  }
	}
	
	
	
	
	public void run(){
		println (sleepIn(false, false));
	}
}
