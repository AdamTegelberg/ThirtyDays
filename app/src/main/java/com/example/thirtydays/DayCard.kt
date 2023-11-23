package com.example.thirtydays

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thirtydays.ui.theme.ThirtyDaysTheme


@Composable
fun DayCard(
    day: Day = DaysList.days[6],
    modifier: Modifier = Modifier
) {

    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        ),
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))

    ) {
        Column {
            TopText(day = day)
            Box(
                modifier = Modifier
                    .padding(8.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .fillMaxWidth()
                    .height(200.dp)
            ) {
                Image(
                    painter = painterResource(id = day.image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }
            Text(
                text = stringResource(id = day.description),
                modifier = Modifier
                    .padding(8.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
        }


    }

}

@Composable
fun TopText(day: Day, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(8.dp)
    ) {
        Text(text = stringResource(id = day.title))
        Text(text = stringResource(id = day.task), fontSize = 12.sp)
    }

}


@Preview
@Composable
fun DayCardPreview() {
    ThirtyDaysTheme {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            DayCard()
        }

    }
}
