import java.util.LinkedList;

public class StackMaxOperation{

	private LinkedList<Integer> stack;
	private int size = 0;

	public StackMaxOperation(){
		stack = new LinkedList<Integer>();

	}

	public Integer pop(){
		size--;
		return stack.remove();
	}

	public void push(Integer element){
		size++;
		stack.addFirst(element);

	}

	public Integer size(){
		return size;
	}

	public void maxValue(){

		if(size == 0){
			System.out.println("Empty Satck");
		}
		else{
			Integer[] elements = new Integer[size];

			Integer maxValue = pop();
			elements[0] = maxValue;
			int i = 1;
			while(size > 0){

				int element = pop();
				elements[i] = element;

				if(element > maxValue){
					maxValue = element;
				}
				i++;

			}
			//Reconstructing the stack
			while(size < elements.length){
				push(elements[size]);
			}
			System.out.println("Max value: " + maxValue);
		}
		

	}

	public static void main(String args[]){

		StackMaxOperation testing = new StackMaxOperation();

		testing.maxValue();

		testing.push(new Integer(1));
		testing.maxValue();

		testing.pop();
		testing.push(new Integer(3));
		testing.push(new Integer(4));
		testing.maxValue();

		testing.pop();
		testing.pop();
		testing.push(new Integer(1));
		testing.push(new Integer(2));
		testing.push(new Integer(3));
		testing.push(new Integer(4));
		testing.push(new Integer(5));
		testing.push(new Integer(6));
		testing.push(new Integer(7));
		testing.maxValue();

		testing.pop();
		testing.pop();
		testing.pop();
		testing.pop();
		testing.pop();
		testing.pop();
		testing.pop();
		testing.push(new Integer(7));
		testing.push(new Integer(6));
		testing.push(new Integer(5));
		testing.push(new Integer(4));
		testing.push(new Integer(3));
		testing.push(new Integer(2));
		testing.push(new Integer(1));
		testing.maxValue();

	}

	
}