package grace.demos

class UserController extends ScaffoldRestfulController<User> {

    static scaffold = User

    UserDataService userDataService

    UserController() {
        super(User, userDataService)
    }

}
