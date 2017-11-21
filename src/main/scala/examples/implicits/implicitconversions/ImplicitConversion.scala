package examples.implicits.implicitconversions

/**
  * Created by alex on 11/17/17.
  */
object ImplicitConversion extends scala.App {


    def speak(msg: String) {
        println(msg)
    }

    implicit def int2str(arg: Int) = arg.toString

    speak(7)

//    speak(int2str(7))

}
