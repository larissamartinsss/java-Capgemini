<%@ page import="java.util.ArrayList, com.lariscode.vendas.models.Categoria" %>

<%
    ArrayList<Categoria> categorias = (ArrayList<Categoria>)request.getAttribute("categorias");
%>

<!DOCTYPE html>
<html lang="PT-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>categoria-lista</title>
</head>
<body>
    <h1>Lista de categorias</h1>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Nome</th>
            </tr>
        </thead>
        <tbody>

            <% %>        
            <tr>
                <td>1</td>
                <td>Cat1</td>
            </tr>
        </tbody>
    </table>
</body>
</html>