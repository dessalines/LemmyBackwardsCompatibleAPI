package v0x19.datatypes

import kotlinx.serialization.Serializable

@Serializable
data class ListCommentReports(
    val page: Int? = null,
    val limit: Int? = null,
    val unresolved_only: Boolean? = null,
    val community_id: CommunityId? = null,
)
