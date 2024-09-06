package grace.demos

class UserController extends SubclassRestfulController<User> {

    static scaffold = User

    UserDataService userDataService

    UserController() {
        super(User, false)
    }

    @Override
    protected User createResource(Map params) {
        return new User(params)
    }

    @Override
    protected User createResource() {
        User user = new User()
        bindData user, getObjectToBind()
        user
    }

    @Override
    protected User queryForResource(Serializable id) {
        return this.userDataService.get(id)
    }

    @Override
    protected Integer countResources() {
        return this.userDataService.count()
    }

    @Override
    protected User saveResource(User resource) {
        return this.userDataService.save(resource)
    }

    @Override
    protected void deleteResource(User resource) {
        this.userDataService.delete(resource.id as Serializable)
    }
}
