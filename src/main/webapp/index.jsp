<%@ page import="CRUD.Metodos" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Painel de Controle</title>

</head>
<body>
<header>
    <li>
    <li><a href="##">Home</a></li>
    <li><a href="##">Notificação</a></li>
    </li>
</header>
<main>
    <h1>Bem-vindo ao Painel de Controle</h1>
    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eveniet possimus repellendus ex porro odit aut quidem voluptatum delectus eaque veritatis.</p>
    <table >
        <tr>
            <th>Nome</th>
            <th>Status</th>
        </tr>
        <tr>
            <td>AWS</td>
            <td>Ativo</td>
        </tr>
        <tr>
            <td>Oracle</td>
            <td>Inativo</td>
        </tr>
        <tr>
            <td>Jira</td>
            <td>Ativo</td>
        </tr>
    </table>
    <canvas class="line-chart"></canvas>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.min.js"></script>

    <script>
        var ctx = document.getElementsByClassName("line-chart");
        var cahrtGraph = new Chart(ctx, {
            type: 'line',
            data: {
                labels: ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"],
                datasets: [
                    {
                        label: "AWS",
                        data: [
                            <%
                        Metodos metodos = new Metodos();
                        ResultSet rs = metodos.buscarAws();
                        while(rs.next()){
                            String api = rs.getString("nome_api");
                            if(api.equals("ativo")){%>
                        1, <%
                            }else{
                                int i = 0;%> , <%
                            }
                        } %>

                        ],
                        borderWidth: 6,
                        borderColor: 'rgba(6,204,6,0.85)',
                        backgroundColor: 'transparent',
                    }
                ]

            }

        })
    </script>

</main>

</body>
</html>