import data.Post

// Объект для управления постами
object WallService {
    private var posts = mutableListOf<Post>()
    private var nextId = 1 // Счетчик идентификаторов постов

    fun addPost(post: Post): Post {
        val postWithId = post.copy(id = nextId++)
        posts.add(postWithId)
        return postWithId
    }

    fun updatePost(updatedPost: Post): Boolean {
        val postIndex = posts.indexOfFirst { it.id == updatedPost.id }
        if (postIndex >= 0) {
            posts[postIndex] = updatedPost
            return true
        }
        return false
    }

    fun clear() {
        posts.clear()
        nextId = 1
    }

    // Функция для получения списка всех постов (опционально)
    fun getPosts(): List<Post> = posts
}
