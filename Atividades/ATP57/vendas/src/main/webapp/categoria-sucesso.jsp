<%
    int id = (int)request.getAttribute("id");
%>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Sucesso</h1><br/>
    <h4>Categoria de id: <%= id%>cadastrada com sucesso!</h4>
    <br/>
    <a href="/vendas-1/categoria/listar">Listagem</a>
</body>
</html>