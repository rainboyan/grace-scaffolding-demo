package grace.demos

import grails.rest.RestfulController

abstract class ScaffoldRestfulController<T> extends RestfulController<T> {

    CrudDataService<T> crudDataService

    ScaffoldRestfulController(Class<T> domainClass, CrudDataService<T> crudDataService) {
        this(domainClass, false, crudDataService)
    }

    ScaffoldRestfulController(Class<T> domainClass, boolean readOnly, CrudDataService<T> crudDataService) {
        super(domainClass, readOnly)
        this.crudDataService = crudDataService
    }

    @Override
    protected T queryForResource(Serializable id) {
        return this.crudDataService.get(id)
    }

    @Override
    protected Integer countResources() {
        return this.crudDataService.count()
    }

    @Override
    protected T saveResource(T resource) {
        return this.crudDataService.save(resource)
    }

    @Override
    protected void deleteResource(T resource) {
        this.crudDataService.delete(resource?.id as Serializable)
    }

}