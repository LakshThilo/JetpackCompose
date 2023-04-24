package com.example.jetpackcompose.composables.tabLayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState


@OptIn(ExperimentalPagerApi::class)
@Composable
fun CustomHorizontalPager(
    tabItems: List<String>,
    pagerState: PagerState,
) {
    HorizontalPager(
        count = tabItems.size,
        state = pagerState,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray)
    ) { page ->
        Text(
            text = tabItems[page],
            modifier = Modifier.padding(50.dp),
            color = Color.White
        )

    }
}