//exercise 6.1

/* Constraints
1- Rearranges the array IN PLACE considering a given pivot (elemento of index i in the array)
2- Array fits in memory? yes
3- What this array should store? integers
4- O(n) Time Complexity
5- Not empty? */

/* Ideas
1- Iterate through the array and rearrange it using pointers to indicate where is the last element visited that is less than pivot, and where greater than starts
Space Complexity O(1)
Time Complexity O(n)*/

/*Code*/

public class Pivot{

	public static int[] rearrange(int[] array, int index){
		int n = array.length;
		int pivot = array[index];
		int lessEnd = 0;
		int greaterStart = n - 1;
		int i = 0;
		while (i<n){
			if(array[i]<pivot ){
				if(i > lessEnd){
					int temp = array[i];
					array[i] = array[lessEnd];
					array[lessEnd] = temp;
				}
				else
					i++;
				
				lessEnd++;

			}else{
				if(array[i]>pivot){
					if(i<greaterStart){
						int temp = array[i];
						array[i] = array[greaterStart];
						array[greaterStart] = temp;
					}
					else
						i++;
					
					greaterStart--;
				}
				else
					i++;
			}
		}
		return array;
	}

	public static void printArray(int[] array){
		int n = array.length;
		StringBuilder result = new StringBuilder();
		for(int i=0; i<n; i++){
			result.append(array[i]);
		}
		System.out.println(result.toString());
	}
	
	/*Test*/
	public static void main(String[] args){

		int[] array = {2,3,4,5,5,0,1,7,6,8,9};
		//int[] array = {2};

		int[] rearranged = Pivot.rearrange(array, 10);

		Pivot.printArray(rearranged);
	}
}