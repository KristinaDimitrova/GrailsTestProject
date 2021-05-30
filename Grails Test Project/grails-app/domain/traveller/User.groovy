package traveller



class User {

    Integer id
    String firstName
    String lastName
    String username
    String password
    String repeatPassword
    String email
    static hasMany = [posts : Post]
    static transients = ['repeatPassword']

    static mapping = {
        table 'users'
        version false
    }

    static constraints = {
        firstName  blank: false, unique: false, null : false
        lastName  blank: false, unique: false, null : false
        username blank: false, unique: true, null : false
        password size: 5..10, blank: false, null : false, password : false
        email email: true, blank: false, unique: true, null : false
    }

}
