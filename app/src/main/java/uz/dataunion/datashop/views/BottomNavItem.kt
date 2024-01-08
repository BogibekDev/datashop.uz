package uz.dataunion.datashop.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.dataunion.datashop.R
import uz.dataunion.datashop.model.BottomNav
import uz.dataunion.datashop.utils.ScreenID

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNavItem(
    item: BottomNav,
    isSelected: Boolean = false,
    badge: Int = 0,
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
            },
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Spacer(
            modifier = Modifier
                .fillMaxWidth(.86f)
                .height(3.dp)
                .background(color = if (isSelected) Color.White else Color.Transparent)

        )

        Spacer(modifier = Modifier.height(8.dp))

        BadgedBox(
            modifier = Modifier.padding(top = 5.dp),
            badge = {
                Badge(
                    modifier = Modifier.size(18.dp),
                    containerColor = if (badge > 0) Color.White else Color.Transparent,
                    contentColor = if (badge > 0) Color.Red else Color.Transparent
                ) {
                    Text(
                        text = "$badge",
                        fontSize = 10.sp
                    )
                }
            }
        ) {
            Icon(
                modifier = Modifier
                    .size(24.dp),
                painter = painterResource(id = item.icon),
                contentDescription = null,
                tint = Color.White
            )
        }

        Text(
            text = stringResource(id = item.title),
            fontSize = 12.sp,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(5.dp))
    }
}

@Preview()
@Composable
fun BottomNavItemPreview() {
    BottomNavItem(
        item = BottomNav(
            id = ScreenID.HomeScreen,
            route = "cheque",
            icon = R.drawable.ic_home,
            title = R.string.str_home
        ),
        isSelected = true,
        badge = 2
    ) {

    }
}