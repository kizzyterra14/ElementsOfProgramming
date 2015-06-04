/* exerecise 7.1 */

/* Constraits
1- Takes two linked lists. How big are it?
2- What kind of primitive type do the linked lists store?
3- O(1) space complexity */

/* Ideas
1- Compare first node of each linked list:
if the first node of the first linked list is less than the firs element of the second linked list: 
	temp =first1tNotVisited
	first1tNotVisited=first1NotVisited.next;
	temp.next = first2NotVisited and the first element of the first list is updated
If first2NotVisited > first1NotVisited:
	temp =first2NotVisited
	firsteNotVisited=first2NotVisited.next; 
	temp.next = first1NotVisited
We will do this until one of the lists has all elementes visited, then if the other list still have elements not visited: last1.next = first2  
*/

/* Code */

public class Merge{

	public static mergeLinkedLists(LinkedList<int> list1, LinkedList<int> list2){

		
	}
}