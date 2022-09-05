package com.heinika.pokeg.module.donation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.heinika.pokeg.R
import com.heinika.pokeg.utils.SystemBar


@Composable
fun DonationScreen(onBack: () -> Unit) {
  Column() {
    TopAppBar(
      navigationIcon = {
        IconButton(onClick = {
          onBack()
        }) {
          Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null)
        }
      },
      backgroundColor = Color.Transparent,
      modifier = Modifier.padding(top = SystemBar.statusBarHeightDp.dp, start = 12.dp, end = 12.dp),
      title = { Text(text = stringResource(id = R.string.donation)) })
    Column(
      modifier = Modifier
        .fillMaxSize(),
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.SpaceEvenly
    ) {
      Column() {
        Text(text = "微信支付")
        Image(painter = painterResource(id = R.drawable.wechat), contentDescription = "", modifier = Modifier.size(250.dp))
      }

      Column() {
        Text(text = "支付宝")
        Image(painter = painterResource(id = R.drawable.alipay), contentDescription = "", modifier = Modifier.size(250.dp))
      }
    }
  }
}

@Preview
@Composable
fun DonationScreenPreview() {
  DonationScreen({})
}