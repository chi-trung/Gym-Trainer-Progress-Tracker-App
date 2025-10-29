package com.example.nutrifit.ui.screens.createprofile

import android.R.attr.maxHeight
import android.R.attr.onClick
import android.R.attr.x
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.example.nutrifit.R
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.*
import androidx.compose.material3.Surface
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ripple
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalConfiguration


@Composable
fun CreateProfile() {
    var name by remember { mutableStateOf("") } // để lưu giá trị nhập
    val configuration = LocalConfiguration.current
    val screenHeightDp = configuration.screenHeightDp.dp
    val bottomPadding = screenHeightDp * 0.2f
    var expanded by remember { mutableStateOf(false) }
    val interactionSource = remember { MutableInteractionSource() }
    var genderExpanded by remember { mutableStateOf(false) }
    var ageExpanded by remember { mutableStateOf(false) }
    var heightExpanded by remember { mutableStateOf(false) }
    var weightExpanded by remember { mutableStateOf(false) }

    var selectedGender by remember { mutableStateOf("...") }
    var selectedAge by remember { mutableStateOf("...") }
    var selectedHeight by remember { mutableStateOf("...") }
    var selectedWeight by remember { mutableStateOf("...") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = (20).dp)
            .padding(WindowInsets.statusBars.asPaddingValues()),
        horizontalAlignment = Alignment.CenterHorizontally,


    ) {

        // thanh tien trinh
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(3.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.vector_1),
                contentDescription = null,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                contentScale = ContentScale.FillBounds
            )

            Spacer(modifier = Modifier.width(1.dp))

            Image(
                painter = painterResource(id = R.drawable.vector_2),
                contentDescription = null,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                contentScale = ContentScale.FillBounds
            )
        }

        Spacer(modifier = Modifier .height(20.dp))

        Row(){
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                modifier = Modifier
                    .height(80.dp)
                    .width(80.dp)
                    .offset(x = (-5).dp)


            )

            Text(
                text = "Chào mừng bạn đến với",
                style = MaterialTheme.typography.headlineSmall,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = colorScheme.onBackground,
            )
        }
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color(0xFF1AC9AC),
                        fontWeight = FontWeight.Bold
                    )
                ) { append("NUTRI") }
                withStyle(
                    style = SpanStyle(
                        color = colorScheme.onBackground,
                        fontWeight = FontWeight.Bold
                    )
                ) { append(" - ") }
                withStyle(
                    style = SpanStyle(
                        color = Color.Red,
                        fontWeight = FontWeight.Bold
                    )
                ) { append("FIT") }
            },
            style = MaterialTheme.typography.headlineSmall,
            fontSize = 24.sp,
            modifier = Modifier.offset(y = (-43).dp, x = (-26).dp)
        )

        //khung thong tin ca nhan
        Column(modifier = Modifier. offset(y = -30.dp)) {
            Box() {
                //khung
                Image(
                    painter = painterResource(id = R.drawable.rectangle_80),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxHeight(0.9f)
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                        .clip(RoundedCornerShape(16.dp))
                        ,
                            contentScale = ContentScale.Crop

                )
                //tieu de

                Text(
                    text = "Thông tin cá nhân",
                    style = MaterialTheme.typography.headlineSmall,
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .offset(y = 20.dp, x = 40.dp)
                )
                //can giua cac thanh phan


                Column(horizontalAlignment = Alignment.CenterHorizontally, // căn giữa theo trục ngang
                    modifier = Modifier.fillMaxSize() .offset(y = 65.dp)
                ){
                    //gop 3 lop avt
                    Box() {
                        Image(
                            painter = painterResource(id = R.drawable.ellipse_2),
                            contentDescription = null,
                            modifier = Modifier
                                .size(120.dp)
                                .offset(x=-5.dp, y =-5.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.ellipse_3),
                            contentDescription = null,
                            modifier = Modifier
                                .size(110.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.ellipse_1),
                            contentDescription = null,
                            modifier = Modifier
                                .size(110.dp),
                        )
                    }
                    Spacer(modifier = Modifier. height(10.dp))
                    Text(
                        text = "Tải lên ảnh đại diện",
                        style = MaterialTheme.typography.headlineSmall,
                        fontSize = 15.sp,
                        modifier = Modifier
                            .clickable{}
                    )

                    Spacer(modifier = Modifier. height(30.dp))


                    OutlinedTextField(
                        value = name,
                        onValueChange = { name = it },
                        label = {
                            Text("Tên của bạn",
                                style = MaterialTheme.typography.headlineSmall,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold
                        ) },       // nhãn trên TextField
                        placeholder = { Text("Nhập họ tên") }, // placeholder bên trong
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(70.dp)
                            .padding(horizontal = 25.dp),
                        singleLine = true,
                        textStyle = androidx.compose.ui.text.TextStyle(fontSize = 16.sp)
                    )

                    Spacer(modifier = Modifier. height(20.dp))
                    //khung nho hien thi 4 nut bam dien thong tin ca nhan
                    Box(modifier = Modifier
                        .fillMaxSize()
                        , // chiếm toàn màn hình
                        contentAlignment = Alignment.Center,
                        ) {
                        Image(
                            painter = painterResource(id = R.drawable.khungnho),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth(0.85f) // Chiếm 80% chiều ngang (cách 2 bên 10% mỗi bên)
                                .fillMaxHeight(0.5f)
                                .offset(y =-80.dp)
                                .clip(RoundedCornerShape(16.dp)),
                            contentScale = ContentScale.Crop
                        )
                        Column(modifier = Modifier .padding(bottom = 130.dp)) {
                            // gioi tinh do tuoi
                            Row() {
                                //khung gioi tinh
                                Box() {
                                    Image(
                                        painter = painterResource(id = R.drawable.khungnutbam),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(140.dp)
                                    )

                                    Text(
                                        text = "Giới tính",
                                        style = MaterialTheme.typography.headlineSmall,
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Gray,
                                        modifier = Modifier.offset(x = 65.dp, y = 35.dp)
                                    )

                                    Column(modifier = Modifier.offset(x = 60.dp, y = 50.dp)) {
                                        Surface(
                                            color = Color.Transparent,
                                            modifier = Modifier
                                                .clickable(
                                                    interactionSource = remember { MutableInteractionSource() },
                                                    indication = ripple(
                                                        bounded = true,
                                                        color = Color.Gray.copy(alpha = 0.3f)
                                                    )
                                                ) {
                                                    genderExpanded = true
                                                }
                                        ) {
                                            Text(
                                                text = selectedGender,
                                                modifier = Modifier.padding(16.dp),
                                                color = Color.Black,
                                                fontSize = 15.sp

                                            )
                                        }

                                        DropdownMenu(
                                            shape = RoundedCornerShape(25.dp),
                                            expanded = genderExpanded,
                                            onDismissRequest = { genderExpanded = false }
                                        ) {
                                            DropdownMenuItem(
                                                text = { Text("Nam") },
                                                onClick = {
                                                    selectedGender = "Nam"
                                                    genderExpanded = false
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { Text("Nữ") },
                                                onClick = {
                                                    selectedGender = "Nữ"
                                                    genderExpanded = false
                                                }
                                            )
                                        }
                                    }

                                    Image(
                                        painter = painterResource(id = R.drawable.khungtronnho),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(50.dp)
                                            .offset(x = 15.dp, y = 50.dp)
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.gioitinh),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(30.dp)
                                            .offset(x = 25.dp, y = 60.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.fillMaxWidth(0.06f))
                                //khung do tuoi
                                Box() {
                                    Image(
                                        painter = painterResource(id = R.drawable.khungnutbam),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(140.dp)
                                    )
                                    Text(
                                        text = "Độ tuổi",
                                        style = MaterialTheme.typography.headlineSmall,
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Gray,
                                        modifier = Modifier.offset(x = 65.dp, y = 35.dp)
                                    )
                                    Column(modifier = Modifier.offset(x = 60.dp, y = 50.dp)) {
                                        Surface(
                                            color = Color.Transparent,
                                            modifier = Modifier
                                                .clickable(
                                                    interactionSource = remember { MutableInteractionSource() },
                                                    indication = ripple(
                                                        bounded = true,
                                                        color = Color.Gray.copy(alpha = 0.3f)
                                                    )
                                                ) {
                                                    ageExpanded = true
                                                }
                                        ) {
                                            Text(
                                                text = selectedAge,
                                                modifier = Modifier.padding(16.dp),
                                                color = Color.Black,
                                                fontSize = 15.sp
                                            )
                                        }

                                        DropdownMenu(
                                            shape = RoundedCornerShape(25.dp),
                                            expanded = ageExpanded,
                                            onDismissRequest = { ageExpanded = false }
                                        ) {
                                            // Các lựa chọn độ tuổi
                                            DropdownMenuItem(
                                                text = { Text("18-25") },
                                                onClick = {
                                                    selectedAge = "18-25"
                                                    ageExpanded = false
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { Text("26-35") },
                                                onClick = {
                                                    selectedAge = "26-35"
                                                    ageExpanded = false
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { Text("36-45") },
                                                onClick = {
                                                    selectedAge = "36-45"
                                                    ageExpanded = false
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { Text("46+") },
                                                onClick = {
                                                    selectedAge = "46+"
                                                    ageExpanded = false
                                                }
                                            )
                                        }
                                    }
                                    Image(
                                        painter = painterResource(id = R.drawable.khungtronnho),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(50.dp)
                                            .offset(x = 15.dp, y = 50.dp)
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.dotuoi),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(30.dp)
                                            .offset(x = 25.dp, y = 60.dp)
                                    )
                                }
                            }
                            // chieu cao can nang
                            Row(modifier = Modifier .offset(y = -40.dp)){
                                //khung chieu cao
                                Box() {
                                    Image(
                                        painter = painterResource(id = R.drawable.khungnutbam),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(140.dp)
                                    )
                                    Text(
                                        text = "Chiều cao",
                                        style = MaterialTheme.typography.headlineSmall,
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Gray,
                                        modifier = Modifier.offset(x = 65.dp, y = 35.dp)
                                    )

                                    Column(modifier = Modifier.offset(x = 60.dp, y = 50.dp)) {
                                        Surface(
                                            color = Color.Transparent,
                                            modifier = Modifier
                                                .clickable(
                                                    interactionSource = remember { MutableInteractionSource() },
                                                    indication = ripple(
                                                        bounded = true,
                                                        color = Color.Gray.copy(alpha = 0.3f)
                                                    )
                                                ) {
                                                    heightExpanded = true
                                                }
                                        ) {
                                            Text(
                                                text = selectedHeight,
                                                modifier = Modifier.padding(16.dp),
                                                color = Color.Black,
                                                fontSize = 15.sp
                                            )
                                        }

                                        DropdownMenu(
                                            shape = RoundedCornerShape(25.dp),
                                            expanded = heightExpanded,
                                            onDismissRequest = { heightExpanded = false }
                                        ) {
                                            // Các lựa chọn chiều cao
                                            DropdownMenuItem(
                                                text = { Text("150-160 cm"
                                                ) },
                                                onClick = {
                                                    selectedHeight = ">150 cm"
                                                    heightExpanded = false
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { Text("161-170 cm") },
                                                onClick = {
                                                    selectedHeight = ">161 cm"
                                                    heightExpanded = false
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { Text("171-180 cm") },
                                                onClick = {
                                                    selectedHeight = ">171 cm"
                                                    heightExpanded = false
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { Text("181-190 cm") },
                                                onClick = {
                                                    selectedHeight = ">181 cm"
                                                    heightExpanded = false
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { Text("191+ cm") },
                                                onClick = {
                                                    selectedHeight = ">191 cm"
                                                    heightExpanded = false
                                                }
                                            )
                                        }
                                    }
                                    Image(
                                        painter = painterResource(id = R.drawable.khungtronnho),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(50.dp)
                                            .offset(x = 15.dp, y = 50.dp)
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.chieucao),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(30.dp)
                                            .offset(x = 25.dp, y = 60.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.fillMaxWidth(0.06f))
                                //khung can nang

                                Box() {
                                    Image(
                                        painter = painterResource(id = R.drawable.khungnutbam),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(140.dp)
                                    )
                                    Text(
                                        text = "Cân nặng",
                                        style = MaterialTheme.typography.headlineSmall,
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Gray,
                                        modifier = Modifier.offset(x = 65.dp, y = 35.dp)
                                    )
                                    Column(modifier = Modifier.offset(x = 60.dp, y = 50.dp)) {
                                        Surface(
                                            color = Color.Transparent,
                                            modifier = Modifier
                                                .clickable(
                                                    interactionSource = remember { MutableInteractionSource() },
                                                    indication = ripple(
                                                        bounded = true,
                                                        color = Color.Gray.copy(alpha = 0.3f)
                                                    )
                                                ) {
                                                    weightExpanded = true
                                                }
                                        ) {
                                            Text(
                                                text = selectedWeight,
                                                modifier = Modifier.padding(16.dp),
                                                color = Color.Black,
                                                fontSize = 15.sp
                                            )
                                        }

                                        DropdownMenu(
                                            shape = RoundedCornerShape(25.dp),
                                            expanded = weightExpanded,
                                            onDismissRequest = { weightExpanded = false }
                                        ) {
                                            // Các lựa chọn cân nặng
                                            DropdownMenuItem(
                                                text = { Text("40-50 kg") },
                                                onClick = {
                                                    selectedWeight = "40-50 kg"
                                                    weightExpanded = false
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { Text("51-60 kg") },
                                                onClick = {
                                                    selectedWeight = "51-60 kg"
                                                    weightExpanded = false
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { Text("61-70 kg") },
                                                onClick = {
                                                    selectedWeight = "61-70 kg"
                                                    weightExpanded = false
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { Text("71-80 kg") },
                                                onClick = {
                                                    selectedWeight = "71-80 kg"
                                                    weightExpanded = false
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { Text("81-90 kg") },
                                                onClick = {
                                                    selectedWeight = "81-90 kg"
                                                    weightExpanded = false
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { Text("91+ kg") },
                                                onClick = {
                                                    selectedWeight = "91+ kg"
                                                    weightExpanded = false
                                                }
                                            )
                                        }
                                    }
                                    Image(
                                        painter = painterResource(id = R.drawable.khungtronnho),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(50.dp)
                                            .offset(x = 15.dp, y = 50.dp)
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.cannang),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(30.dp)
                                            .offset(x = 25.dp, y = 60.dp)
                                    )
                                }

                        }
                        }//
                    }
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom,
                    modifier = Modifier
                        .fillMaxSize()                // chiếm toàn màn hình để có thể canh dưới
                        .padding(bottom = 20.dp)      // cách đáy một chút cho đẹp
                ) {
                    Text(
                        text = "Tiếp tục",
                        style = MaterialTheme.typography.headlineSmall,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray,
                        modifier = Modifier
                            .clickable {
                                println("Chức năng đang phát triển")
                            }
                    )
                }

            }
        } //ket thuc column tong
    }
}


