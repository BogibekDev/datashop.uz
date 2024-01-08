package uz.dataunion.datashop.model

import uz.dataunion.datashop.utils.ScreenID

data class BottomNav(
    val id: ScreenID,
    val route: String,
    val icon: Int,
    val title: Int,
)