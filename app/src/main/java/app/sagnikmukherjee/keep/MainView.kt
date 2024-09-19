package app.sagnikmukherjee.keep

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.sagnikmukherjee.keep.ui.theme.Purple40


@Composable
fun TopBar(){
    Row(
        modifier = Modifier.fillMaxWidth().background(Purple40).height(70.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        val context = LocalContext.current
        IconButton(onClick = {

            Toast.makeText(context, "Back Button Clicked", Toast.LENGTH_SHORT).show()

        }, modifier = Modifier.padding(start = 20.dp)) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "", tint = Color.White)
        }
        Text(text = "Home", color = Color.White, fontSize = 20.sp)
    }
}

@Composable
fun HomeView() {
    Scaffold(
        topBar = {
            TopBar()
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ },
                elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation(0.dp),
                containerColor = Purple40,
                contentColor = Color.White
                ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "")
            }
        }
    ){innerPadding->
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)) {

        }
    }
}