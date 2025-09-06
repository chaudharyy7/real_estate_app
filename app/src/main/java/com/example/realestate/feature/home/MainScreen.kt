package com.example.realestate.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.realestate.R
import com.example.realestate.ui.theme.components.CategoriesRow
import com.example.realestate.ui.theme.components.HeaderSection
import com.example.realestate.ui.theme.components.PropertyCard
import com.example.realestate.ui.theme.components.SearchRow

@Composable
@Preview
fun MainScreen() {
    val items = remember { sampleProperties() }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .background(colorResource(R.color.lightGrey)),
        contentPadding = PaddingValues(bottom = 100.dp)
    ) {
        item { HeaderSection() }
        item { Spacer(Modifier.height(16.dp)) }
        item { SearchRow() }
        item { Spacer(Modifier.height(16.dp)) }
        item { Spacer(Modifier.height(8.dp)) }
        item{ CategoriesRow() }
        items(items){
            Spacer(Modifier.height(16.dp))
            PropertyCard(item = it)
        }
        item { Spacer(Modifier.height(16.dp)) }

    }
}