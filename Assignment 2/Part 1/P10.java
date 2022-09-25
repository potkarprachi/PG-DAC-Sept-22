class P10{
public static void main(String[]args){

	for(int i=4;i>=0;i--){
		
		for(int j=i;j>=1;j--)
		{
			System.out.print(" ");
		}
		
		for(int j=i;j<5;j++)
		{	
			int a=65+j;
			System.out.print((char)a+" ");
			
		}
			System.out.println();
	}
}
}