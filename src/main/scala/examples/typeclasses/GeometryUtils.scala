package examples.typeclasses

/**
  * Created by alex on 11/17/17.
  */
object GeometryUtils {
    def calculateArea[A](shape: A)(implicit calculator: AreaSupport[A]) = {
        calculator.calculateArea(shape)
    }
}
