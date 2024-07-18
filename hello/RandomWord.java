import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
	public static void main(String[] args){
		double count = 0.0;
		String champion = "";
		while(!StdIn.isEmpty()){
			String temp = StdIn.readString();
			if(StdRandom.bernoulli(1 / ++count)){
				champion = temp;
			}
		}
		StdOut.println(champion);
			
		}		
}


