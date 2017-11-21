package examples.typeclasses

import examples.typeclasses.shapes.{Circle, Square}

/**
  * Created by alex on 11/17/17.
  */
class TypeClassExample2 extends App {
    val square = new Square(5)
    val circle = new Circle(5)

    GeometryUtils.calculateArea(square)
    GeometryUtils.calculateArea(circle)
}
