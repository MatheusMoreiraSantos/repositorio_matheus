//Classe document: envia informações para o documento;
document.write("Bom dia Chapecó!");

//Title - Retotna o Título da página;
//URL - Retorna a url completa da página;

document.write("<h2>"+document.title+"</h2>");

//document.writeln(document.URL);

//Requisitando informações do HTML e alterando-as:
function fAlterar(){
    var x = document.getElementById("paragrafo");
    x.innerHTML="Bom dia";
    //innerHTML troca um texto por outro;
}

function inter(){
    var btnNome= Element=document.getElementById("btnInter");
    var lampada = Element=document.getElementById("imgLamp");
    if (Element.src.match("bulbon")){ //match checa se o src contem a imagem em questão;
        Element.src="img/pic_bulboff.gif";
        btnNome.innerHTML="Ligar"
    }else{
        Element.src="img/pic_bulbon.gif";
        btnNome.innerHTML="Desligar"
    }
}

function soma(){
    var n1 = parseInt(document.getElementById("v1").value);
    var n2 = parseInt(document.getElementById("v2").value);
    document.getElementById("res").innerHTML = "Resposta: "+(n1+n2);
}

function subtracao(){
    var n1 = parseInt(document.getElementById("v1").value);
    var n2 = parseInt(document.getElementById("v2").value);
    document.getElementById("res").innerHTML = "Resposta: "+(n1-n2);
}

function multiplicacao(){
    var n1 = parseInt(document.getElementById("v1").value);
    var n2 = parseInt(document.getElementById("v2").value);
    document.getElementById("res").innerHTML = "Resposta: "+(n1*n2);
}

function divisao(){
    var n1 = parseInt(document.getElementById("v1").value);
    var n2 = parseInt(document.getElementById("v2").value);
    document.getElementById("res").innerHTML = "Resposta: "+(n1/n2);
}

function porcento(){
    var n1 = parseInt(document.getElementById("v1").value);
    var n2 = parseInt(document.getElementById("v2").value);
    document.getElementById("res").innerHTML = "Resposta: "+(n1*(n2/100));
}

function limpar(){
    var n1 = document.getElementById("v1");
    var n2 = document.getElementById("v2");
    var r = document.getElementById("res");
    n1.value="";
    n2.value="";
    r.innerHTML="Resposta: ";
}