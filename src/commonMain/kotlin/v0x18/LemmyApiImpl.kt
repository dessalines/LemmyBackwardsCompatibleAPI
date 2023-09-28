package v0x18

import getKtor
import io.ktor.client.*
import utils.getResult
import utils.postResult
import utils.putResult
import v0x18.datatypes.*

class LemmyApiImpl(private val Ktor: HttpClient) : LemmyApi {

    /**
     * Gets the site, and your user data.
     *
     * @GET("site")
     */
    override suspend fun getSite(form: GetSite): Result<GetSiteResponse> =
        Ktor.getResult("site", form)

    /**
     * Create your site.
     *
     * @POST("site")
     */
    override suspend fun createSite(form: CreateSite): Result<SiteResponse> =
        Ktor.postResult("site", form)

    /**
     * Edit your site.
     *
     * @PUT("site")
     */
    override suspend fun editSite(form: EditSite): Result<SiteResponse> =
        Ktor.putResult("site", form)

    /**
     * Get the modlog.
     *
     * @GET("modlog")
     */
    override suspend fun getModlog(form: GetModlog): Result<GetModlogResponse> =
        Ktor.getResult("modlog", form)

    /**
     * Search lemmy.
     *
     * @GET("search")
     */
    override suspend fun search(form: Search): Result<SearchResponse> =
        Ktor.getResult("search", form)

    /**
     * Fetch a non-local / federated object.
     *
     * @GET("resolve_object")
     */
    override suspend fun resolveObject(form: ResolveObject): Result<ResolveObjectResponse> =
        Ktor.getResult("resolve_object", form)

    /**
     * Get / fetch a community.
     *
     * @GET("community")
     */
    override suspend fun getCommunity(form: GetCommunity): Result<GetCommunityResponse> =
        Ktor.getResult("community", form)

    /**
     * Create a new community.
     *
     * @POST("community")
     */
    override suspend fun createCommunity(form: CreateCommunity): Result<CommunityResponse> =
        Ktor.postResult("community", form)

    /**
     * Edit a community.
     *
     * @PUT("community")
     */
    override suspend fun editCommunity(form: EditCommunity): Result<CommunityResponse> =
        Ktor.putResult("community", form)

    /**
     * [MANUAL] Hide a community from the feed
     *
     * @PUT("community/hide")
     */
    override suspend fun hideCommunity(form: HideCommunity): Result<CommunityResponse> =
        Ktor.putResult("community/hide", form)

    /**
     * List communities, with various filters.
     *
     * @GET("community/list")
     */
    override suspend fun listCommunities(form: ListCommunities): Result<ListCommunitiesResponse> =
        Ktor.getResult("community/list", form)

    /**
     * Follow / subscribe to a community.
     *
     * @POST("community/follow")
     */
    override suspend fun followCommunity(form: FollowCommunity): Result<CommunityResponse> =
        Ktor.postResult("community/follow", form)

    /**
     * Block a community.
     *
     * @POST("community/block")
     */
    override suspend fun blockCommunity(form: BlockCommunity): Result<BlockCommunityResponse> =
        Ktor.postResult("community/block", form)

    /**
     * Delete a community.
     *
     * @POST("community/delete")
     */
    override suspend fun deleteCommunity(form: DeleteCommunity): Result<CommunityResponse> =
        Ktor.postResult("community/delete", form)

    /**
     * A moderator remove for a community.
     *
     * @POST("community/remove")
     */
    override suspend fun removeCommunity(form: RemoveCommunity): Result<CommunityResponse> =
        Ktor.postResult("community/remove", form)

    /**
     * Transfer your community to an existing moderator.
     *
     * @POST("community/transfer")
     */
    override suspend fun transferCommunity(form: TransferCommunity): Result<CommunityResponse> =
        Ktor.postResult("community/transfer", form)

    /**
     * Ban a user from a community.
     *
     * @POST("community/ban_user")
     */
    override suspend fun banFromCommunity(form: BanFromCommunity): Result<BanFromCommunityResponse> =
        Ktor.postResult("community/ban_user", form)

