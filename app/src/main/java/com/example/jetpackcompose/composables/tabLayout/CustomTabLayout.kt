package com.example.jetpackcompose.composables.tabLayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.ui.theme.lightGray
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState


@ExperimentalPagerApi
@Composable
fun CustomTabLayout() {

    val tabItems = listOf( "Movies", "TV Series",)
    val pagerState = rememberPagerState()
    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = Modifier.background(lightGray)
    ) {

      CustomTabRow(
          tabItems = tabItems,
          pagerState = pagerState,
          coroutineScope = coroutineScope
      )

        CustomHorizontalPager(tabItems = tabItems, pagerState =  pagerState )
    }
}

@ExperimentalPagerApi
@Preview(showBackground = true)
@Composable
fun CustomTabLayoutPreview() {
    CustomTabLayout()
}

