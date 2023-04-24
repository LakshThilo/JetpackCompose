package com.example.jetpackcompose.composables.custom

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CustomTextField() {

    Column(
        modifier = Modifier
            .padding(8.dp)
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        var text by remember { mutableStateOf("type here...")}

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(1.dp),
            value = text,
            onValueChange = {
                text = it
            },
            label = {
                Text(text = "Title")
            },
            leadingIcon = {  // right
                IconButton(onClick = { }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "Email Icon"
                    )
                }
            },

            trailingIcon = {  // left
                IconButton(onClick = {
                    Log.d("TrailingIcon", "Clicked")
                }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = "Email Icon",
                        tint = Color.Red
                    )
                }
            },
            keyboardOptions =  KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Go
                //imeAction = ImeAction.Search
                //imeAction = ImeAction.Send
                //imeAction = ImeAction.Next
            ),
            keyboardActions = KeyboardActions(
                onGo = {
                    Log.d("ImeAction", "Clicked")
                }
            )
            //  readOnly = true,
            //  enabled = false,
            //  singleLine = true,
            //  maxLines = 2,
        )

        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(1.dp),
            value = text,
            onValueChange = {
                text = it
            },
            label = {
                Text(text = "Title")
            },
            leadingIcon = {  // right
                IconButton(onClick = { }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "Email Icon"
                    )
                }
            },

            trailingIcon = {  // left
                IconButton(onClick = {
                    Log.d("TrailingIcon", "Clicked")
                }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Check,
                        contentDescription = "Email Icon",
                        tint = Color.Green
                    )
                }
            },
            keyboardOptions =  KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Go
                //imeAction = ImeAction.Search
                //imeAction = ImeAction.Send
                //imeAction = ImeAction.Next
            ),
            keyboardActions = KeyboardActions(
                onGo = {
                    Log.d("ImeAction", "Clicked")
                }
            )
            //  readOnly = true,
            //  enabled = false,
            //  singleLine = true,
            //  maxLines = 2,
        )

    }
}

@Composable
@Preview
fun CustomTextFieldPreview() {
        Surface(
            modifier = Modifier
                .background(
                Color.LightGray
            )
        ) {
            CustomTextField()

        }
}