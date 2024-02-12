package data

sealed class Attachment {
    abstract val type: String
}

data class PhotoAttachment(
    val photo: Photo
) : Attachment() {
    override val type = "photo"
}

data class VideoAttachment(
    val video: Video
) : Attachment() {
    override val type = "video"
}