package uz.dataunion.datashop.model

import uz.dataunion.datashop.utils.ScreenID

data class BottomNav(
    var id: ScreenID,
    var route: String,
    var icon: Int,
    var title: Int
)