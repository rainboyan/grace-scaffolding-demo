package grace.demos

import grails.gorm.services.Service

@Service(User)
interface UserDataService extends CrudDataService<User> {

    User get(Serializable id)

    List<User> list(Map args)

    Long count()

    void delete(Serializable id)

    User save(User user)

}