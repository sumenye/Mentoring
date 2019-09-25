package DenizCollection;
import java.util.*;

public class Day3 {
	/*
     * Collection
     *  |
     * Set - HashSet
     *  |
     * SortedSet
     *  |
     * NavigableSet
     *  |
     * TreeSet == NOT AN INTERFACE, it is a class implements navigable interface
     */
    
    //===> SortedSet is a type which maintains uniquness along with sorted order of elements
    //So what is the difference between Set and SortedSet differenece???
    //Set has natural order, sorted set make item ordered       
    
    
/*==>>METHODS of SortedSet
*  first();
*  last();
*  
*/
    
    public static void main(String[] args) {

    
    Set<Integer> treeset1 = new TreeSet<>();
    Collection<Integer> treeset2 = new TreeSet<>();
    NavigableSet<Integer> treeset3 = new TreeSet<>();
    //HashSet<Integer> treeset4 = new TreeSet<>();
    
    SortedSet<Integer> treeset = new TreeSet<>();
    
    System.out.println("treeset.add(2) "+treeset.add(2));//true
    System.out.println("treeset.add(2) "+treeset.add(3));//true
    System.out.println("treeset.add(2) "+treeset.add(4));//true
    System.out.println("treeset.add(2) "+treeset.add(5));//true
    System.out.println("treeset.add(2) "+treeset.add(3));//==>>FALSE
    
    System.out.println(treeset);//[2, 3, 4, 5]//no duplication , sorted order
    
    
    
    
    
    
    
    
//==>first();    method
    //returns the lowest element it the list
    System.out.println(treeset.first()); //2
    //How does it works with Strings???
    //[Deniz, Murat, Burak]
    
    
    
    
    
    
    
    
    
//==>last(); method
    //returns the highest element it the list
    System.out.println(treeset.last());//5  
    
    
    
    
    
    
    
    
    //[2, 3, 4, 5]
//==>> addAll(Collection<>);
    SortedSet<Integer> treesetextra = new TreeSet<>();
    treesetextra.add(4);
    treeset.addAll(treesetextra);
    
    treeset.addAll(Arrays.asList(6,7,6,7));
    System.out.println(treeset);//[2, 3, 4, 5, 6, 7] sorted and no duplications in the list
    
    
    //-------------------- VIEW OF SET -----------------------//
    /*  >>in order to get view of elements
     *  VIEW OF SET
     *  view in not a new object 
     *  View is part of your original list not a new object
     *  Whatever modification you do in a view set will affect your original list ,as well!! 
     *  
     *  subSet(E fromElement, E toElement);
     *  headSet(E toElement);
     *  tailSet(E fromElement);
     *  
     */ 

    //[2, 3, 4, 5, 6, 7]
//subSet(E fromElement, E toElement);
    SortedSet<Integer> subset1 =treeset.subSet(3, 5); //3 and 5 is not index first inclusive, second exclusive
    
    //TreeSet<Integer> subset2 =treeset.subSet(3, 5); //Yes or No WHY???
    
    System.out.println(subset1);//[3, 4]
    subset1.remove(3);
    System.out.println(subset1);//[4]==>3 is removed
    System.out.println(treeset);//is 3 still here??? [2, 4, 5, 6, 7] original set is alsi affected
    
    
    
    
    
    
    
//==>>headSet(E toElement);
    //[2, 4, 5, 6, 7] current list  of treeset
    System.out.println(treeset.headSet(5)); //included or excluded till 5
                                            // head 5 is excluded
                                            //we do have 2,4 till 5
    
    
    
    
    
    
    
    
    
//==>> tailSet(E);
    System.out.println(treeset);//[2, 4, 5, 6, 7] current list
    System.out.println(treeset.tailSet(5));//5 is included or not? till where??
                                          // we do have 5,6,7 till END
    
    
    SortedSet <Integer> tailview = treeset.tailSet(5); //5, 6,7
    tailview.remove(5);//Does this affect the original treeset list
    //tailview==>>6,7
    System.out.println(treeset);//YES==>> [2, 4, 6, 7]
    
    
    
    
    
    
    
/* SO===>>> as a result!!!
* any view that you worked on closely linked to your original object
* View is part of your original list not a NEW object
* Whatever modification you do in a view list will affect your original list ,as well!!
* 
*/
    
    
//NULL IS NOT ALLOWED IN SORTED SET
    //treeset.add(null);
    //System.out.println(treeset);//java.lang.NullPointerException
    }

}