    /**
     * Add a moderator to your community.
     *
     * @POST("community/mod")
     */
    override suspend fun addModToCommunity(form: AddModToCommunity): Result<AddModToCommunityResponse> =
        Ktor.postResult("community/mod", form)

    /**
     * Fetch federated instances.
     *
     * @GET("federated_instances")
     */
    override suspend fun getFederatedInstances(form: GetFederatedInstances): Result<GetFederatedInstancesResponse> =
        Ktor.getResult("federated_instances", form)

    /**
     * Get / fetch a post.
     *
     * @GET("post")
     */
    override suspend fun getPost(form: GetPost): Result<GetPostResponse> =
        Ktor.getResult("post", form)

    /**
     * Edit a post.
     *
     * @PUT("post")
     */
    override suspend fun editPost(form: EditPost): Result<PostResponse> =
        Ktor.putResult("post", form)

    /**
     * Create a post.
     *
     * @POST("post")
     */
    override suspend fun createPost(form: CreatePost): Result<PostResponse> =
        Ktor.postResult("post", form)

    /**
     * Get / fetch posts, with various filters.
     *
     * @GET("post/list")
     */
    override suspend fun getPosts(form: GetPosts): Result<GetPostsResponse> =
        Ktor.getResult("post/list", form)

    /**
     * Delete a post.
     *
     * @POST("post/delete")
     */
    override suspend fun deletePost(form: DeletePost): Result<PostResponse> =
        Ktor.postResult("post/delete", form)

    /**
     * A moderator remove for a post.
     *
     * @POST("post/remove")
     */
    override suspend fun removePost(form: RemovePost): Result<PostResponse> =
        Ktor.postResult("post/remove", form)

    /**
     * Mark a post as read.
     *
     * @POST("post/mark_as_read")
     */
    override suspend fun markPostAsRead(form: MarkPostAsRead): Result<PostResponse> =
        Ktor.postResult("post/mark_as_read", form)

    /**
     * A moderator can lock a post ( IE disable new comments ).
     *
     * @POST("post/lock")
     */
    override suspend fun lockPost(form: LockPost): Result<PostResponse> =
        Ktor.postResult("post/lock", form)

    /**
     * A moderator can feature a community post ( IE stick it to the top of a community ).
     *
     * @POST("post/feature")
     */
    override suspend fun featurePost(form: FeaturePost): Result<PostResponse> =
        Ktor.postResult("post/feature", form)

    /**
     * Like / vote on a post.
     *
     * @POST("post/like")
     */
    override suspend fun createPostLike(form: CreatePostLike): Result<PostResponse> =
        Ktor.postResult("post/like", form)

    /**
     * Save a post.
     *
     * @PUT("post/save")
     */
    override suspend fun savePost(form: SavePost): Result<PostResponse> =
        Ktor.putResult("post/save", form)

    /**
     * Report a post.
     *
     * @POST("post/report")
     */
    override suspend fun createPostReport(form: CreatePostReport): Result<PostReportResponse> =
        Ktor.postResult("post/report", form)

    /**
     * Resolve a post report. Only a mod can do this.
     *
     * @PUT("post/report/resolve")
     */
    override suspend fun resolvePostReport(form: ResolvePostReport): Result<PostReportResponse> =
        Ktor.putResult("post/report/resolve", form)

    /**
     * List post reports.
     *
     * @GET("post/report/list")
     */
    override suspend fun listPostReports(form: ListPostReports): Result<ListPostReportsResponse> =
        Ktor.getResult("post/report/list", form)

    /**
     * Fetch metadata for any given site.
     *
     * @GET("post/site_metadata")
     */
    override suspend fun getSiteMetadata(form: GetSiteMetadata): Result<GetSiteMetadataResponse> =
        Ktor.getResult("post/site_metadata", form)

    /**
     * Get / fetch comment.
     *
     * @GET("comment")
     */
    override suspend fun getComment(form: GetComment): Result<CommentResponse> =
        Ktor.getResult("comment", form)

    /**
     * Create a comment.
     *
     * @POST("comment")
     */
    override suspend fun createComment(form: CreateComment): Result<CommentResponse> =
        Ktor.postResult("comment", form)

