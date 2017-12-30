window.onload = function() {
	// console.log(document.body.clientWidth);
	var music = document.getElementById("music");
	var audio = document.getElementsByTagName("audio")[0];

	// 音乐播放完之后自动停止光盘转动
	audio.addEventListener("ended", function(event) {
		music.setAttribute("class", "");
	}, false);

	// 点击音乐图标改变音乐的状态
	music.onclick = function() {
		if (audio.paused) {
			audio.play();
			this.setAttribute("class", "play");
			// this.style.animationPlayState = "running";
			// this.style.webkitAnimationPlayState = "running";
		} else {
			audio.pause();
			this.setAttribute("class", "");
			// this.style.animationPlayState = "paused";
			// this.style.webkitAnimationPlayState = "paused";
		}
	}
/*
 	// 触摸屏幕图标改变音乐状态
	music.addEventListener("touchstart", function(event) {
		if (audio.paused) {
			audio.play();
			this.setAttribute("class", "play");
		} else {
			audio.pause();
			this.setAttribute("class", "");
		}
	}, false);
*/
	// 点击屏幕开启好运2018
	page1.onclick = function() {
		page1.style.display="none";
		page2.style.display="block";
		page3.style.display="block";
		page3.style.top="100%";
		setTimeout(function(){
			page2.setAttribute("class", "page fadeOut");
			page3.setAttribute("class", "page fadeIn");
		}, 5500);
	}
/*
    // 触摸屏幕屏幕开启好运2018
	page1.addEventListener("touchstart", function(event){
		page1.style.display="none";
		page2.style.display="block";
		page3.style.display="block";
		page3.style.top="100%";
		setTimeout(function(){
			page2.setAttribute("class", "page fadeOut");
			page3.setAttribute("class", "page fadeIn");
		}, 5500);
	}, false);
*/
	
	
}