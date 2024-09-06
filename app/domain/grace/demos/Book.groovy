package grace.demos

import grails.rest.*

@Resource(uri='/books', readOnly=true, superClass=SubclassRestfulController)
class Book {

    String title

    static constraints = {
    }
}
