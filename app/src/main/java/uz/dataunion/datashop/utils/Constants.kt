package uz.dataunion.datashop.utils

import uz.dataunion.datashop.R
import uz.dataunion.datashop.model.BottomNav

enum class ScreenID {
    HomeScreen,
    FavoriteScreen,
    ShoppingCartScreen,
    ProfileScreen,
}

var ScreensList = listOf(
    BottomNav(
        id = ScreenID.HomeScreen,
        route = "home",
        icon = R.drawable.ic_launcher_foreground,
        title = R.string.str_home,
    ),
    BottomNav(
        id = ScreenID.FavoriteScreen,
        route = "favorite",
        icon = R.drawable.ic_launcher_foreground,
        title = R.string.str_favorite
    ),
    BottomNav(
        id = ScreenID.ShoppingCartScreen,
        route = "shoppingCart",
        icon = R.drawable.ic_launcher_foreground,
        title = R.string.str_shopping_cart
    ),
    BottomNav(
        id = ScreenID.ProfileScreen,
        route = "profile",
        icon = R.drawable.ic_launcher_foreground,
        title = R.string.str_profile
    )
)