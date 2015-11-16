import acm.program.ConsoleProgram;

public class FiestaArdilla extends ConsoleProgram {

	public void run(){

		println(fiestaArdillas(30, false));
		println(fiestaArdillas(60, false));
		println(fiestaArdillas(70, true));
		
	}

	private boolean fiestaArdillas (int bellotas, boolean finDeSemana){
		if (finDeSemana){
			return true;
		}

		if (bellotas >= 40 && bellotas <= 60) {
			return true;
		}
		return false;
	}
	
	
}
