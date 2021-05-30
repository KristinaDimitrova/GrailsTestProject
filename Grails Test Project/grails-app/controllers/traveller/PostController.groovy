package traveller

import grails.converters.JSON

class PostController {

    def postService

    def index() {
        def list = postService.list()
        respond list
    }

    def show(Long id) {
        def post = postService.get(id)
        render post as JSON
    }

    def create() {
        respond new User(params)
    }

    def save(Post post) {
        postService.save(post)
        redirect action:"index", method:"GET"
    }
}
