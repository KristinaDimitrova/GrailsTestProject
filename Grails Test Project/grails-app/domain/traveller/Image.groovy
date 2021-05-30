package traveller

class Image {

    Integer id
    Post post
    String url

    static mapping = {
        table 'images'
        version false
    }

    static constraints = {
    }
}
