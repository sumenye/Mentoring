package DenizCollection;

public class ListMethods {
	/*
	 * List<Double> l = new LinkedList<>(Arrays.asList(3d,4d,5d,6d,7d,8d,9d,10d));
		
		System.out.println(l);//[3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0]
		
///////////////==========LIST METHODS=========//////////////////////////
		
	/*
	 * List is the only interface that has index	

		
//==>> get(index)	
		System.out.println(l.get(0));//3.0

//add(obj)
//add(index) => returns boolean
		l.add(11d);
		System.out.println(l);//[3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0]
//add(index, obj) =>void
		l.add(0,6d);
		System.out.println(l);//[6.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0]
		

//set(index,obj) ==>updates an item at certain location
		l.set(0, 3.0);
		System.out.println(l);//[3.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0]
		
		
//indexOf(obj)	
		System.out.println(l.indexOf(4.0));//2
//lastIndexOf(obj)
		System.out.println(l.lastIndexOf(98d));// -1 item is not in the list
		
		
//remove(obj)
//remove(index)
		l.remove(7); //=>7th index removed
		System.out.println(l);//[3.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 10.0, 11.0]
		

//addAll(Collection<>)
//addAll(index, Collection<>)
		l.addAll(4,Arrays.asList(12d,13d));
		System.out.println(l);//[3.0, 3.0, 4.0, 5.0, 12.0, 13.0, 6.0, 7.0, 8.0, 10.0, 11.0]
		

//replaceAll(Function:unary operator)
		System.out.println("replace each item new value multipled by 2");
		l.replaceAll(each ->each*2);
		System.out.println(l);//[6.0, 6.0, 8.0, 10.0, 24.0, 26.0, 12.0, 14.0, 16.0, 20.0, 22.0]
		
//sort(Comparator<>) 
		//Comparator is an interface
		l.sort(Comparator.naturalOrder());//[6.0, 6.0, 8.0, 10.0, 12.0, 14.0, 16.0, 20.0, 22.0, 24.0, 26.0]
		System.out.println(l);
		l.sort(Comparator.reverseOrder());//[26.0, 24.0, 22.0, 20.0, 16.0, 14.0, 12.0, 10.0, 8.0, 6.0, 6.0]
		System.out.println(l);
		l.sort(Collections.reverseOrder());
		
//===============VIEW OF YOUR LIST=============///////
System.out.println("-----------");		
		//getting view out of List
		//View is part of original list, not a new object
		//Whatever you do with sublist will affect your original list as well!!!!!!

		
//[26.0, 24.0, 22.0, 20.0, 16.0, 14.0, 12.0, 10.0, 8.0, 6.0, 6.0]
//==>>l.subList(fromIndex, toIndex) >>>toIndex excluded
		System.out.println(l.subList(2, 9));//[22.0, 20.0, 16.0, 14.0, 12.0, 10.0, 8.0]
		
		List<Double> sublist = l.subList(3, 7);
		System.out.println(sublist);//[20.0, 16.0, 14.0, 12.0]
		sublist.set(0, 100d);
		System.out.println(sublist);//[100.0, 16.0, 14.0, 12.0] new sublist
		System.out.println(l);//[26.0, 24.0, 22.0, 100.0, 16.0, 14.0, 12.0, 10.0, 8.0, 6.0, 6.0]

 //////////===========LIST ITERATOR=========////////
//==>>l.listIterator()
		//l.iterator()
		 ListIterator<Double> iter = l.listIterator();
		
		 
//==>>hasNext()		
		 System.out.println(iter.hasNext());//true
		
		 
//==>>nextIndex() exclusively for List		 
		 System.out.println(iter.nextIndex());//0
		
		 //for each loop also works if you dont update or remove items
		 while(iter.hasNext()) {
			 Double each = iter.next();
			 System.out.print(each);//26.0 24.0 22.0 100.0 16.0 14.0 12.0 10.0 8.0 6.0 6.0
		  
			 if(each>10) {
				 iter.remove();
			 }
		 }
		 System.out.print(l);//[10.0, 8.0, 6.0, 6.0]
		 System.out.println(iter.hasNext());//false =>> no more item

		 
//==>>hasPrevious() boolean
		 System.out.println(iter.hasPrevious());//true
		
//==>>previous()		 
		System.out.println(iter.previous()); //6.0
			
//==>>previousIndex()		
		System.out.println(iter.previousIndex());//2
		
		//[10.0, 8.0, 6.0, 6.0]
		while(iter.hasPrevious()) {
			 Double each = iter.previous();
			 System.out.print(each+" ");//6.0 8.0 10.0 
			//you can remove items in this loop too
			 
			 
			 if(each==6.0) {
				 iter.remove();
//==>>set(obj)   
				 iter.set(100d);
				 
//==>>add(obj)				
				 iter.add(10000d);
			 } 
			 
		}
		 System.out.println(l);

*/

}
