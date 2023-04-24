package com.example.jetpackcompose.composables.custom

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.transform.BlurTransformation
import coil.transform.RoundedCornersTransformation
import com.example.jetpackcompose.R

@Composable
fun CoilImage(){

    Box(
        modifier = Modifier
            .height(100.dp)
            .width(100.dp)
            .padding(8.dp),
        contentAlignment = Alignment.Center
    ){
        val painter = rememberImagePainter(
            data = "https://avatars.githubusercontent.com/u/14994036?v=1",
            builder = {
                placeholder(R.drawable.ic_placeholder)
                error(R.drawable.ic_error)
                crossfade(1000)
                transformations(
                    //GrayscaleTransformation(),
                    //CircleCropTransformation(),
                    BlurTransformation(LocalContext.current),
                    RoundedCornersTransformation(50f)
                )
                /*this
                    .transformations()
                    .crossfade(2000)
                    .scale(Scale.FIT)*/
            }
        )

        val painterState = painter.state
        Image(painter = painter,
            contentDescription = "Logo Image")
       /* if (painterState is ImagePainter.State.Loading) {
            CircularProgressIndicator()
        }*/
    }
}

@Composable
@Preview
fun CoilImagePreview(){
    CoilImage()
}