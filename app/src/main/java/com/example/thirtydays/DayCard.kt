package com.example.thirtydays

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thirtydays.ui.theme.ThirtyDaysTheme


@Composable
fun DayCard(
    day: Day = DaysList.days[1],
    modifier: Modifier = Modifier
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Column {
            TopText(day = day)
            Box(
                modifier = Modifier
                    .padding(8.dp)
            ) {
                Image(painter = painterResource(id = day.image), contentDescription = null)
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
            .padding(16.dp)
    ) {
        Text(text = stringResource(id = day.title), fontSize = 12.sp)
        Text(text = stringResource(id = day.task))
    }

}


@Preview
@Composable
fun DayCardPreview() {
    ThirtyDaysTheme {
        DayCard()
    }
}
