
function init(){
	setInterval("changeImg()",3000);
    time=setInterval("showAd()",3000);
    //注意：time不加var是一个成员变量，在其他函数中可以直接用。
	//如果加了var，就成了局部变量，只能在本函数中用。
}
	var i=1;
	function changeImg(){
		i++;
		document.getElementById("img").src="../img/"+i+".jpg";
		if(i==3)
			i=0;
}
//2.书写显示图片函数
function showAd(){
//3.获取广告图片所在的位置
	var adEle=document.getElementById("img1");
	//4.修改图片属性让其显示
	adEle.style.display="block";
	//5.清除显示图片定时操作
	clearInterval(time);//成员变量不需要加引号
	//6.设置隐藏图片的定时操作
	time1=setInterval("hiddenAd()",3000);
}
	//7.书写隐藏图片的函数
function hiddenAd(){
	//8.获取广告图片位置并设置其属性
	document.getElementById("img1").style.display="none";
	//注意：none block一定要加引号  要不然没有效果。
	//9.清除隐藏图片的定时操作
	clearInterval(time1);
}
