package DenizCollection;

public class IterateOverCollectionPractice {
	/*
	Collection<Integer> c = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,9));//Accepts any collection type
	
	//====>>>>>you cannot use  a for each loop to remove or update an item!!!!!!!!!!!!!!!
			
			
//			for(Integer each : c) {
//				c.remove(each);
//			} //==>> GIVES EXCEPTION
			
	//==>>ITERATOR is an interface,it has 3 methods
	//Iterator<Integer> myIter = nums.iterator(); 
	//==>> nums.iterator();
	//Itearator has 3 methods 
	// -hasnext() >>boolean
	// -next()
	// -remove()>>>void		
			
	//==>> iterator() method  returns an Iterator 		
			  Iterator<Integer> iter = c.iterator();
			  
	///////==============ITERATOR METHODS=============///////////

	//[2, 3, 4, 5, 6, 7, 8, 9]
			  
	//==>>  hasNext() returns  boolean
			  System.out.println(iter.hasNext()); //true
			  
			

	//==>>next()
			  System.out.println(iter.next());//2
			  System.out.println(iter.next());//3
			  System.out.println(iter.next());//4
			  System.out.println(iter.next());//5
			  
	//[2, 3, 4, 5, 6, 7, 8, 9]		  
	//==>>remove()	
			  iter.remove();
			  System.out.println(c);//[2, 3, 4, 6, 7, 8, 9]=>5 is removed WHY??
//			  iter.remove();
//			  System.out.println(c); => EXCEPTION we currently deleted 5
			  iter.next();//to avoid exception
			  iter.remove();
			  System.out.println(c);//[2, 3, 4, 7, 8, 9]
			  //as long as I have a next item I can loop over  and remove next item
			  
			  while (iter.hasNext()) {
				 //iter.remove();//==>> exception same issue above
				  Integer each = iter.next();
				 if(each>5)
					 iter.remove();
				
			  }
			  System.out.println(iter.hasNext());//false???? beacouse there is no more item 
			  System.out.println(c);//[2, 3, 4]
			  
			  //WHY????
			  System.out.println(iter);//java.util.ArrayList$Itr@65ae6ba4
			  //iterator is just a tool, helper not hold your  actual object
			  */

}
