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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.BorderStroke
/**
 * Composable function that represents the search screen of the application.
 */
 
 
@Composable
fun FutureScreen() {
    Box(modifier = Modifier.fillMaxSize(), 
   contentAlignment = Alignment.Center) 
   {
 FutuerExample()
   }  
 }



/* Divider */
@Composable
fun FutuerExample() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
    
    /*******************/
    /*  Past Simple    */
    /*******************/
    
     // Start
        items(1) { 
            ElevatedCard(modifier = Modifier
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
        Text( text = "Future Simple",
              fontWeight = FontWeight.Bold,
              style = MaterialTheme.typography.titleLarge )
             //  
                
      }
        
        Row(modifier = Modifier.padding(0.dp)){
        
        Text( text = "Sub+Will+V1+O.W",
              fontWeight = FontWeight.Bold,
              color = colorResource(id = R.color.A400),
              modifier = Modifier
               .background(colorResource(id = R.color.A50),RoundedCornerShape(18.dp))
                 .height(35.dp)
              // .width(150.dp)
                .padding(start=8.dp, end=8.dp, top=5.dp) )
                
        Spacer(modifier = Modifier.width(16.dp))  
        
        
        Text( text = "ବ/ବା/ବି/ବୁ/ବେ",
              fontWeight = FontWeight.Bold,
              color = colorResource(id = R.color.A400),
              
              modifier = Modifier
              .background(colorResource(id = R.color.A50),RoundedCornerShape(18.dp) )
              .height(35.dp)
              
              // .width(150.dp)
                .padding(start=8.dp, end=8.dp, top=6.dp)
                )
                
        
      }
      
     // OutlinedCard(modifier = Modifier.padding(16.dp) )
      
     // {  TextDivider2x2Grid() }
      
              Column(modifier = Modifier.fillMaxWidth().padding(start=16.dp, top=16.dp)){
              
              Text( text = "I will eat - ମୁଁ ଖାଇବି",
                    fontSize = 18.sp,fontWeight = FontWeight.Bold)
                  
              Text( text = "I will eat rice - ମୁଁ ଭାତ ଖାଇବି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
               Text( text = "He will play - ସେ ଖେଳିବ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "You will come - ତୁମେ ଆସିବ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "We will dance - ଆମେ ନାଚିବୁ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "Niki will laugh - ନିକି ହସିବ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              
          }
         }
       }
      }
      
      // end
      
    /***********************/
    /*  Present Continuous */
    /***********************/
    
        // Start
        items(1) { 
            ElevatedCard(modifier = Modifier
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
        Text( text = "Present Continuous",
              fontWeight = FontWeight.Bold,
              style = MaterialTheme.typography.titleLarge )
             //  
                
      }
        
        Column( modifier = Modifier.padding(start=10.dp,end=10.dp),horizontalAlignment = Alignment.Start)
         {
        
        Text( text = "Sub+is/am/are/V4+O.W",
              fontWeight = FontWeight.Bold,
              color = colorResource(id = R.color.A400),
              modifier = Modifier
               .background(colorResource(id = R.color.A50),RoundedCornerShape(18.dp))
                 .height(35.dp)
              // .width(150.dp)
                .padding(start=8.dp, end=8.dp, top=5.dp) )
                
        Spacer(modifier = Modifier.height(8.dp))  
        
         // Right-aligned using Box
    Box(modifier = Modifier.fillMaxWidth()){
    
        Text( text = "ଉଛ/ଉଛି/ଉଛୁ/ଉଛେ/ଉଛନ୍ତି",
              fontWeight = FontWeight.Bold,
              color = colorResource(id = R.color.A400),
              
              modifier = Modifier
              .align(Alignment.CenterEnd)
              .background(colorResource(id = R.color.A50),RoundedCornerShape(18.dp) )
              .height(35.dp)
              
              // .width(150.dp)
                .padding(start=8.dp, end=8.dp, top=6.dp)
                )
                
        }
      }
      OutlinedCard(modifier = Modifier.padding(16.dp) ){
                TextDivider3x3Grid()
        
    }
              Column(modifier = Modifier.fillMaxWidth().padding(start=16.dp)){
              
              Text( text = "I am going - ମୁଁ ଯାଉଛି",
                    fontSize = 18.sp,fontWeight = FontWeight.Bold)
                  
              
               Text( text = "He is Playing - ସେ ଖେଳୁଛି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "They are studying - ସେମାନେ ପଡୁଛନ୍ତି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "Rita is eating - ରିତା ଖାଉଛି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "You are writing - ତୁମେ ଲେଖୁଛ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "Children are crying - ପିଲାମାନେ ଖାନ୍ଦୁଛନ୍ତି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
          }
         }
       }
      }
      
      // end
      
       
    /*********************/
    /*  Present Perfect  */
    /*********************/
    
        // Start
        items(1) { 
            ElevatedCard(modifier = Modifier
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
        Text( text = "Present Perfect",
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
      
      // end
        
    /********************************/
    /*  Present Perfect Continuous  */
    /********************************/
        
        // Start
        items(1) { 
            ElevatedCard(modifier = Modifier
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
        Text( text = "Present Perfect Continuous",
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
      
      // end
    }
}