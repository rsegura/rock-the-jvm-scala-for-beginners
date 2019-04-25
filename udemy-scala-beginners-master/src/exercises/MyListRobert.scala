package exercises

abstract class MyListRobert {

  /*
     head = first element of  the  list
     tail = remainder of the list
     isEmpty = is this list empty
     add(int) => new list with this element added
     toString => a string representation of the list
   */

  def head : Int
  def tail : MyListRobert
  def isEmpty: Boolean
  def add(element: Int): MyListRobert
  def printElements: String
  // polymorphic call
  override def toString: String = "[" + printElements + "]"


}

/*object Empty extends MyListRobert{
  def head : Int = throw new NoSuchElementException
  def tail : MyListRobert = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(element: Int): MyListRobert = ???
  def printElements: String = ""
}*/

class ConsRobert(h: Int, t: MyListRobert) extends MyListRobert{
  def head: Int = h
  def tail : MyListRobert = t
  def isEmpty: Boolean = false
  def add(element: Int) : MyListRobert = new ConsRobert(element, this)
  def printElements: String =
    if(t.isEmpty) "" + h
    else h + " " + t.printElements
}
