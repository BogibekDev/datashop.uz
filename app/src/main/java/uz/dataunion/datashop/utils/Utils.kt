package uz.dataunion.datashop.utils

import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ramcosta.composedestinations.spec.Direction

fun Long.moneyType(): String {
    return this.toString().moneyType() + " so'm"
}

fun String.moneyType(): String {
    //1000000 -> 1 000 000 so'm
    return this
        .reversed()
        .chunked(3)
        .joinToString(" ")
        .reversed()
}

fun DestinationsNavigator.screenNavigate(route: Direction) {
    this.navigate(route) {
        popUpTo(popUpToId) {
            saveState = true
        }
        launchSingleTop = true
        restoreState = true
    }
}