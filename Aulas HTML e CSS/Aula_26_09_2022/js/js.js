var funcionarios = '
{
    "Arthur": {
        "Idade": 16, 
        "Cidade": "Guatambu"
    },
    "Anderson": {
        "Idade": 27, 
        "Cidade": "Chapecó"
    },
    "Maurício": {
        "Idade": 56, 
        "Cidade": "Chapecó"
    },
    "Pedro": {
        "Idade": 22, 
        "Cidade": "Chapecó"
    },
    "João": {
        "Idade": 29, 
        "Cidade": "Chapecó"
    },
    "Aline": {
        "Idade": 19, "Cidade": "Chapecó"
    },
}';

var empregados = JSON.parse(funcionarios);
alert(funcionarios.Joao);
alert(funcionarios.Joao.Idade);
alert(funcionarios.Joao.Cidade);

