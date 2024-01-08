package uz.dataunion.datashop.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import uz.dataunion.datashop.screens.bottom.FavoriteScreen
import uz.dataunion.datashop.screens.bottom.HomeScreen
import uz.dataunion.datashop.screens.bottom.ProfileScreen
import uz.dataunion.datashop.screens.bottom.ShoppingCartScreen
import uz.dataunion.datashop.utils.ScreenID
import uz.dataunion.datashop.utils.ScreensList
import uz.dataunion.datashop.views.BottomNavItem

var mainScreenState = mutableStateOf(ScreenID.HomeScreen)

@Destination(start = true)
@Composable
fun MainScreen(
    navigator: DestinationsNavigator? = null
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(
                        elevation = 1.dp,
                        //spotColor = Color.Red
                    )
                    .background(color = Color.Red),
                horizontalArrangement = Arrangement.SpaceEvenly,
            ) {
                for (item in ScreensList) {
                    BottomNavItem(
                        item = item,
                        isSelected = mainScreenState.value == item.id,
                        badge = 0,
                        onClick = {
                            mainScreenState.value = item.id
                        }
                    )
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 70.dp)
            ) {

                when (mainScreenState.value) {
                    ScreenID.HomeScreen -> {
                        HomeScreen(navigator)
                    }

                    ScreenID.FavoriteScreen -> {
                        FavoriteScreen(navigator)
                    }

                    ScreenID.ShoppingCartScreen -> {
                        ShoppingCartScreen(navigator)
                    }

                    ScreenID.ProfileScreen -> {
                        ProfileScreen(navigator)
                    }

                }

            }
        }

    }

}

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen()
}