    /**
     * Edit a comment.
     *
     * @PUT("comment")
     */
    override suspend fun editComment(form: EditComment): Result<CommentResponse> =
        Ktor.putResult("comment", form)

    /**
     * Get / fetch comments.
     *
     * @GET("comment/list")
     */
    override suspend fun getComments(form: GetComments): Result<GetCommentsResponse> =
        Ktor.getResult("comment/list", form)

    /**
     * Delete a comment.
     *
     * @POST("comment/delete")
     */
    override suspend fun deleteComment(form: DeleteComment): Result<CommentResponse> =
        Ktor.postResult("comment/delete", form)

    /**
     * A moderator remove for a comment.
     *
     * @POST("comment/remove")
     */
    override suspend fun removeComment(form: RemoveComment): Result<CommentResponse> =
        Ktor.postResult("comment/remove", form)

    /**
     * Mark a comment as read.
     *
     * @POST("comment/mark_as_read")
     */
    override suspend fun markCommentReplyAsRead(form: MarkCommentReplyAsRead): Result<CommentReplyResponse> =
        Ktor.postResult("comment/mark_as_read", form)

    /**
     * Distinguishes a comment (speak as moderator)
     *
     * @POST("comment/distinguish")
     */
    override suspend fun distinguishComment(form: DistinguishComment): Result<CommentResponse> =
        Ktor.postResult("comment/distinguish", form)

    /**
     * Like / vote on a comment.
     *
     * @POST("comment/like")
     */
    override suspend fun createCommentLike(form: CreateCommentLike): Result<CommentResponse> =
        Ktor.postResult("comment/like", form)

    /**
     * Save a comment.
     *
     * @PUT("comment/save")
     */
    override suspend fun saveComment(form: SaveComment): Result<CommentResponse> =
        Ktor.putResult("comment/save", form)

    /**
     * Report a comment.
     *
     * @POST("comment/report")
     */
    override suspend fun createCommentReport(form: CreateCommentReport): Result<CommentReportResponse> =
        Ktor.postResult("comment/report", form)

    /**
     * Resolve a comment report. Only a mod can do this.
     *
     * @PUT("comment/report/resolve")
     */
    override suspend fun resolveCommentReport(form: ResolveCommentReport): Result<CommentReportResponse> =
        Ktor.putResult("comment/report/resolve", form)

    /**
     * List comment reports.
     *
     * @GET("comment/report/list")
     */
    override suspend fun listCommentReports(form: ListCommentReports): Result<ListCommentReportsResponse> =
        Ktor.getResult("comment/report/list", form)

    /**
     * Edit a private message.
     *
     * @PUT("private_message")
     */
    override suspend fun editPrivateMessage(form: EditPrivateMessage): Result<PrivateMessageResponse> =
        Ktor.putResult("private_message", form)

    /**
     * Create a private message.
     *
     * @POST("private_message")
     */
    override suspend fun createPrivateMessage(form: CreatePrivateMessage): Result<PrivateMessageResponse> =
        Ktor.postResult("private_message", form)

    /**
     * Get / fetch private messages.
     *
     * @GET("private_message/list")
     */
    override suspend fun getPrivateMessages(form: GetPrivateMessages): Result<PrivateMessagesResponse> =
        Ktor.getResult("private_message/list", form)

    /**
     * Delete a private message.
     *
     * @POST("private_message/delete")
     */
    override suspend fun deletePrivateMessage(form: DeletePrivateMessage): Result<PrivateMessageResponse> =
        Ktor.postResult("private_message/delete", form)

    /**
     * Mark a private message as read.
     *
     * @POST("private_message/mark_as_read")
     */
    override suspend fun markPrivateMessageAsRead(form: MarkPrivateMessageAsRead): Result<PrivateMessageResponse> =
        Ktor.postResult("private_message/mark_as_read", form)

    /**
     * Create a report for a private message.
     *
     * @POST("private_message/report")
     */
    override suspend fun createPrivateMessageReport(form: CreatePrivateMessageReport): Result<PrivateMessageReportResponse> =
        Ktor.postResult("private_message/report", form)

