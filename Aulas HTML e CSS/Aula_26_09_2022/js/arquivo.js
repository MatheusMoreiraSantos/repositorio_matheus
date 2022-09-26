var target = document.getElementById("ref1");

if(target != null) {
    window.alert(
        "Nome do nó: "+ target.nodeName + "\n"+
        "HTML dentro nó: "+ target.innerHTML+"\n"+
        "ID:" +target.id+"\n"+
        "Tem filhos?" + target.hasChildNodes()
    );
} else {
    window.alert("Elemento não encontrado!");
}