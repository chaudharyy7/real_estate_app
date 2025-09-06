package com.example.realestate.ui.theme.components

import android.R.attr.fontWeight
import android.graphics.Color.blue
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.realestate.R
import com.example.realestate.core.model.Property
import com.example.realestate.util.getDrawabled

@Composable
fun PropertyCard(
    item: Property,
) {
    val white = colorResource(R.color.white)
    val blue = colorResource(R.color.blue)
    val grey = colorResource(R.color.grey)
    val lightGrey = colorResource(R.color.lightGrey)
    val black = colorResource(R.color.black)

    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .height(320.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(30.dp))
            .background(white)
    ) {
        Box (
        ) {
            Image(
                painter = painterResource(getDrawabled(item.pickPath)),
                contentDescription = null,
                modifier = Modifier.height(233.dp)
                    .fillMaxWidth()
                    .background(white)
                    .padding(12.dp)
                    .clip(RoundedCornerShape(30.dp)),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "$${item.price} USD",
                color = white,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(start = 28.dp, bottom = 28.dp)
                    .align(Alignment.BottomStart)
                    .clip(RoundedCornerShape(50.dp))
                    .background(blue)
                    .padding(horizontal = 16.dp, vertical = 6.dp)

            )
        }
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(30.dp))
                    .padding(horizontal = 16.dp)

            ) {
                Spacer(Modifier.height(8.dp))
                Text(
                    text = item.title,
                    color = black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Spacer(Modifier.height(8.dp))
                Text(
                    text = item.address,
                    color = grey,
                    fontSize = 13.sp
                )
                Spacer(Modifier.height(8.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    MetaChip(icon = R.drawable.bed, text = "${item.bed} Beds")
                    MetaChip(icon = R.drawable.bath, text = "${item.bath} Baths")
                    MetaChip(icon = R.drawable.garage, text = if (item.isGarage)"Car Garage" else "No Garage")
                    MetaChip(icon = R.drawable.size, text = "${item.size} Sqft")
                }
            }
    }

}

@Preview
@Composable
fun PropertyCardPreview() {
    PropertyCard(
        item = Property(
            type = "Apartment",
            title = "Royal Apartment",
            address = "LosAngles LA",
            pickPath = "pic_1",
            price = 1500,
            bed = 2,
            bath = 3,
            size = 350,
            isGarage = true,
            score = 4.5,
            description = "This 2 bed /1 bath home boasts an enormous, open-living plan..."
        )
    )
}
