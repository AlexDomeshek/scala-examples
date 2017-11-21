package examples.cakepattern

/**
  * Created by alex on 11/15/17.
  */

trait Base1 {
    def foo(): Unit = {
    }
}

class Derived1 {
    this: Base1 =>
    foo()
}


object App1 {
    new Derived1 with Base1
}
