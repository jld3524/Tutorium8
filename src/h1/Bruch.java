package h1;



public class Bruch {
	public int zaehler;   
    public int nenner;
    
    public Bruch(int zaehler, int nenner) {
    	if (nenner == 0) {
            throw new IllegalArgumentException("Nenner darf nicht 0 sein!");
        }

        this.zaehler = zaehler;
        this.nenner = nenner;
    }
	
	private int ggT (int x, int y) {
		int a = Math.abs(x);
	    int b = Math.abs(y);

	    while (b != 0) {
	        int r = a % b;
	        a = b;
	        b = r;
	    }
		return a;
	}
	
	public void shorten() {
		int gTeiler = ggT(Math.abs(zaehler), Math.abs(nenner));
		
		zaehler = zaehler / gTeiler;
		nenner = nenner / gTeiler;
	}
	
	public boolean hasSameValueAs(Bruch b) {
		return (long)  this.zaehler * b.nenner == b.zaehler* this.nenner;
    }

}



