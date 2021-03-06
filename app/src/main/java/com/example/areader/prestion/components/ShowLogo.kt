package com.example.areader.prestion.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.unit.dp
import com.example.areader.R

@Composable
fun ShowLogo(textColor: Color = MaterialTheme.colors.secondary) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            modifier = Modifier
                .size(100.dp),
            painter = painterResource(id = R.drawable.book),
            contentDescription = null
        )
        Spacer(modifier = Modifier.padding(top = 8.dp))
        Text(
            text = "A.Reader",
            style = MaterialTheme.typography.h5.copy(color = textColor, fontFamily = Font(R.font.joan_regular).toFontFamily()))
    }

}