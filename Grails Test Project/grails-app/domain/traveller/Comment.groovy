package traveller

class Comment {
    Integer id
    Post post
    User owner
    String text

    static mapping = {
        table 'comments'
        version false
    }

    static constraints = {

    }
}
