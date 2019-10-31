var pause = document.querySelector(".pause");
var audio = document.querySelector(".audio");

function togglePlay() {
	if (audio.paused) {
		audio.play();
		pause.innerHTML = "🔇";
	} else {
		audio.pause();
		pause.innerHTML = "🔊";
		pause.style.color = " #848484";
	}
};

document.querySelector('#gif1').addEventListener("click",function(event){
	document.querySelector("#gif").style.display = 'block';
	setTimeout(() => {
		window.location.href = "/board2?idMonster=1"
	}, 3000)
});

document.querySelector('#gif2').addEventListener("click",function(event){
	document.querySelector("#gif").style.display = 'block';
	setTimeout(() => {
		window.location.href = "/board2?idMonster=2"
	}, 3000)
});

document.querySelector('#gif3').addEventListener("click",function(event){
	document.querySelector("#gif").style.display = 'block';
	setTimeout(() => {
		window.location.href = "/board2?idMonster=3"
	}, 3000)
});

document.querySelector('#gif4').addEventListener("click",function(event){
	document.querySelector("#gif").style.display = 'block';
	setTimeout(() => {
		window.location.href = "/board2?idMonster=4"
	}, 3000)
});

document.querySelector('#gif5').addEventListener("click",function(event){
	document.querySelector("#gif").style.display = 'block';
	setTimeout(() => {
		window.location.href = "/board2?idMonster=5"
	}, 3000)
});
