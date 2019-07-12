this.timer(1800)
fullScreen()

/*
 * 浏览器全屏
 */
function fullScreen() {

	  var el = document.documentElement;

	  var rfs = el.requestFullScreen || el.webkitRequestFullScreen;

	  if(typeof rfs != "undefined" && rfs) {

	    rfs.call(el);

	  } else if(typeof window.ActiveXObject != "undefined") {

	    var wscript = new ActiveXObject("WScript.Shell");

	    if(wscript != null) {

	        wscript.SendKeys("{F11}");

	    }

	}else if (el.msRequestFullscreen) {

		el.msRequestFullscreen();

	}else if(el.oRequestFullscreen){
		
		el.oRequestFullscreen();
		
    }else{
    	
    	swal({   title: "浏览器不支持全屏调用！",   text: "请更换浏览器或按F11键切换全屏！(3秒后自动关闭)", type: "error",  timer: 3000 });	
	       
    }

}

/*
 *倒计时 
 */
function timer(intDiff){
    window.setInterval(function(){
    var day=0,
        hour=0,
        minute=0,
        second=0;//时间默认值        
    if(intDiff > 0){
        minute = Math.floor(intDiff / 60) - (day * 24 * 60) - (hour * 60);
        second = Math.floor(intDiff) - (day * 24 * 60 * 60) - (hour * 60 * 60) - (minute * 60);
    }
    if (minute <= 9) minute = '0' + minute;
    if (second <= 9) second = '0' + second;
    $('#minute_show').html('<s></s>'+minute+'分');
    $('#second_show').html('<s></s>'+second+'秒');
    intDiff--;
    }, 1000);
} 



/*
 * 浏览器退出全屏
 */
function exitFullScreen() {

	  var el = document;

	  var cfs = el.cancelFullScreen || el.webkitCancelFullScreen || el.exitFullScreen;

	  if(typeof cfs != "undefined" && cfs) {

	    cfs.call(el);

	  } else if(typeof window.ActiveXObject != "undefined") {

	    var wscript = new ActiveXObject("WScript.Shell");

	    if(wscript != null) {

	        wscript.SendKeys("{F11}");

	    }

	}else if (el.msExitFullscreen) {

		el.msExitFullscreen();

	}else if(el.oRequestFullscreen){
		
		el.oCancelFullScreen();
		
    }else{ 
   	
    	swal({   title: "浏览器不支持全屏调用！",   text: "请更换浏览器或按F11键切换全屏！(3秒后自动关闭)", type: "error",  timer: 3000 });	
    }  
	  
}