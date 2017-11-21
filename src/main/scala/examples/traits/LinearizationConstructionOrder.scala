package examples.traits

/**
  * Created by alex on 11/20/17.
  */

trait A { println("trait A is constructed") }
trait B { println("trait B is constructed") }
trait C { println("trait C is constructed") }


class D extends A with B with C {
    println("class D is constructed")
}

object Linearization extends App{

    val d = new D


}




