package lectures.part2oop

object OOBasicsRobert extends App {

  /*
  Novel and a Writer

  Writer: first name, surname, year
    - method fullname

  Novel: name, year of release, author
  - authorAge
  - isWrittenBy(author)
  - copy (new year of release) = new instance of Novel


 */

  val author = new Writer("Charles", "Dickens", 1812)

  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new CounterRob()

  counter.inc.print
  counter.inc(100).dec(20).print
  class Writer (firstName: String, surname: String, val year: Int){

    def fullName : String = firstName + " "+ surname
  }

  class Novel (name: String, year: Int, author: Writer) {

    def authorAge : Int = year - author.year

    def isWrittenBy(author: Writer) :Boolean = author == this.author

    def copy(newYear: Int): Novel = new Novel(name = name, author = author, year= newYear)
  }

}


/*
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an amount
 */

class CounterRob (val count: Int = 0){

  def print : Unit = println(count)

  def inc: CounterRob = {
    new CounterRob(count+1)
  }

  def dec: CounterRob = {
    new CounterRob(count - 1)
  }

  def inc(amount: Int): CounterRob = {
    if(amount <= 0) this
    else inc.inc(amount -1)
  }

  def dec(amount: Int): CounterRob = {
    if(amount <= 0) this
    else dec.dec(amount-1)
  }

}