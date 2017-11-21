package examples.typeclasses

import example.typeclasses.shapes.{Circle, Square}
import example.typeclasses.shapes.AreaCalculators._

/**
  * Created by alex on 11/17/17.
  */
object TypeClassExample1 extends App{
    val square = new Square(5)
    val circle = new Circle(5)

    GeometryUtils.calculateArea(square)(SquareAreaCalculator)
    GeometryUtils.calculateArea(circle)(CircleAreaCalculator)
}
