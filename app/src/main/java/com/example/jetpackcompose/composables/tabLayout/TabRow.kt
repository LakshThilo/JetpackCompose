package com.example.jetpackcompose.composables.tabLayout

import androidx.compose.animation.Animatable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.Denim
import com.example.jetpackcompose.ui.theme.Malibu
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.pagerTabIndicatorOffset
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun CustomTabRow(
    tabItems: List<String>,
    pagerState: PagerState,
    coroutineScope: CoroutineScope
) {
    TabRow(
        selectedTabIndex = pagerState.currentPage,
        backgroundColor = Color.DarkGray,
        modifier = Modifier
            .padding(start = 4.dp, end = 4.dp, top = 4.dp, bottom = 4.dp)
            .background(color = Color.Transparent)
            .clip(RoundedCornerShape(20.dp)),
        indicator = { tabPosition ->
            TabRowDefaults.Indicator(
                Modifier
                    .pagerTabIndicatorOffset(pagerState, tabPosition)
                    .width(0.dp)
                    .height(0.dp)
            )
        }
    ) {

        tabItems.forEachIndexed { index, title ->

            val tabColor = remember {
                Animatable(Color.White)
            }

            LaunchedEffect(pagerState.currentPage == index) {
                tabColor.animateTo( if(pagerState.currentPage == index) Color.White else Color.DarkGray)
            }

            Tab(
                selected = pagerState.currentPage == index,
                modifier = Modifier
                    .background(
                        color = tabColor.value,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .height(48.dp),
                onClick = {
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                },
                text = {
                    Text(
                        title,
                        style = if (pagerState.currentPage == index)
                            TextStyle(
                                color = Color.DarkGray,
                                fontSize = 18.sp,
                            )
                        else TextStyle(
                            color = Color.White,
                            fontSize = 16.sp
                        )
                    )
                }
            )
        }
    }
}



