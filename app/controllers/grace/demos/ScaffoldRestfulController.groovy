package grace.demos

import grails.rest.RestfulController

class ScaffoldRestfulController<T> extends RestfulController<T> {

    ScaffoldRestfulController(Class<T> domainClass) {
        this(domainClass, false)
    }

    ScaffoldRestfulController(Class<T> domainClass, boolean readOnly) {
        super(domainClass, readOnly)
    }

}