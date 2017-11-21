package examples.companionobject

/**
  * Created by alex on 11/20/17.
  */
case class Pizza(taste: String)


object Pizza {
    def apply(): Pizza = {
        Pizza("sour")
    }
}


object CompanionObjectExample extends App {
    Pizza("sour")
}