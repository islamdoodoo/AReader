package com.example.areader.prestion.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.areader.prestion.theme.AReaderTheme

@Composable
fun StandardButton(
    buttonText: String,
    isEnabled: Boolean,
    onClick: () -> Unit,
) {
    AReaderTheme {
        Button(
            modifier = Modifier
                .width(140.dp)
                .padding(end = 15.dp),
            onClick = { onClick.invoke() },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.primary,
                contentColor = Color.White,
//                disabledBackgroundColor = MaterialTheme.colors.primary.copy(0.4f),
//                disabledContentColor = MaterialTheme.colors.background.copy(0.5f)
            ),
            enabled = isEnabled
        ) {
            Text(
                text = buttonText,
                style = MaterialTheme.typography.button.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            )
        }
    }
}