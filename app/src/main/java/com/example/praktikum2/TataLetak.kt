package com.example.praktikum2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TataLetakColumn(modifier: Modifier) {
    Column(modifier = modifier.padding(top = 20.dp)) {
        Text(text = "komponen1")
        Text(text = "komponen2")
        Text(text = "komponen3")
        Text(text = "komponen4")
    }
}

@Composable
fun TataLetakRow(modifier: Modifier) {
    Row (modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "komponen1")
        Text(text = "komponen2")
        Text(text = "komponen3")
        Text(text = "komponen4")
    }
}

@Composable
fun TataLetakBox(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(), contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = "Row 1")
        Text(text = "Box 2")
        Text(text = "Column 2")
    }
}

@Composable
fun TataLetakColumnRow(modifier: Modifier) {
    Column() {
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "komponen1baris1")
            Text(text = "komponen2baris1")
            Text(text = "komponen3baris1")
        }

        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "komponen1baris2")
            Text(text = "komponen2baris2")
            Text(text = "komponen3baris2")
        }
    }
}


@Composable
fun TataLetakRowColumn(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly) {
        Column() {
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom1")
            Text(text = "Komponen3Kolom1")
        }

        Column(){
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom2")
        }
    }
}


@Composable
fun TataletakBoxColumnRow(modifier: Modifier) {
    val gambar = painterResource(id = R.drawable.notasibalok)
    Column {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(height = 100.dp)
                .background(color = Color.Yellow),
            contentAlignment = Alignment.Center
        ) {
