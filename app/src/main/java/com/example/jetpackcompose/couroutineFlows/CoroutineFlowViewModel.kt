package com.example.jetpackcompose.couroutineFlows

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.launch

class CoroutineFlowViewModel:ViewModel() {

  private val user = MutableStateFlow<User?>(null)
  private val posts = MutableStateFlow(emptyList<Post>())

  private val _profileState = MutableStateFlow<ProfileState?>(null)
  val profileState = _profileState.asStateFlow()

  init {

    // whenever user/post data change this block will trigger
    user.combine(posts) { user, posts ->
      _profileState.value = profileState.value?.copy(
        profilePicUrl = user?.profilePicUrls,
        username = user?.username,
        description = user?.description,
        posts = posts
      )
    }.launchIn(viewModelScope)

    // equivalent to
   /* viewModelScope.launch {
      user.combine(posts) { user, posts ->
        _profileState.value = profileState.value?.copy(
          profilePicUrl = user?.profilePicUrls,
          username = user?.username,
          description = user?.description,
          posts = posts
        )
      }.collect()
    }*/

  }
}