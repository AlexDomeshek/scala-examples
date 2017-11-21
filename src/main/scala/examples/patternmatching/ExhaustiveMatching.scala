package examples.patternmatching

/**
  * Created by alex on 11/15/17.
  */

//inheritance is allowed in the same file only
sealed trait Chemical

object Acid extends Chemical

object Base extends Chemical

object PatternMatching extends scala.App {


    Base.asInstanceOf[Chemical] match {
        case Acid => println("ACID")
    }
}