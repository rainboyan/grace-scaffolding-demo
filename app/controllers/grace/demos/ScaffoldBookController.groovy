package grace.demos

import grails.rest.RestfulController

class ScaffoldBookController extends RestfulController<Book> {

    static scaffold = Book

    ScaffoldBookController(Class<Book> resource) {
        super(resource)
    }

    ScaffoldBookController(Class<Book> resource, boolean readOnly) {
        super(resource, readOnly)
    }
}