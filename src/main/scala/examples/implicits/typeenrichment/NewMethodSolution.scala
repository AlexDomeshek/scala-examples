package examples.implicits.typeenrichment

/**
  * Created by alex on 11/17/17.
  */

class TalkativeInt(x: Int) {
    def speak() {
        for (i <- 0 to x)
            println("Hi")
    }
}


object NewMethodSolution extends scala.App {

    implicit def int2talkativeInt(x: Int) = new TalkativeInt(x)

    5.speak()

}
