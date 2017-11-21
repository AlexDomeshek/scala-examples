package examples.patternmatching

/**
  * Created by alex on 11/15/17.
  */

case class Person(fname: String, age: Int, sex: String)

object GuardsApp extends scala.App {
    def analyzePerson(p: Person) {
        p match {
            case Person(name, age, "m") if age > 14 && age < 18 =>
                println(name + " is Mal'shab 4 kravi")
            case _ =>
                println("Not Mal'shab 4 kravi")
        }
    }

    analyzePerson(Person("Moshe", 20, "m"))
    analyzePerson(Person("Shmulik", 17, "m"))

}


