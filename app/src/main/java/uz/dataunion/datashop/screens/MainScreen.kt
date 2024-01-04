package uz.dataunion.datashop.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.tooling.preview.Preview
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import uz.dataunion.datashop.utils.ScreenID

var mainScreenState = mutableStateOf(ScreenID.HomeScreen)

@Destination(start = true)
@Composable
fun MainScreen(
    navigator: DestinationsNavigator? = null
) {


}

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen()
}