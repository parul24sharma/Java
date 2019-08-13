import java.util.Scanner;
import java.io.IOException;

class DisplayBoard{
	public static void main(String args[])throws IOException, InterruptedException{
		int x=2,y=0;
		for(y=f[0].length-2; y>edge-width ; y--){
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			frame();
			message(x,y);
			display();
			try{
				Thread.sleep(1);
			}catch(Exception e){
				System.out.println(e);
			}
			if(y == edge-width+1){
				y = f[0].length-1;
			}
		}
	}
	
	static char[][] f = new char[10][120];
	static int edge = 40;	//edge is left edge
	static void frame(){
		 for(int i=0;i<f.length;i++){
		 	for(int j=0;j<f[i].length;j++){
		 		if((i==0||i==f.length-1)&&j>edge || j==edge || j==f[i].length-1){
		 			f[i][j] = '#';
		 		}
		 		else{
		 			f[i][j] = ' ';
		 		}
		 	}
		 }
	}
	static int height = 6,width = 7;//of the string message 0

	static void message(int x, int y){
		for(int i=0; i<height;i++){
			for(int j=0; j<width;j++){
				if(j+y<f[i].length-1 && j+y>edge){
					if(i==0|| i==5 || j==0 || j==6){
						try{
							f[i+x][j+y]= '*';
						}catch(Exception e){
							System.out.print("Array index error");
						}
					}
				}
			}
		}
	}
	static void display(){
		for(int i=0;i<f.length;i++){
		 	for(int j=0;j<f[i].length;j++){
		 		System.out.print(f[i][j]);
		 	}
		 	System.out.println();
		 }
	}
}

/*
*******
*     *
*     *
*     *
*     *
*******

*/