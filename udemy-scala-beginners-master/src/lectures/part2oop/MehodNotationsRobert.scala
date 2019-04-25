package lectures.part2oop

object MehodNotationsRobert  extends App {


  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickName : String): Person = new Person(s"${this.name} (${nickName})", this.favoriteMovie)
    def unary_+ : Person = new Person(this.name, this.favoriteMovie, this.age+1)
    def unary_! : String = s"$name, what the heck?!"
    def isAlive: Boolean = true
    def learns(things: String): String = s"${this.name} learns ${things}"
    def learnsScala: String = this learns "scala"
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
    def apply(n: Int): String = s"${name} watched ${favoriteMovie} ${n} times"
  }

  val mary = new Person("Mary", "Inception")

  println((mary + "the Rockstar").apply())
  println((+mary).age)
  println(mary learnsScala)
  println(mary(10))

  /*
    1.  Overload the + operator
        mary + "the rockstar" => new person "Mary (the rockstar)"

    2.  Add an age to the Person class
        Add a unary + operator => new person with the age + 1
        +mary => mary with the age incrementer

    3.  Add a "learns" method in the Person class => "Mary learns Scala"
        Add a learnsScala method, calls learns method with "Scala".
        Use it in postfix notation.

    4.  Overload the apply method
        mary.apply(2) => "Mary watched Inception 2 times"
   */




}