    /**
     * Resolve a report for a private message.
     *
     * @PUT("private_message/report/resolve")
     */
    override suspend fun resolvePrivateMessageReport(form: ResolvePrivateMessageReport): Result<PrivateMessageReportResponse> =
        Ktor.putResult("private_message/report/resolve", form)

    /**
     * List private message reports.
     *
     * @GET("private_message/report/list")
     */
    override suspend fun listPrivateMessageReports(form: ListPrivateMessageReports): Result<ListPrivateMessageReportsResponse> =
        Ktor.getResult("private_message/report/list", form)

    /**
     * Get the details for a person.
     *
     * @GET("user")
     */
    override suspend fun getPersonDetails(form: GetPersonDetails): Result<GetPersonDetailsResponse> =
        Ktor.getResult("user", form)

    /**
     * Register a new user.
     *
     * @POST("user/register")
     */
    override suspend fun register(form: Register): Result<LoginResponse> =
        Ktor.postResult("user/register", form)

    /**
     * Fetch a Captcha.
     *
     * @GET("user/get_captcha")
     */
    override suspend fun getCaptcha(form: GetCaptcha): Result<GetCaptchaResponse> =
        Ktor.getResult("user/get_captcha", form)

    /**
     * Get mentions for your user.
     *
     * @GET("user/mention")
     */
    override suspend fun getPersonMentions(form: GetPersonMentions): Result<GetPersonMentionsResponse> =
        Ktor.getResult("user/mention", form)

    /**
     * Mark a person mention as read.
     *
     * @POST("user/mention/mark_as_read")
     */
    override suspend fun markPersonMentionAsRead(form: MarkPersonMentionAsRead): Result<PersonMentionResponse> =
        Ktor.postResult("user/mention/mark_as_read", form)

    /**
     * Get comment replies.
     *
     * @GET("user/replies")
     */
    override suspend fun getReplies(form: GetReplies): Result<GetRepliesResponse> =
        Ktor.getResult("user/replies", form)

    /**
     * Ban a person from your site.
     *
     * @POST("user/ban")
     */
    override suspend fun banPerson(form: BanPerson): Result<BanPersonResponse> =
        Ktor.postResult("user/ban", form)

    /**
     * Get a list of banned users
     *
     * @GET("user/banned")
     */
    override suspend fun getBannedPersons(form: GetBannedPersons): Result<BannedPersonsResponse> =
        Ktor.getResult("user/banned", form)

    /**
     * Block a person.
     *
     * @POST("user/block")
     */
    override suspend fun blockPerson(form: BlockPerson): Result<BlockPersonResponse> =
        Ktor.postResult("user/block", form)

    /**
     * Log into lemmy.
     *
     * @POST("user/login")
     */
    override suspend fun login(form: Login): Result<LoginResponse> =
        Ktor.postResult("user/login", form)

    /**
     * Delete your account.
     *
     * @POST("user/delete_account")
     */
    override suspend fun deleteAccount(form: DeleteAccount): Result<Unit> =
        Ktor.postResult("user/delete_account", form)

    /**
     * Reset your password.
     *
     * @POST("user/password_reset")
     */
    override suspend fun passwordReset(form: PasswordReset): Result<Unit> =
        Ktor.postResult("user/password_reset", form)

    /**
     * Change your password from an email / token based reset.
     *
     * @POST("user/password_change")
     */
    override suspend fun passwordChangeAfterReset(form: PasswordChangeAfterReset): Result<Unit> =
        Ktor.postResult("user/password_change", form)

    /**
     * Mark all replies as read.
     *
     * @POST("user/mark_all_as_read")
     */
    override suspend fun markAllAsRead(form: MarkAllAsRead): Result<GetRepliesResponse> =
        Ktor.postResult("user/mark_all_as_read", form)

    /**
     * Save your user settings.
     *
     * @PUT("user/save_user_settings")
     */
    override suspend fun saveUserSettings(form: SaveUserSettings): Result<LoginResponse> =
        Ktor.putResult("user/save_user_settings", form)

    /**
     * Change your user password.
     *
     * @PUT("user/change_password")
     */
    override suspend fun changePassword(form: ChangePassword): Result<LoginResponse> =
        Ktor.putResult("user/change_password", form)

