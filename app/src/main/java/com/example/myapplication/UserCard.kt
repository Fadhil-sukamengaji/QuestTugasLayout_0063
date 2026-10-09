package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun UserCard(
    bgColor: Int,
    nama: Int,
    hp: Int?,
    alamat: Int,
    fontFamily: FontFamily = FontFamily.Default,
    hpColor: Int = R.color.text_white,
    alamatColor: Int = R.color.text_white
){
    val gambar = painterResource(id = R.drawable.logo_umy)

    Card(
        modifier = Modifier
            .fillMaxWidth(fraction = 1f)
            .padding(horizontal = 12.dp, vertical = 4.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = bgColor)
        )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 6.dp)
        ){
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 8.dp)
            ){
                Text(
                    text = stringResource(nama),
                    fontSize = 18.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                if (hp != null) {
                    Text(
                        text = stringResource(hp),
                        fontSize = 13.sp,
                        color = colorResource(id = hpColor)
                    )
                }
                Text(
                    text = stringResource(alamat),
                    fontSize = 13.sp,
                    color = colorResource(id = alamatColor)
                )
            }
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
        }
    }
}