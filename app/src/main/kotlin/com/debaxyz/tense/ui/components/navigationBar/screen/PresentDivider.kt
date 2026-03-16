package com.debaxyz.tense.ui.components.navigationBar.screen


import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.background
import androidx.compose.ui.res.colorResource
import com.debaxyz.tense.R

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import androidx.compose.ui.text.style.TextOverflow
/**
 * Composable function that represents the home screen of the application.
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PresentSimple() {

Box(modifier = Modifier.fillMaxSize(), 
   contentAlignment = Alignment.Center) {
    
Column(modifier = Modifier.fillMaxWidth()
   .padding(16.dp))
{
    OutlinedCard(modifier = Modifier
            .fillMaxWidth()
            .padding(bottom=2.dp),
        shape = RoundedCornerShape(topStart=30.dp, topEnd=30.dp,bottomStart=30.dp, bottomEnd=30.dp),
      //  elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        
        ) 
     {
    Column(modifier = Modifier.fillMaxWidth()
   .padding(10.dp),horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center )
    
     {
     Column(modifier = Modifier.padding(10.dp)){
        Text( text = "Present Simple",
              fontWeight = FontWeight.Bold,
              style = MaterialTheme.typography.titleLarge )
             //  
                
      }
        
        Row(modifier = Modifier.padding(0.dp)){
        
        Text( text = "Sub+V1/V5+O.W",
              fontWeight = FontWeight.Bold,
              color = colorResource(id = R.color.A400),
              modifier = Modifier
               .background(colorResource(id = R.color.A50),RoundedCornerShape(18.dp))
                 .height(35.dp)
              // .width(150.dp)
                .padding(start=8.dp, end=8.dp, top=5.dp) )
                
        Spacer(modifier = Modifier.width(16.dp))  
        
        
        Text( text = "ଏ/ଆ/ଉ/ଆନ୍ତି",
              fontWeight = FontWeight.Bold,
              color = colorResource(id = R.color.A400),
              
              modifier = Modifier
              .background(colorResource(id = R.color.A50),RoundedCornerShape(18.dp) )
              .height(35.dp)
              
              // .width(150.dp)
                .padding(start=8.dp, end=8.dp, top=6.dp)
                )
                
        
      }
      OutlinedCard(modifier = Modifier.padding(16.dp) ){
                TextDivider2x2Grid()
        
    }
              Column(modifier = Modifier.fillMaxWidth().padding(start=16.dp)){
              
              Text( text = "I eat - ମୁଁ ଖାଏ",
                    fontSize = 18.sp,fontWeight = FontWeight.Bold)
                  
              Text( text = "I eat rice - ମୁଁ ଭାତ ଖାଏ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
               Text( text = "He comes - ସେ ଆସନ୍ତି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "Priya studies - ପ୍ରିୟା ପଡ଼େ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "We eat - ଆମେ ଖାଉ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "You dance- ତୁମେ ନାଚ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "They Play- ସେମାନେ ଖେଳନ୍ତି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
          }
         }
       }
     }
   }  
 }
 



/* Divider */

@Composable
fun TextDivider2x2Grid() {
    Column(modifier = Modifier.fillMaxWidth()) {
        // First Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min), // IntrinsicSize.Min makes children match the height of the tallest child
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "V1",
                modifier = Modifier
               // .weight(1f)
                .width(80.dp)
               .padding(start=30.dp),
                fontWeight = FontWeight.Bold
            )
            VerticalDivider(
                modifier = Modifier.fillMaxHeight(),
                thickness = 1.dp
                //color = Color.Gray
            )
            Text(
                "I/You/We/They & Plural nouns",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
               .weight(1f)
               .padding(8.dp),
         
               fontWeight = FontWeight.Bold
                
            )
        }

        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp
            //color = Color.Gray
        )

        // Second Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "V5",
                modifier = Modifier
               // .weight(1f)
                .width(80.dp)
                .padding(start=30.dp),
                fontWeight = FontWeight.Bold
            )
            VerticalDivider(
                modifier = Modifier.fillMaxHeight(),
                thickness = 1.dp
              //  color = Color.Gray
            )
            Text(
                "He/She/It & Singular nouns",
                modifier = Modifier
                 .weight(1f)
                .padding(8.dp),
                fontWeight = FontWeight.Bold
              //   .width(100.dp)
            )
        }
    }
}

   
    /*********************/
    /*  Present Perfect  */
    /*********************/

@Composable
fun PresentPerfectDivider2x2Grid() {
    Column(modifier = Modifier.fillMaxWidth()) {
        // First Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min), // IntrinsicSize.Min makes children match the height of the tallest child
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Have",
                modifier = Modifier
               // .weight(1f)
                .width(80.dp)
               .padding(start=30.dp),
                fontWeight = FontWeight.Bold
            )
            VerticalDivider(
                modifier = Modifier.fillMaxHeight(),
                thickness = 1.dp
                //color = Color.Gray
            )
            Text(
                "I/You/We/They & Plural nouns",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
               .weight(1f)
               .padding(8.dp),
         
               fontWeight = FontWeight.Bold
                
            )
        }

        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp
            //color = Color.Gray
        )

        // Second Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Has",
                modifier = Modifier
               // .weight(1f)
                .width(80.dp)
                .padding(start=30.dp),
                fontWeight = FontWeight.Bold
            )
            VerticalDivider(
                modifier = Modifier.fillMaxHeight(),
                thickness = 1.dp
              //  color = Color.Gray
            )
            Text(
                "He/She/It & Singular nouns",
                modifier = Modifier
                 .weight(1f)
                .padding(8.dp),
                fontWeight = FontWeight.Bold
              //   .width(100.dp)
            )
        }
    }
}




@Composable
fun TextDivider3x3Grid() {
    Column(modifier = Modifier.fillMaxWidth()) {
        // First Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min), // IntrinsicSize.Min makes children match the height of the tallest child
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "is",
                modifier = Modifier
               // .weight(1f)
                .width(80.dp)
               .padding(start=30.dp),
                fontWeight = FontWeight.Bold
            )
            VerticalDivider(
                modifier = Modifier.fillMaxHeight(),
                thickness = 1.dp
                //color = Color.Gray
            )
            Text(
                "He/She/It & Singular nouns",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
               .weight(1f)
               .padding(8.dp),
         
               fontWeight = FontWeight.Bold
                
            )
        }

        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp
            //color = Color.Gray
        )

        // Second Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "am",
                modifier = Modifier
               // .weight(1f)
                .width(80.dp)
                .padding(start=30.dp),
                fontWeight = FontWeight.Bold
            )
            VerticalDivider(
                modifier = Modifier.fillMaxHeight(),
                thickness = 1.dp
              //  color = Color.Gray
            )
            Text(
                "I",
                modifier = Modifier
                 .weight(1f)
                .padding(8.dp),
                fontWeight = FontWeight.Bold
              //   .width(100.dp)
            )
        }
        
        
        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp
            //color = Color.Gray
        )
        
           // Third Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "are",
                modifier = Modifier
               // .weight(1f)
                .width(80.dp)
                .padding(start=30.dp),
                fontWeight = FontWeight.Bold
            )
            VerticalDivider(
                modifier = Modifier.fillMaxHeight(),
                thickness = 1.dp
              //  color = Color.Gray
            )
            Text(
                "You/We/They & Plural nouns",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                 .weight(1f)
                .padding(8.dp),
                fontWeight = FontWeight.Bold
              //   .width(100.dp)
            )
        }
        
    }
}
