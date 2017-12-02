function init() {
	setInterval("changeImg()", 3000);
}

var i = 1;

function changeImg() {
	i++;
	document.getElementById("img").src = "img/" + i + ".jpg";
	if(i == 5) i = 0;
}

//变量只能用于方法作为形参传入，不能作为具体数赋值
//加入标识符，减少重复代码
function changeColor(id, flag) {
	if(flag == "cornflowerblue") document.getElementById(id).style.backgroundColor = "cornflowerblue";
	else if(flag == "white") document.getElementById(id).style.backgroundColor = "white";
}