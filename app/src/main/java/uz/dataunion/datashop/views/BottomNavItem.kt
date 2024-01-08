package uz.dataunion.datashop.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.dataunion.datashop.R
import uz.dataunion.datashop.model.BottomNav
import uz.dataunion.datashop.utils.ScreenID

@Composable
fun BottomNavItem(
    item: BottomNav,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .size(70.dp)
            .clickable(
                indication = null,
                interactionSource = remember { MutableInteractionSource() }
            ) {
                onClick.invoke()
            }
    ) {

        Divider(color = Color.Red)

        Icon(
            modifier = Modifier
                .size(24.dp),
            painter = painterResource(id = item.icon),
            contentDescription = null
        )
    }
}

@Preview
@Composable
fun BottomNavItemPreview() {
    BottomNavItem(
        item = BottomNav(
            id = ScreenID.HomeScreen,
            route = "cheque",
            icon = R.drawable.ic_launcher_foreground,
            title = R.string.str_home
        ),
        isSelected = true
    ) {

    }
}