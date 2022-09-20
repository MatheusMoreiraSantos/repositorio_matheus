function validar() {
    var nome          = document.getElementById('nome').value;
    var email         = document.getElementById('email').value;
    var telefone      = document.getElementById('telefone').value;
    var cpf           = document.getElementById('CPF').value;
    var senha         = document.getElementById('senha').value;
    var confirmSenha = document.getElementById('confirmSenha').value;

    if(!nome){
        document.getElementById('erro').style.display='block'; 
        // style.display='blcok' Passa a propriedade "display: block" do CSS 
        //para o elemento em questão, no caso o "nome";
    
        document.getElementById('erro').innerHTML = 'Campo nome não informado'; 
        
        return false;
    }
    if (!email){
        document.getElementById('erro').style.display='block'; 
        document.getElementById('erro').innerHTML = 'Informe seu E-mail';
        document.getElementById('email').focus;
        return false;
    }
    if(!telefone){
        document.getElementById('erro').style.display='block'; 
        document.getElementById('erro').innerHTML = 'Informe seu telefone';
        return false;
    }
    if(!cpf){
        document.getElementById('erro').style.display='block'; 
        document.getElementById('erro').innerHTML = 'Informe seu CPF';
        return false;
    }
    if(!senha){
        document.getElementById('erro').style.display='block'; 
        document.getElementById('erro').innerHTML = 'Informe sua senha';
        return false;
    }
    if(!confirmSenha){
        document.getElementById('erro').style.display='block'; 
        document.getElementById('erro').innerHTML = 'Informe o campo confirmar senha!';
        return false;
    }

    //Validação de Senhas;
    if(senha != confirmSenha){
        document.getElementById('erro').style.display='block'; 
        document.getElementById('erro').innerHTML = 'As senhas não são correspondentes';
        return false;
    }

    //Validação do tamanho da senha;
    if(senha.length != 8) {
        document.getElementById('erro').style.display='block'; 
        document.getElementById('erro').innerHTML = 'A senha deve conter 8 dígitos';
        return false;
    }
}

function checkCookies(){
    if (navigator.cookieEnabled==true){
            alert("Cookies são permitidos")
        }
        else{
            alert("Cookies não são permitidos")
        }
}
function myChange(){
    var x=document.getElementById("fname");
    x.value=x.value.toUpperCase();
}

function mOver(obj){
    obj.innerHTML="Obrigado"
}
function mOut(obj){
    obj.innerHTML="Passe o mouse Aqui!"
}
function mDown(obj)
{
obj.style.backgroundColor="#1ec5e5";
obj.innerHTML="Solte o clique"}
function mUp(obj)
{
obj.style.backgroundColor="#D94A38";
obj.innerHTML="Obrigado"
}
function dentro()
{
   document.getElementById("meuInput").style.background = "red";
}

function fora()
{
   document.getElementById("meuInput").style.background = "blue";
}

