package com.yuzu.githubprofile.repository.contract

import androidx.lifecycle.LiveData
import com.yuzu.githubprofile.repository.data.UserData

/**
 * Created by Yustar Pramudana on 19/02/2021
 */

interface UserDBRepository {
    fun getUserBySinceId(since: Int): LiveData<List<UserData>>
    fun getUsersBySearch(search: String): LiveData<List<UserData>>
    fun insert(userData: UserData)
    fun insert(userDataList: List<UserData>)
    fun updateNotes(id: Int, notes: String)
}