package ex03;

public class Ex03 {
	public static void main(String[] args) {
		ListArray[] Arrays = {new ListArray(8),new ListArray(5),new ListArray(9),new ListArray(20)};
		System.out.println("array befor sort");
		for(int i = 0; i<Arrays.length;i++){
			System.out.print(Arrays[i].getValues() +  " ");
		
		}
		SortInCount(Arrays);
		System.out.println("\narray after sort");
		for(int i = 0; i<Arrays.length;i++){
			System.out.print(Arrays[i].getValues() +  " ");
		
		}
	}
	public static int Count(int a){
		int count = 0;
		for(int i = 1 ; i <= a; i++){
				if(a % i == 0) count++;
		}
		return count;
	}	
	
	public static void SortInCount(ListArray[] Arrays)
	{
	
		for(int i = 0; i<Arrays.length;i++){
			
			for(int  j = i+1 ; j < Arrays.length;j++)
			{
				if(Count(Arrays[i].getValues()) > Count(Arrays[j].getValues()))
				{
					
					int t = Arrays[i].getValues();
					Arrays[i].setValues(Arrays[j].getValues());
					Arrays[j].setValues(t);
					
				}
			}
		
		}
		
		
	}
	
}

