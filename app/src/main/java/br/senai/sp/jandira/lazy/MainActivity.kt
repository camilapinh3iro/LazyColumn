package br.senai.sp.jandira.lazy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lazy.dao.repository.ProductRepository
import br.senai.sp.jandira.lazy.model.Product
import br.senai.sp.jandira.lazy.ui.theme.LazyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LazyTheme {
// A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting(ProductRepository.getProductsList())
                }
            }
        }
    }
}

@Composable
fun Greeting(products: List<Product>) {
    Surface(modifier = Modifier.fillMaxSize()) {
        LazyColumn() {
            items(products) { product ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(4.dp),
                    backgroundColor = Color.Magenta
                ) {
                    Row(
                        modifier = Modifier
                            .padding(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Card(
                            modifier = Modifier.size(40.dp),
                            shape = CircleShape
                        ) {
                            Image(
                                painter = product.image ?: painterResource(id = R.drawable.manoel),
                                contentDescription = "",
                                modifier = Modifier.size(100.dp),
                                contentScale = ContentScale.FillHeight
                            )
                        }
                        Spacer(modifier = Modifier.width(16.dp))

                        Column() {
                            Text(
                                text = "${product.name}",
                                fontSize = 24.sp,
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "${product.description}",
                                fontSize = 12.sp,
                                color = Color.White
                            )
                            Text(
                                text = "${product.price}",
                                modifier = Modifier.fillMaxWidth(),
                                color = Color.White,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.End

                            )
                        }
                    }

                }


            }

        }

//        Column(){
//            for (product in products){
//                Text(text = "${product.id} - ${product.name}")
//            }
//        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LazyTheme {
        Greeting(ProductRepository.getProductsList())
    }
}