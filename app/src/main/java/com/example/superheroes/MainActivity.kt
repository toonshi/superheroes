package com.example.superheroes

import SuperheroesTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.superheroes.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SuperheroesTheme {
                SuperheroesApp
            }
        }
    }
}

@Composable
fun SuperheroesApp(name: String, modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar()
        }
    ) {
        it ->
        LazyColumn(contentPadding = it) {
            items(superheroes){

            }
        }
    }
}

@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    CenterAllignedTopAppBar{
        title = {
            Text(
                text = stringResource(R.string.app_name)
            )
        },
        modifier = modifier
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SuperheroesTheme {
        Greeting("Android")
    }
}