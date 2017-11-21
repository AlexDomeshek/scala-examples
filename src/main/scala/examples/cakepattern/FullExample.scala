package examples.cakepattern

case class User(fName: String, lName: String)


class FullApp {
    this: UserRepository =>

    def readUserName {
        println(this.getUser(43))

    }
}

object FullExample extends scala.App {

    (new FullApp with UserRepositoryTest).readUserName
    (new FullApp with UserRepositoryDB).readUserName
}
