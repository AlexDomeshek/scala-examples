package examples.implicits.typeenrichment

/**
  * Created by alex on 11/17/17.
  */

import example.implicits.typeenrichment.Implicits._


object Implicits {

    implicit class TalkativeInt(x: Int) {
        def speak() {
            for (i <- 0 to x)
                println("Hi")
        }
    }

}

object ImplicitClass extends scala.App {

//    type enrichment
    5.speak()

}
