/**
 * @author Lewis Matos, Julich Mera
 */
public class Dice{	
	public static void main(String[] args){
		int face[]=new int[6];

		for(int i=0; i<300; i++){
			++face[0+(int)(Math.random()*((5-0)+1))];
		}

		for(int i=0; i<face.length; i++){
			System.out.println((i+1)+"\t\t"+face[i]);
		}
	}
}