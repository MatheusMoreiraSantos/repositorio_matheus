//Declaração for([expressão Inicial]; [condição]; [incremento])
//Verifica a condição para executar o looping em seguida;

//var passo;
//for(passo = 0; passo < 5; passo++){
//    console.log('Ande um Passo');
//}

function howMany(selectObject){ //contagem em função da condição definida no laço;
    var nroSelecoes = 0;
    for(var i = 0; i < selectObject.options.length; i++ ){
        if(selectObject.options[i].selected){
            nroSelecoes++;
        }
    }
    return nroSelecoes;
}

var btn = document.getElementById('btn');
btn.addEventListener("click", function(){
    alert('Total Selecionados: '+ howMany(document.selectForm.tipoMusica))
});

/*do... while
Contagem se dá em função de uma condição booleana;
Executa o looping e depois verifica a condição;

do
    state
while(condição)*/

var resultado = '';
var i = 0;

do{
    i+=1;
    resultado += i+'';
} while(i<5);
document.getElementById('exemplo').innerHTML = resultado;

//=> while - Executa o loop enquanto a condição for verdadeira;
//Contar de 1 até 10;

contar = 1;
var i  = 0;
while(contar <= 10){
    i++;
}
 //Do While - Executa o Loop primeiro e depois verifica a condição;
 do{
    contagem ++;
 } while(contagem <= 10);

 //For - Executa o loop enquanto a condição for verdadeira;
 //porém a instancia das variaveis de contagem são intanciadas na estrutura do loop!
 contagem = 0;
 var i = 0;
 for(i = 0; i <= 10; i++){
    contagem++;
 }

 //Foreach - Executa o loop sobre elementos de um array
 contagem = [0,1,2,3,4,5,6,7,8,9];
i=0;
 contagem.forEach(contagem => {
    i++;
});

//Break - Encerra o loop atual;
// sintaxe break[label]; - break;
//ex.: A função encerra o loop quando a variavel i for 3 e então retorna 3 * x;
function testBreak(x){
    var i = 0;
    while (i < 6){
        if(i==3){
            break;
        }
        i += 1;
    }
    return i * x;
}

//A condicional Swich avalia uma expressão, combinando o valor da expressão com uma "clausula case" e
//executa os comandos associados ao case;
switch(expr){
    case "Laranjas":
        console.log("Laranjas R$ 4,99 Kg");
        break;

    case "Banana":
        console.log("Banana R$ 3,99 Kg");
        break;
    
    case "Maça":
        console.log("Maça R$ 7,99 Kg");
        break;
    
    case "Abacate":
        console.log("Abacate R$ 6,99 Kg");
        break;
    
    case "Abacaxi":
        console.log("Abacaxi R$ 3,99 Kg");
        break;
        
    case "Maracuja":
        console.log("Maracuja R$ 9,99 Kg");
        break;
            
    case "Limão":
        console.log("Limão R$ 8,99 Kg");
        break;
            
    case "Melão":
        console.log("Melão R$ 4,99 Kg");
        break;
    
    default:
        console.log("Desculpe, estamos sem nenhuma "+ expr + " . ")
}
console.log("Gostaria de adicionar mais algo?"); 