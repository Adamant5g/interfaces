package data

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int?, // Nullable, может отсутствовать
    val date: Int,
    val text: String,
    val replyOwnerId: Int?, // Nullable
    val replyPostId: Int?, // Nullable
    val friendsOnly: Boolean,
    val comments: Comments,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views?, // Nullable
    val postType: String,
    val postSource: PostSource?, // Nullable
    val geo: Geo?, // Nullable
    val signerId: Int?, // Nullable
    val copyHistory: List<Post>?, // Nullable
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut?, // Nullable
    val postponedId: Int?, // Nullable
    val attachments: Array<Attachment>? // Массив вложений
)


// Класс для комментариев
data class Comments(
    val count: Int, // Количество комментариев
    val canPost: Boolean, // Можно ли комментировать
    val groupsCanPost: Boolean, // Могут ли группы комментировать
    val canClose: Boolean, // Можно ли закрыть комментарии
    val canOpen: Boolean // Можно ли открыть комментарии
)

// Класс для лайков
data class Likes(
    val count: Int, // Количество лайков
    val userLikes: Boolean, // Лайкнул ли текущий пользователь
    val canLike: Boolean, // Можно ли ставить лайк
    val canPublish: Boolean // Можно ли сделать репост
)

// Класс для репостов
data class Reposts(
    val count: Int, // Число пользователей, скопировавших запись
    val userReposted: Boolean // Наличие репоста от текущего пользователя
)

// Класс для просмотров
data class Views(
    val count: Int // Число просмотров записи
)

// Класс для геолокации
data class Geo(
    val type: String, // Тип места
    val coordinates: String, // Координаты места
    val place: Place // Описание места
)

// Класс для описания места
data class Place(
    val id: Int, // Идентификатор места
    val title: String, // Название места
    val latitude: Double, // Широта
    val longitude: Double, // Долгота
    val created: Int, // Время создания места в формате unixtime
    val icon: String, // Ссылка на иконку места
    val checkins: Int, // Число чекинов
    val updated: Int, // Время последнего обновления места в формате unixtime
    val type: Int, // Тип места
    val country: Int, // Идентификатор страны
    val city: Int, // Идентификатор города
    val address: String // Адрес
)

// Класс для информации VK Donut
data class Donut(
    val isDonut: Boolean, // Запись доступна только платным подписчикам VK Donut
    val paidDuration: Int, // Время доступности только для платных подписчиков
    val canPublishFreeCopy: Boolean, // Можно ли открыть запись для всех пользователей
    val editMode: String // Информация о возможных изменениях VK Donut в записи
)
// Класс для источника записи
data class PostSource(
    val type: String, // Тип источника
    val platform: String, // Платформа
    val data: String, // Дополнительные данные
    val url: String // Ссылка на источник
)

data class Video(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val duration: Int
)

data class Photo(
    val id: Int,
    val ownerId: Int,
    val photo130: String,
    val photo604: String
)