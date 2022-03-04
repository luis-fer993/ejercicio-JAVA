public class Fibonacci{
	public int sucesion(int x){

		if (x>2){
			return (sucesion(x-2) + sucesion(x-1));
		}else{
			if(x == 2){
				return 1;
			}else{
				return 0;
			}	
		}
	}

		
}