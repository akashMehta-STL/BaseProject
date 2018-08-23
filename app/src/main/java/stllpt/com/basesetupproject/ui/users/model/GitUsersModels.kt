package stllpt.com.basesetupproject.ui.users.model


import com.google.gson.annotations.SerializedName

data class Owner(@SerializedName("gists_url")
                 val gistsUrl: String? = "",
                 @SerializedName("repos_url")
                 val reposUrl: String? = "",
                 @SerializedName("following_url")
                 val followingUrl: String? = "",
                 @SerializedName("starred_url")
                 val starredUrl: String? = "",
                 @SerializedName("login")
                 val login: String? = "",
                 @SerializedName("followers_url")
                 val followersUrl: String? = "",
                 @SerializedName("type")
                 val type: String? = "",
                 @SerializedName("url")
                 val url: String? = "",
                 @SerializedName("subscriptions_url")
                 val subscriptionsUrl: String? = "",
                 @SerializedName("received_events_url")
                 val receivedEventsUrl: String? = "",
                 @SerializedName("avatar_url")
                 val avatarUrl: String? = "",
                 @SerializedName("events_url")
                 val eventsUrl: String? = "",
                 @SerializedName("html_url")
                 val htmlUrl: String? = "",
                 @SerializedName("site_admin")
                 val siteAdmin: Boolean? = false,
                 @SerializedName("id")
                 val id: Int? = 0,
                 @SerializedName("gravatar_id")
                 val gravatarId: String? = "",
                 @SerializedName("node_id")
                 val nodeId: String? = "",
                 @SerializedName("organizations_url")
                 val organizationsUrl: String? = "")


data class Repository(@SerializedName("tags_url")
                      val tagsUrl: String? = "",
                      @SerializedName("private")
                      val private: Boolean? = false,
                      @SerializedName("contributors_url")
                      val contributorsUrl: String? = "",
                      @SerializedName("notifications_url")
                      val notificationsUrl: String? = "",
                      @SerializedName("description")
                      val description: String? = "",
                      @SerializedName("subscription_url")
                      val subscriptionUrl: String? = "",
                      @SerializedName("keys_url")
                      val keysUrl: String? = "",
                      @SerializedName("branches_url")
                      val branchesUrl: String? = "",
                      @SerializedName("deployments_url")
                      val deploymentsUrl: String? = "",
                      @SerializedName("issue_comment_url")
                      val issueCommentUrl: String? = "",
                      @SerializedName("labels_url")
                      val labelsUrl: String? = "",
                      @SerializedName("subscribers_url")
                      val subscribersUrl: String? = "",
                      @SerializedName("releases_url")
                      val releasesUrl: String? = "",
                      @SerializedName("comments_url")
                      val commentsUrl: String? = "",
                      @SerializedName("stargazers_url")
                      val stargazersUrl: String? = "",
                      @SerializedName("id")
                      val id: Int? = 0,
                      @SerializedName("owner")
                      val owner: Owner?,
                      @SerializedName("archive_url")
                      val archiveUrl: String? = "",
                      @SerializedName("commits_url")
                      val commitsUrl: String? = "",
                      @SerializedName("git_refs_url")
                      val gitRefsUrl: String? = "",
                      @SerializedName("forks_url")
                      val forksUrl: String? = "",
                      @SerializedName("compare_url")
                      val compareUrl: String? = "",
                      @SerializedName("statuses_url")
                      val statusesUrl: String? = "",
                      @SerializedName("git_commits_url")
                      val gitCommitsUrl: String? = "",
                      @SerializedName("blobs_url")
                      val blobsUrl: String? = "",
                      @SerializedName("git_tags_url")
                      val gitTagsUrl: String? = "",
                      @SerializedName("merges_url")
                      val mergesUrl: String? = "",
                      @SerializedName("downloads_url")
                      val downloadsUrl: String? = "",
                      @SerializedName("url")
                      val url: String? = "",
                      @SerializedName("contents_url")
                      val contentsUrl: String? = "",
                      @SerializedName("milestones_url")
                      val milestonesUrl: String? = "",
                      @SerializedName("teams_url")
                      val teamsUrl: String? = "",
                      @SerializedName("fork")
                      val fork: Boolean? = false,
                      @SerializedName("issues_url")
                      val issuesUrl: String? = "",
                      @SerializedName("full_name")
                      val fullName: String? = "",
                      @SerializedName("events_url")
                      val eventsUrl: String? = "",
                      @SerializedName("issue_events_url")
                      val issueEventsUrl: String? = "",
                      @SerializedName("languages_url")
                      val languagesUrl: String? = "",
                      @SerializedName("html_url")
                      val htmlUrl: String? = "",
                      @SerializedName("collaborators_url")
                      val collaboratorsUrl: String? = "",
                      @SerializedName("name")
                      val name: String? = "",
                      @SerializedName("pulls_url")
                      val pullsUrl: String? = "",
                      @SerializedName("hooks_url")
                      val hooksUrl: String? = "",
                      @SerializedName("assignees_url")
                      val assigneesUrl: String? = "",
                      @SerializedName("trees_url")
                      val treesUrl: String? = "",
                      @SerializedName("node_id")
                      val nodeId: String? = "")


data class GitUserResponse(@SerializedName("total_count")
                           val totalCount: Int? = 0,
                           @SerializedName("incomplete_results")
                           val incompleteResults: Boolean? = false,
                           @SerializedName("items")
                           val items: List<ItemsItem>? = null)


data class ItemsItem(@SerializedName("path")
                     val path: String? = "",
                     @SerializedName("score")
                     val score: Double? = 0.0,
                     @SerializedName("html_url")
                     val htmlUrl: String? = "",
                     @SerializedName("name")
                     val name: String? = "",
                     @SerializedName("git_url")
                     val gitUrl: String? = "",
                     @SerializedName("repository")
                     val repository: Repository?,
                     @SerializedName("sha")
                     val sha: String? = "",
                     @SerializedName("url")
                     val url: String? = "")


