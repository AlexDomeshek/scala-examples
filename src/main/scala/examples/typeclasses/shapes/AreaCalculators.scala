package examples.typeclasses.shapes

import examples.typeclasses.AreaSupport

/**
  * Created by alex on 11/17/17.
  */
object AreaCalculators {
    implicit object SquareAreaCalculator extends AreaSupport[Square] {
        override def calculateArea(shape: Square): Float = shape.side * shape.side
    }


    implicit object CircleAreaCalculator extends AreaSupport[Circle] {
        override def calculateArea(shape: Circle): Float = 2f * (shape.radius * 3.14f)
    }
}
