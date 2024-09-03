package grace.demos

class PostController extends SubclassRestfulController<Post> {

    static scaffold = Post // [domain: Post, baseClass: RestfulController]

    PostController() {
        super(Post)
    }

}
