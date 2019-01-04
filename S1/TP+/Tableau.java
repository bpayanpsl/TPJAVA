public class Tableau {
	public static void main(String args[]) {
		
		final int sizeX = 60;
		final int sizeY = 26;
		int x = 0;
		int y = 0;
		boolean right = true;
		boolean up = true;
			
		boolean t[][] = new boolean[sizeX][sizeY];
		for(x = 0;x< sizeX ; x++){
			for(y = 0;y< sizeY ; y++){
				t[x][y] = true;
			}		
		}
		
		for(int i = 0; i < 60;i++){
			t[i][10] = false;
		}
		
		for(int i = 0; i < 60;i++){
			t[i][20] = false;
		}
		
		x = 0;
		y = 0;
		
		while(true){
			if(right){
				
					x++;
					if(x == sizeX-1){
						right = false;
					}
				
			}else{
				
				x--;
				if(x == 0){
					right = true;
				}
			}
			if(up){
				
				y++;
				if(y == sizeY-1){
					up = false;
				}
			}else{
				
				y--;
				if(y == 0){
					up = true;
				}
			}
			try{
				Thread.sleep(50);
			}catch(InterruptedException ex){
				
			}
			if(!t[x][y]){
					System.out.println("false");
			}
			
			System.out.println("x : "+x +", y : "+ y);
			
		}
		
		
	}
}