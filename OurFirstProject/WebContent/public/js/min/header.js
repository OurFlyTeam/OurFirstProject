//鼠标移动到头菜单
$("#header-menu-Con ul li").hover(function(ev) {//鼠标悬停上面实现什么功能
	console.log("输出日志");		
	$(this).css("background","#80ffff");
}, function(ev) {//鼠标移开实现什么功能
	$(this).css("background","#f10f10f10");
});


//自动获取时间
setInterval("getCurDate()", 100);

var getCurDate = function getCurDate() {
	var d = new Date();
	var week;
	switch (d.getDay()) {
	case 1:
		week = "星期一";
		break;
	case 2:
		week = "星期二";
		break;
	case 3:
		week = "星期三";
		break;
	case 4:
		week = "星期四";
		break;
	case 5:
		week = "星期五";
		break;
	case 6:
		week = "星期六";
		break;
	default:
		week = "星期天";
	}
	var years = d.getFullYear();
	var month = add_zero(d.getMonth() + 1);
	var days = add_zero(d.getDate());
	var hours = add_zero(d.getHours());
	var minutes = add_zero(d.getMinutes());
	var seconds = add_zero(d.getSeconds());
	var ndate = years + "年" + month + "月" + days + "日 " + hours + ":" + minutes
			+ ":" + seconds + " " + week;
	var divT = document.getElementById("time");
	divT.innerHTML = ndate;
}


var add_zero = function add_zero(temp) {
	if (temp < 10)
		return "0" + temp;
	else
		return temp;
}


