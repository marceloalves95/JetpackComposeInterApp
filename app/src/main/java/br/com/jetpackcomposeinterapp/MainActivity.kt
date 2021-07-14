package br.com.jetpackcomposeinterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }

    }

    @Composable
    private fun MainContent(){
        Scaffold{
            Column(modifier = Modifier
                .wrapContentWidth()
                .fillMaxWidth()){
                Fields()
                Fundo()
                CardsOthers()
            }
            Cards()

        }
    }
    @Composable
    private fun Fields(){
        Column{
            Row(modifier = Modifier
                .fillMaxWidth()){
                Image(
                    modifier = Modifier
                        .wrapContentWidth()
                        .fillMaxWidth()
                        .weight(2f)
                        .padding(start = 18.dp, top = 20.dp),
                    painter = painterResource(id = R.drawable.inter),
                    contentDescription = null)

                Image(
                    modifier= Modifier
                        .wrapContentWidth()
                        .fillMaxWidth()
                        .weight(6f)
                        .padding(top = 20.dp, end = 24.dp),
                    alignment= Alignment.CenterEnd,
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = null)

                Image(
                    modifier= Modifier
                        .wrapContentWidth()
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(end = 20.dp, top = 20.dp),
                    painter = painterResource(id = R.drawable.menu_more),
                    alignment= Alignment.CenterEnd,
                    contentDescription = null)

            }
            Row(modifier = Modifier
                .fillMaxWidth()){
                Text(
                    modifier = Modifier.padding(start = 20.dp, top=20.dp),
                    text = "R$0,00",
                    fontWeight= FontWeight.Bold,
                    fontSize = 20.sp,
                    color = colorResource(id = R.color.preto))

                Image(modifier = Modifier
                    .wrapContentWidth()
                    .padding(top = 23.dp, start = 10.dp),
                    painter = painterResource(id = R.drawable.eye), contentDescription = null)
            }

            Text(
                modifier = Modifier.padding(start = 20.dp),
                text = "Ver extrato",
                color= colorResource(id = R.color.interOrange),
                fontWeight= FontWeight.Bold,
                fontSize = 10.sp)

        }


    }
    @Composable
    private fun Cards(){
        Column{
            Row(modifier = Modifier
                .wrapContentWidth()
                .padding(top = 110.dp)
                .fillMaxWidth()){
                Card(
                    modifier = Modifier
                        .padding(start = 20.dp, top = 20.dp)
                        .weight(2f)
                        .clickable { },
                    border= BorderStroke(1.dp, colorResource(id = R.color.cardStroke))
                ) {
                    Column(
                        modifier = Modifier.wrapContentSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painterResource(id = R.drawable.cartao),
                            contentDescription = null,
                            modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp),
                            alignment = Alignment.Center
                        )

                        Text(
                            text = "Cartões",
                            textAlign = TextAlign.Center,
                            fontWeight= FontWeight.Bold,
                            modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp,bottom = 8.dp)
                        )
                    }

                }
                Card(
                    modifier = Modifier
                        .padding(start = 8.dp, top = 20.dp)
                        .weight(2f)
                        .clickable { },
                    border= BorderStroke(1.dp, colorResource(id = R.color.cardStroke))
                ) {
                    Column(
                        modifier = Modifier.wrapContentSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painterResource(id = R.drawable.pix),
                            contentDescription = null,
                            modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp),
                            alignment = Alignment.Center
                        )

                        Text(
                            text = "Pix",
                            textAlign = TextAlign.Center,
                            fontWeight= FontWeight.Bold,
                            modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp,bottom = 8.dp)
                        )
                    }

                }
                Card(
                    modifier = Modifier
                        .padding(start = 8.dp, top = 20.dp, end = 20.dp)
                        .weight(2f)
                        .clickable { },
                    border= BorderStroke(1.dp, colorResource(id = R.color.cardStroke))
                ) {
                    Column(
                        modifier = Modifier.wrapContentSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painterResource(id = R.drawable.investir),
                            contentDescription = null,
                            modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp),
                            alignment = Alignment.Center
                        )

                        Text(
                            text = "Investir",
                            textAlign = TextAlign.Center,
                            fontWeight= FontWeight.Bold,
                            modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp,bottom = 8.dp)
                        )
                    }


                }

            }
            Row(modifier = Modifier
                .wrapContentWidth()
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){
                Image(
                    modifier= Modifier.padding(top = 12.dp),
                    alignment= Alignment.Center,
                    painter = painterResource(id = R.drawable.more),
                    contentDescription = null)
            }
        }



    }
    @Composable
    private fun CardsOthers(){

        Column{
            Card(modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 20.dp)
                .clickable { },
                border= BorderStroke(1.dp, colorResource(id = R.color.cardStroke))){

                Row(modifier=Modifier.fillMaxWidth()){
                    
                    Text(
                        modifier = Modifier
                            .weight(2f)
                            .padding(start = 20.dp, top = 32.dp, end = 20.dp, bottom = 20.dp),
                        fontSize=25.sp,
                        fontWeight= FontWeight.Bold,
                        text = "Inter Shop")
                    Image(
                        modifier = Modifier
                            .weight(3f)
                            .padding(end = 8.dp),
                        painter = painterResource(id = R.drawable.foto1), contentDescription = null)

                }

            }
            Card(modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 8.dp)
                .clickable { },
                border= BorderStroke(1.dp, colorResource(id = R.color.cardStroke))){

                Row(modifier=Modifier.fillMaxWidth()){
                    Text(
                        modifier = Modifier
                            .weight(2f)
                            .padding(start = 20.dp, top = 42.dp, end = 20.dp, bottom = 20.dp),
                        fontSize=25.sp,
                        fontWeight= FontWeight.Bold,
                        text = "Delivery")
                    Image(
                        modifier = Modifier
                            .weight(3f)
                            .padding(start = 16.dp, top = 8.dp, bottom = 8.dp),
                        painter = painterResource(id = R.drawable.foto2), contentDescription = null)
                }

            }
        }

    }
    @Composable
    private fun Fundo(){
        Column(modifier = Modifier
            .height(160.dp)
            .padding(top = 60.dp)
            .wrapContentWidth()
            .fillMaxWidth()
            .background(colorResource(id = R.color.fundo))){

        }
    }
    @Preview
    @Composable
    fun DefaultPreview() {
        MainContent()
    }

}