    /**
     * Get counts for your reports
     *
     * @GET("user/report_count")
     */
    override suspend fun getReportCount(form: GetReportCount): Result<GetReportCountResponse> =
        Ktor.getResult("user/report_count", form)

    /**
     * Get your unread counts
     *
     * @GET("user/unread_count")
     */
    override suspend fun getUnreadCount(form: GetUnreadCount): Result<GetUnreadCountResponse> =
        Ktor.getResult("user/unread_count", form)

    /**
     * Verify your email
     *
     * @POST("user/verify_email")
     */
    override suspend fun verifyEmail(form: VerifyEmail): Result<Unit> =
        Ktor.postResult("user/verify_email", form)

    /**
     * Leave the Site admins.
     *
     * @POST("user/leave_admin")
     */
    override suspend fun leaveAdmin(form: LeaveAdmin): Result<GetSiteResponse> =
        Ktor.postResult("user/leave_admin", form)

    /**
     * Add an admin to your site.
     *
     * @POST("admin/add")
     */
    override suspend fun addAdmin(form: AddAdmin): Result<AddAdminResponse> =
        Ktor.postResult("admin/add", form)

    /**
     * Get the unread registration applications count.
     *
     * @GET("admin/registration_application/count")
     */
    override suspend fun getUnreadRegistrationApplicationCount(form: GetUnreadRegistrationApplicationCount): Result<GetUnreadRegistrationApplicationCountResponse> =
        Ktor.getResult("admin/registration_application/count", form)

    /**
     * List the registration applications.
     *
     * @GET("admin/registration_application/list")
     */
    override suspend fun listRegistrationApplications(form: ListRegistrationApplications): Result<ListRegistrationApplicationsResponse> =
        Ktor.getResult("admin/registration_application/list", form)

    /**
     * Approve a registration application
     *
     * @PUT("admin/registration_application/approve")
     */
    override suspend fun approveRegistrationApplication(form: ApproveRegistrationApplication): Result<RegistrationApplicationView> =
        Ktor.putResult("admin/registration_application/approve", form)

    /**
     * Purge / Delete a person from the database.
     *
     * @POST("admin/purge/person")
     */
    override suspend fun purgePerson(form: PurgePerson): Result<PurgeItemResponse> =
        Ktor.postResult("admin/purge/person", form)

    /**
     * Purge / Delete a community from the database.
     *
     * @POST("admin/purge/community")
     */
    override suspend fun purgeCommunity(form: PurgeCommunity): Result<PurgeItemResponse> =
        Ktor.postResult("admin/purge/community", form)

    /**
     * Purge / Delete a post from the database.
     *
     * @POST("admin/purge/post")
     */
    override suspend fun purgePost(form: PurgePost): Result<PurgeItemResponse> =
        Ktor.postResult("admin/purge/post", form)

    /**
     * Purge / Delete a comment from the database.
     *
     * @POST("admin/purge/comment")
     */
    override suspend fun purgeComment(form: PurgeComment): Result<PurgeItemResponse> =
        Ktor.postResult("admin/purge/comment", form)

    /**
     * Edit an existing custom emoji
     *
     * @PUT("custom_emoji")
     */
    override suspend fun editCustomEmoji(form: EditCustomEmoji): Result<CustomEmojiResponse> =
        Ktor.putResult("custom_emoji", form)

    /**
     * Create a new custom emoji
     *
     * @POST("custom_emoji")
     */
    override suspend fun createCustomEmoji(form: CreateCustomEmoji): Result<CustomEmojiResponse> =
        Ktor.postResult("custom_emoji", form)

    /**
     * Delete a custom emoji
     *
     * @POST("custom_emoji/delete")
     */
    override suspend fun deleteCustomEmoji(form: DeleteCustomEmoji): Result<DeleteCustomEmojiResponse> =
        Ktor.postResult("custom_emoji/delete", form)

}


suspend fun main() {
    val api = LemmyApiImpl(getKtor("https://lemmy.world/api/v3/"))

    println(api.version)
    println(api.getSite(GetSite()).getOrThrow())
    // println(api.login(Login("lemmy", "lemmy123")))
}
