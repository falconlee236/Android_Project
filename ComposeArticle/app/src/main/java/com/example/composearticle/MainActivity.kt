package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleView("Android")
                }
            }
        }
    }
}

@Composable
fun ArticleView(name: String, modifier: Modifier = Modifier) {
    val head_img = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(
            painter = head_img,
            contentDescription = null
        )
        Text(
            text = stringResource(id = R.string.article_title),
            modifier = modifier
        )
        Text(
            text = stringResource(id = R.string.first_para),
            modifier = modifier
        )
        Text(
            text = stringResource(id = R.string.second_para),
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ComposeArticleTheme {
        ArticleView("Android")
    }
}