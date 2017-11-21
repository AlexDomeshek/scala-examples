package examples.implicits.implicitparameters

/**
  * Created by alex on 11/17/17.
  */
object ImplicitParameters extends App {
    def power(x: Int)(implicit y: Int) {
        println(Math.pow(x, y))
    }

    power(3)(2)
    power(4)(2)

    power(3)
    // error: could not find implicit value for parameter y:Int: Double

    implicit val z: Int = 2

    power(5)
    power(6)

    //    implicit val z2: Int = 11

    power(7)

}
