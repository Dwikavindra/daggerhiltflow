package com.example.daggerhiltwithflow

import com.example.daggerhiltwithflow.domain.GetLatestUser
import javax.inject.Inject

class ViewModel @Inject constructor(getLatestUser: GetLatestUser) {
}