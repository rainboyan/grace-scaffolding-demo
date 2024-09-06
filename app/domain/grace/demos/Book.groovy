package grace.demos

import grails.rest.*

@Resource(uri='/books', formats = ['html', 'json'], superClass=ScaffoldBookController)
class Book {

    String title

    static constraints = {
    }
}
