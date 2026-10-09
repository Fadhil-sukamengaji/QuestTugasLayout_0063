package com.example.myapplication

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = 40.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.univ),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(15.dp))

        UserCard(
            bgColor = R.color.card_0_bg,
            nama = R.string.nama_1,
            hp = null,
            alamat = R.string.alamat_1,
            fontFamily = FontFamily.Cursive,
            alamatColor = R.color.text_yellow
        )

        UserCard(
            bgColor = R.color.card_1_bg,
            nama = R.string.nama_2,
            hp = R.string.hp_2,
            alamat = R.string.alamat_2,
            hpColor = R.color.text_cyan,
            alamatColor = R.color.text_yellow
        )

        UserCard(
            bgColor = R.color.card_2_bg,
            nama = R.string.nama_3,
            hp = R.string.hp_3,
            alamat = R.string.alamat_3,
            hpColor = R.color.text_cyan
        )


    }
}