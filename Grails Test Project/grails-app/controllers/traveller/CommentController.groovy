package traveller

import grails.converters.JSON

class CommentController {

   CommentService commentService

    def index() {
        def list = commentService.list()
        respond list
    }

    def show(Long id) {
        def user = commentService.get(id)
        render user as JSON
    }

    def create() {
        respond new Comment(params)
    }

    def save(Comment comment) {
        commentService.save(comment)
        redirect action:"index", method:"GET"
    }
}
