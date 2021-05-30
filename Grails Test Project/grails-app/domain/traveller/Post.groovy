package traveller

import java.time.LocalDateTime

class Post {
    Integer id
    User owner
    LocalDateTime createdAt
    static hasMany = [images : Image]

    static mapping = {
        table 'posts'
        version false
    }

    static constraints = {
        owner null:false

    }
}
