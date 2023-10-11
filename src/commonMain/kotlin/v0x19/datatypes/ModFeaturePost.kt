package v0x19.datatypes

import kotlinx.serialization.Serializable

@Serializable
data class ModFeaturePost(
    val id: Int,
    val mod_person_id: PersonId,
    val post_id: PostId,
    val featured: Boolean,
    val when_: String,
    val is_featured_community: Boolean,
)
