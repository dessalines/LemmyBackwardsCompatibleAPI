package v0x19.datatypes

import dto.SortType
import kotlinx.serialization.Serializable

@Serializable
data class LocalUser(
    val id: LocalUserId,
    val person_id: PersonId,
    val email: String? = null,
    val show_nsfw: Boolean,
    val theme: String,
    val default_sort_type: SortType /* "Active" | "Hot" | "New" | "Old" | "TopDay" | "TopWeek" | "TopMonth" | "TopYear" | "TopAll" | "MostComments" | "NewComments" | "TopHour" | "TopSixHour" | "TopTwelveHour" | "TopThreeMonths" | "TopSixMonths" | "TopNineMonths" | "Controversial" | "Scaled" */,
    val default_listing_type: String /* "All" | "Local" | "Subscribed" | "ModeratorView" */,
    val interface_language: String,
    val show_avatars: Boolean,
    val send_notifications_to_email: Boolean,
    val validator_time: String,
    val show_scores: Boolean,
    val show_bot_accounts: Boolean,
    val show_read_posts: Boolean,
    val show_new_post_notifs: Boolean,
    val email_verified: Boolean,
    val accepted_application: Boolean,
    val open_links_in_new_tab: Boolean,
    val blur_nsfw: Boolean,
    val auto_expand: Boolean,
    val infinite_scroll_enabled: Boolean,
    val admin: Boolean,
    val post_listing_mode: String /* "List" | "Card" | "SmallCard" */,
    val totp_2fa_enabled: Boolean,
)
