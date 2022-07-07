package com.yuzu.githubprofile.repository.contract

import com.yuzu.githubprofile.repository.data.UserData
import com.yuzu.githubprofile.util.AppResult

/**
 * Created by Yustar Pramudana on 18/02/2021
 */

interface ProfileRepository {
    suspend fun userList(since: Int): AppResult<List<UserData>>
    //fun userDetail(username: String): Single<ProfileData>
}