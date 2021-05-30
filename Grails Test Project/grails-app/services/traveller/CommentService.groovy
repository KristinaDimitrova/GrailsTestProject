package traveller

import grails.gorm.transactions.Transactional

@Transactional
class CommentService {

    def get(id) {
        Comment.get(id)
    }

    def list() {
        Comment.list()
    }

    def save(comment) {
        comment.save()
    }

    def delete(id) {
        Comment.get(id).delete()
    }
}
