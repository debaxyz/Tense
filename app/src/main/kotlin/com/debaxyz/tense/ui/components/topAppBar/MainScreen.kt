package com.debaxyz.tense.ui.components.topAppBar


import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
//import androidx.compose.material.icons.automirrored.sharp.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.debaxyz.tense.ui.components.navigationBar.screen.*
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.graphics.vector.ImageVector

import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.material3.IconButtonColors
import com.debaxyz.tense.R

sealed class Screen(
    val route: String,
    val label: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector
) {
    object Present : Screen("present", "Present", Icons.Filled.Home, Icons.Outlined.Home)
    object Past : Screen("past", "Past", Icons.Filled.Favorite, Icons.Outlined.FavoriteBorder)
    object Future : Screen("future", "Future", Icons.Filled.Star, Icons.Outlined.StarBorder)
}

val bottomNavItems = listOf(Screen.Present, Screen.Past, Screen.Future)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    
    // Create scroll behavior for the TopAppBar
   // val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    
    Scaffold(
        // Apply the nested scroll modifier to t=he Scaffold
      //  modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        
        topBar = {
            TopAppBar( modifier = Modifier.fillMaxWidth().padding(16.dp) .height(80.dp),
             //  .width(150.dp),
                title = { 
                    // Dynamically set title based on current destination
                    val navBackStackEntry by navController.currentBackStackEntryAsState()
                    val currentDestination = navBackStackEntry?.destination
                    
                    val currentScreen = bottomNavItems.find { screen ->
                        currentDestination?.hierarchy?.any { it.route == screen.route } == true
                    }
                    
                    Text(currentScreen?.label ?: "Debashis")
                    
                },
               
                
                navigationIcon = { 
                    FilledTonalIconButton(onClick = { /* handle back */ },
                          modifier = Modifier.size(35.dp), // Adds space to the right
  
                         // colors = IconButtonDefaults.filledIconButtonColors( containerColor = MaterialTheme.colorScheme.secondary,  contentColor = MaterialTheme.colorScheme.onSecondary),
                        
                          shape = CircleShape) {
                        //  Spacer(modifier = Modifier.height(16.dp))  
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            modifier = Modifier.size(17.dp) // Custom icon size
                          //  color = colorResource(id = R.color.A400)
                            
                        )
                    }
                    Spacer(modifier = Modifier.width(50.dp))  
                },
                
                actions = {
                    FilledTonalIconButton(onClick = { /* handle action */ },
                          modifier = Modifier.size(35.dp),
                         // colors = IconButtonDefaults.filledIconButtonColors( containerColor = MaterialTheme.colorScheme.outlineVariant,  contentColor = MaterialTheme.colorScheme.onSecondary),
                          shape = CircleShape) {
                        Icon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = "Settings",
                            modifier = Modifier.size(17.dp) // Custom icon size
                            
                        )
                    }
                },
                       // Set elevation here (Material 3)
        /*
                colors = TopAppBarDefaults.topAppBarColors(
                   // containerColor = MaterialTheme.colorScheme.primaryContainer,
                   // titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                */
                // Add the scroll behavior to the TopAppBar
              //  scrollBehavior = scrollBehavior
            )
        },
        
        bottomBar = {
            ShortNavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                bottomNavItems.forEach { screen ->
                    ShortNavigationBarItem(
                        icon = { 
                            Icon(
                                if (currentDestination?.hierarchy?.any { it.route == screen.route } == true) 
                                    screen.selectedIcon 
                                else 
                                    screen.unselectedIcon,
                                contentDescription = screen.label
                            ) 
                        },
                        label = { Text(screen.label) },
                        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                        onClick = {
                            navController.navigate(screen.route) {
                                // Pop up to the start destination to avoid building up a large stack
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        // This NavHost manages the actual screen swapping
        NavHost(
            navController = navController, 
            startDestination = Screen.Present.route, 
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Present.route) { PresentScreen() }
            composable(Screen.Past.route) { PastScreen() }
            composable(Screen.Future.route) { FutureScreen() }
        }
    }
}