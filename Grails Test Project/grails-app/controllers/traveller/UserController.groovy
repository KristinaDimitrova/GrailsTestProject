package traveller

import grails.converters.JSON

class UserController {

    UserService userService

    def index() {
        def list = userService.list()
        respond list
    }

    def show(Long id) {
        def user = userService.get(id)
        render user as JSON
    }

    def create() {
        respond new User(params)
    }

    def save(User user) {
        userService.save(user)
        redirect action:"index", method:"GET"
    }
}
