package traveller

import grails.gorm.transactions.Transactional

@Transactional
class ImageService {

    def get(id) {
        Image.get(id)
    }

    def list() {
        Image.list()
    }

    def save(image) {
        image.save()
    }

    def delete(id) {
        Image.get(id).delete()
    }
}
