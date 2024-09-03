package grace.demos

import grails.rest.*

// @Resource(uri='/books', readOnly=true)
class Book {

    String title

    static constraints = {
    }
}
