package traveller

import grails.converters.JSON

class ImageController {

    ImageService imageService

    def index() {
        def list = imageService.list()
        respond list
    }

    def show(Long id) {
        def user = imageService.get(id)
        render user as JSON
    }

    def create() {
        respond new Image(params)
    }

    def save(Image image) {
        imageService.save(image)
        redirect action:"index", method:"GET"
    }
}
