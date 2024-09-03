package grace.demos

import grails.rest.RestfulController

class UserController extends RestfulController<User> {

    static scaffold = User

    UserController() {
        super(User)
    }

}
