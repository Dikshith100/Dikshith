
public class Pattern3 {
	
	public static void main(String[] args) {
		for(int r =1;r<=15;r++) {
			for(int c=1;c<=15;c++) {
				if( (r==1) ||(r==15)) {
					System.out.print("*");
				}
				else {
					if( (c==1) || (c==15)) {
						System.out.print(" ");
					}
				}
			}
		}
	}

}
