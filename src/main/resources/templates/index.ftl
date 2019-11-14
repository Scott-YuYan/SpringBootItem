  <!DOCTYPE html>
    <html lang="zh-CN">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>成绩排行榜</title>
    </head>
    <body>
    <table>
        <thead>
            <tr>
                <th>序号</th>
                <th>成绩</th>
                <th>姓名</th>
                <th>学号</th>
            </tr>
            </thead>
            <tbody>

            <#list items as item>
                 <tr>
                    <td>${item?index+1}</td>
                    <td>${item.user.name}</td>
                    <td>${item.score}</td>
                    <td>${item.user.id}</td>
                 </tr>
            </#list>
            </tbody
    </table>
    </body>
    </html>

