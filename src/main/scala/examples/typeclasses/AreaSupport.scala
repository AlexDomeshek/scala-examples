package examples.typeclasses

/**
  * Created by alex on 11/17/17.
  */
trait AreaSupport[A] {
    def calculateArea(shape: A): Float
}


