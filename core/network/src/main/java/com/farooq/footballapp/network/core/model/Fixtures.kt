package com.farooq.network.core.model

import com.google.gson.annotations.SerializedName

data class Fixtures(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("sport_id") var sportId: Int? = null,
    @SerializedName("league_id") var leagueId: Int? = null,
    @SerializedName("tie_breaker_rule_id") var tieBreakerRuleId: Int? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("finished") var finished: Boolean? = null,
    @SerializedName("pending") var pending: Boolean? = null,
    @SerializedName("is_current") var isCurrent: Boolean? = null,
    @SerializedName("starting_at") var startingAt: String? = null,
    @SerializedName("ending_at") var endingAt: String? = null,
    @SerializedName("standings_recalculated_at") var standingsRecalculatedAt: String? = null,
    @SerializedName("games_in_current_week") var gamesInCurrentWeek: Boolean? = null,
)
