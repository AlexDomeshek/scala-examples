package examples.caseclass

/**
  * Created by alex on 11/20/17.
  */

case class PersonScala(name: String, age: Int, maidenName: Option[String])


object Example extends App {
    def contact(p: PersonScala): Unit = {
        p match {
            case PersonScala(_, _, Some(maidenName)) =>
                println("The person has a maiden name: " + maidenName)
            case PersonScala(_, _, None) =>
        }
    }
}
