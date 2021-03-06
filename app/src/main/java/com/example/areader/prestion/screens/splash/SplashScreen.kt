package com.example.areader.prestion.screens.splash

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.TweenSpec
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.areader.prestion.components.ShowLogo
import com.example.areader.prestion.screens.destinations.AuthScreenDestination
import com.example.areader.prestion.screens.destinations.HomeScreenDestination
import com.example.areader.prestion.screens.loginScreen.AuthViewModel
import com.example.areader.prestion.theme.AReaderTheme
import com.example.areader.utils.Screens
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import kotlinx.coroutines.delay

@RootNavGraph(start = true)
@Destination
@Composable
fun SplashScreen(navHost: DestinationsNavigator, authViewModel: AuthViewModel = hiltViewModel()) {
    AReaderTheme {
        val scale = remember {
            androidx.compose.animation.core.Animatable(initialValue = 0f)
        }
        LaunchedEffect(key1 = true, block = {
            scale.animateTo(
                1.4f, TweenSpec(
                    durationMillis = 1200,
                    delay = 300,
                    easing = {
                        OvershootInterpolator(4f)
                            .getInterpolation(it)
                    }
                )
            )
        })

        LaunchedEffect(key1 = authViewModel.isAuthenticate, block = {
            if (authViewModel.isAuthenticate) {
                delay(1200)
                navHost.popBackStack()
                navHost.navigate(HomeScreenDestination)
            } else {
                delay(1200)
                navHost.popBackStack()
                navHost.navigate(AuthScreenDestination)
            }
        })

        Surface(
            modifier = Modifier
                .fillMaxSize(),
            color = Color.White
        ) {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .scale(scale.value),
                contentAlignment = Alignment.Center
            ) {

                ShowLogo()


            }
        }
    }
}
