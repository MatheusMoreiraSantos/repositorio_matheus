setInterval(showTime, 1000);
function showTime(){
   let time = new Date();
   let hour = time.getHours();
   let min  = time.getMinutes();
   let sec  = time.getSeconds();
   am_pm = "AM";
   
   if (hour > 12){
        hour-=12;
        am_pm = "PM";
   } if (hour ==00) {
        hr = 12;
        am_pm = "AM";
   }
   hour = hour < 10 ? "0" + hour : hour;
   min = min < 10 ? "0"+ min : min;
   sec = sec < 10 ? "0"+ sec : sec;

   let currentTime = hour + " : " + min + " : " +
   sec + " " + am_pm;

   document.getElementById("relogio").innerHTML = currentTime;

}

let hrs = 0;
let mn  = 0;
let sg  = 0;
let ml  = 0;
let cron;
document.form_main.start.onclick = ()=> start();
document.form_main.stop.onclick  = ()=> start();
document.form_main.reset.onclick = ()=> start();

function start(){
    stop();
    cron = setInterval(()=>{timer();}, 10);
}

function stop(){
    clearInterval(cron);
}

function reset(){
    hrs = 0;
    mn  = 0;
    sg  = 0;
    ml  = 0;
    document.getElementById("hrs").innerText = '00';
    document.getElementById("mn").innerText = '00';
    document.getElementById("sg").innerText = '00';
    document.getElementById("ml").innerText = '00';
}

function timer(){
    if ((ml += 10)== 1000){
        ml = 0;
        sg++;
    } if (sg == 60){
        sg = 0; 
        mn++;
    } if (mn == 60){
        mn = 0;
        hrs++;
    }
    document.getElementById("hrs").innerText = returnData(hrs);
    document.getElementById("mn").innerText = returnData(mn);
    document.getElementById("sg").innerText = returnData(sg);
    document.getElementById("ml").innerText = returnData(ml);
}

function returnData(input){
    return input >= 10 ? input : '0${input}';
}














