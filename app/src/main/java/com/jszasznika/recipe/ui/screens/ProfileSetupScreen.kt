package com.jszasznika.recipe.ui.screens


import android.widget.Toast
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jszasznika.recipe.domain.Diet

@ExperimentalFoundationApi
@Composable
@Preview(showBackground = true)
fun ProfileSetupScreen() {
    Scaffold {
        val context = LocalContext.current
        Box(
            modifier = Modifier
                .background(Color.White)
                .fillMaxSize()
        ) {
            val selectedItems = mutableListOf<Diet>()

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 56.dp)

            ) {
                Text(
                    text = "Choose Diet options",
                    color = Color.White,
                    fontSize = 30.sp
                )

                DietGrid(diets = Diet.values){
                   if(selectedItems.contains(it)){
                       selectedItems.remove(it)
                   }else{
                       selectedItems.add(it)
                   }
                }

                Button(
                    onClick = {
                        Toast.makeText(context,
                            selectedItems.joinToString { it.dietName }, Toast.LENGTH_SHORT).show()
                    },
                    modifier = Modifier.fillMaxWidth(0.5f)
                ) {
                    Text("Continue")
                }
            }
        }
    }
}


@Composable
fun DietCard(diet: Diet, onClick: (diet:Diet) -> Unit = {}) {
    var isSelected by remember { mutableStateOf(false) }
    val alpha  by animateFloatAsState(if(isSelected) 1f else 0.5f)

    Card(
        modifier = Modifier
            .width(50.dp)
            .padding(10.dp)
            .alpha(alpha)
            .clickable {
                isSelected = !isSelected
                onClick(diet)
            },

        elevation = 10.dp,
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, Color.White)

    ) {

            Image(
                painter = painterResource(id = diet.imageRes),
                contentDescription = "",
                modifier = Modifier
                    .width(84.dp)
                    .height(84.dp))

    }
}

@ExperimentalFoundationApi
@Composable
fun DietGrid(diets: List<Diet>, onItemClick:(item:Diet)->Unit = {}) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        modifier = Modifier.fillMaxHeight(0.9f)
    ) {
        items(diets.size) { index -> DietCard(diet = diets[index],onItemClick) }
    }
}