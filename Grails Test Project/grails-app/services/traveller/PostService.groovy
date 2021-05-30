package traveller

import grails.gorm.transactions.Transactional

@Transactional
class PostService {

    def get(id) {
        Post.get(id)
    }

    def list() {
        Post.list()
    }

    def save(post) {
        post.save()
    }

    def delete(id) {
        Post.get(id).delete()
    }
}
