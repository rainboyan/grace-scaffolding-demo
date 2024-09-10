package grace.demos

interface CrudDataService<T> {

    T get(Serializable id)

    List<T> list(Map args)

    Long count()

    void delete(Serializable id)

    T save(User user)
}
