package gettersandsetters


class RegisterUser {

    // Si -> User
    // No -> Null

    fun invoke(user: User): User? {
        return if (user.isValid) {
            user
        } else {
            null
        }
    }
}