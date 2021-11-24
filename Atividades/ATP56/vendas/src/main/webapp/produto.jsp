<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>produto - Cadastro</title>
</head>
<body>
    <h1>Cadastro de produtos</h1>
    <form action="/vendas-1/produto" method="post">
    nome: <input type="text" name="nome" id="nome"><br/>
    valor: <input type="number" name="valor" id="valor" min="0.00" max="10000.00" step="0.01"><br/>
    id categoria: <input type="number" name="id_categoria" id="id_categoria"><br/>
    <input type="submit" value="salvar">
</form>
</body>
</html>