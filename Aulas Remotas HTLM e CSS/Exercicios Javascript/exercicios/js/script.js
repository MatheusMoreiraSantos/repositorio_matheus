//Exercicio Cardápio:

function calculo1(){
   // Produto           Cod   Preço
   // cachorro quente   100   1.70;
   // bauru simples     101   2.30;
   // bauru com ovo     102   2.60;
   // hamburguer        103   2.40;
   // cheeseburguer     104   2.50;
   // refrigerante      105   1.00; 

    let c = Number(document.getElementById('cod_p').value);
    let q = Number(document.getElementById('qtd_p').value);

    
     if(c == 100){
        document.getElementById('out').innerHTML="Resposta: "+(q * 1.70).toFixed(2);
    } else if (c == 101) {
        document.getElementById('out').innerHTML="Resposta: "+(q * 2.30).toFixed(2);
    } else if (c == 102){
        document.getElementById('out').innerHTML="Resposta: "+(q * 2.60).toFixed(2);
    } else if (c == 103){
        document.getElementById('out').innerHTML="Resposta: "+(q * 2.40).toFixed(2);
    } else if (c == 104) {
        document.getElementById('out').innerHTML="Resposta: "+(q * 2.50).toFixed(2);
    } else if (c == 105){
        document.getElementById('out').innerHTML="Resposta: "+(q * 1.00).toFixed(2);
    } else {
        document.getElementById('out').innerHTML="Por favor, insiva valores validos";
    }

}

//Exercicio 4 - Números pares elevados ao quadrado:

function quadrado(){
    let out2 = document.getElementById('out2');
    //out.innerHTML += `<h2>Resultado da Operação: </h2>`;

   let c = 1;
   while(c <= 10){
    if(c % 2 == 0){
        document.getElementById('out2').innerHTML="Resposta: "+ (Math.pow(`${c};`, 2));
        //out.innerHTML += `<mark><strong> ${c};</mark></strong>`
    } else {
        out2.innerHTML += `${c};`;
    }
    c++;
   }


}