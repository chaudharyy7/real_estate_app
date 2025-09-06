package com.example.realestate.ui.theme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.realestate.R

@Composable
fun CategoriesRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        CategoryItem(icon = R.drawable.cat_1, title = "House", modifier = Modifier.weight(1f))
        CategoryItem(icon = R.drawable.cat_2, title = "Apartment", modifier = Modifier.weight(1f))
        CategoryItem(icon = R.drawable.cat_3, title = "Villa", modifier = Modifier.weight(1f))
        CategoryItem(icon = R.drawable.cat_4, title = "Banglow", modifier = Modifier.weight(1f))
        CategoryItem(icon = R.drawable.cat_5, title = "Empty land", modifier = Modifier.weight(1f))
    }
}