package grace.demos

import grails.rest.RestfulController

class UserController extends SubclassRestfulController<User> {

    static scaffold = User

    UserController() {
        super(User)
    }

}
