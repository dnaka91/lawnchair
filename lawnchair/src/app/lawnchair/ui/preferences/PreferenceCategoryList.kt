package app.lawnchair.ui.preferences

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.compose.navigate

@Composable
fun PreferenceCategoryList(navController: NavController) {
    val context = LocalContext.current

    LazyColumn {
        items(screens(context)) { screen ->
            PreferenceCategoryLink(
                titleResId = screen.labelResId,
                subtitle = screen.description,
                iconResId = screen.iconResId,
                onClick = { navController.navigate(screen.route) })
        }
    }
}