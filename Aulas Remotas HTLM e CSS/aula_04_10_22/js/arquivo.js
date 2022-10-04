//Declaração de variaveis Globais de contagem de tempo;
let countdow;
//Selecionar a div onde o tempo será mostrado;
const timerDisplay = document.querySelector('.display__time-left');
//Selecionar a div aonde o horário após o timer será mostrado;
const endTime = document.querySelector('.display__end-time'); //querySelector recebe/seleciona uma classe
//Seleciona os botões que determinam o tempo;
const buttons = document.querySelectorAll('[data-time]'); 
//Seleciona todo o grupo de botões, por isso utilizou também o array;




//Função de contagem de tempo;
function timer(seconds){
    //quando iniciar o timer limpar qualquer outro timer que exista;
    clearInterval(countdow);

    //verifica inicio da contagem de tempo;
    const now = Date.now(); //conts now recebe a data de agora, atual;
    const then = now + seconds * 1000;
    //a cada segundo then mostra o tempo restante;

    //exibe a contagem antes do interval, pra mostrar o tempo total; 
    displayTimeLeft(seconds);

    //exibe a hora pós contagem;
    displayEndTime(then);

    //contagem de tempo decrescente;
    countdow = setInterval(() => {
        //ao usar a funcção abaixo, poe ver no console que ao diminuir e passar do zero ele começa a contar negativo,
        //por isso é necessário parar a função quando chegar em um valor menor que zero;
        const secondsLeft = Math.round((then - Date.now())/1000);
        if(secondsLeft < 0){
            clearInterval(countdow);
            return;
        }
        //exibir o contador no console;
        displayTimeLeft(secondsLeft);
    }, 1000);
}

//ao usar apenas o interval, ele começa a rodar a partir do empo que foi colocado, no caso, 1 segundo,
//por isso caso tenha 10 segundos ele vai começar a contar a partir do 9, por isso precisamos criar uma função para exibir o tempo que falta;
function displayTimeLeft(seconds){
    const minutes = Math.floor(seconds/60);
    const remainderSeconds = seconds % 60;
    const display = `${minutes}:${remainderSeconds < 10 ? '0':''} ${remainderSeconds}`;
    //Adicionar o timer ao title da página;
    document.title = display;
    timerDisplay.textContent = display; 
}

//Exibir a hora final exata que o timer findará;
function displayEndTime(timestamp){
    const end = new Date(timestamp);
    const hour = end.getHours();
    const minutes = end.getMinutes();
    endTime.textContent = `Seu timer findará ${hour}:${minutes < 10 ? '0':''}${minutes}`;
}

//Função para iniciar o Timer ao clicar no botão;
function startTimer(){
    //Pegar o valor do data-time do botão que foi clicado e transformado em inteiro
    const seconds = parseInt(this.dataset.time);
    timer(seconds);
}

//identificar o evento do clique do botão e atribuir a função;
buttons.forEach(button=> button.addEventListener('click', startTimer));
document.customForm.addEventListener('submit', function(e){
    e.preventdefault();
    //Pegar o que foi digitado;
    const mins = this.minutes.value;
    //atribui como parametro(transformando em segundos)
    timer(mins*60);
    this,reset();
})