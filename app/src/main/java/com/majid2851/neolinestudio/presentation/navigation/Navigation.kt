package com.majid2851.neolinestudio.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.majid2851.personalwallet.presentation.screens.main_page.accounts.ui.TimeLineFollowing
import com.majid2851.personalwallet.presentation.screens.main_page.accounts.ui.TimeLineFollowingViewModel

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = ScreenMap.TimeLineFollowing.route
    )
    {
        composable(route = ScreenMap.TimeLineFollowing.route)
        {
            val viewModel:TimeLineFollowingViewModel = hiltViewModel()
            TimeLineFollowing(
                state =viewModel.state.value ,
                event = viewModel::onTriggerEvent,
            )

        }


    }

}