package examples.cakepattern

trait UserRepository {
    def getUser(id: Int): User
}

trait UserRepositoryDB extends UserRepository {
    def getUser(id: Int) = {
        // read form DB
        User("Martin", "Odersky")
    }
}


trait UserRepositoryTest extends UserRepository {

    def getUser(id: Int) = {
        // Mock user the way you want
        User("Test", "User")
    }
}