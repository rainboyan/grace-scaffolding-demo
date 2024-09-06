package grace.demos

import org.springframework.beans.factory.annotation.Autowired

import org.grails.datastore.mapping.core.Datastore

abstract class CrudDataService<T> {


    T getId(Long id) {
        return null
    }
}
