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

data class AudioAttachment(
    val audio: Audio
) : Attachment() {
    override val type = "audio"
}

data class DocumentAttachment(
    val document: Document
) : Attachment() {
    override val type = "document"
}

data class LinkAttachment(
    val link: Link
) : Attachment() {
    override val type = "link"
}

