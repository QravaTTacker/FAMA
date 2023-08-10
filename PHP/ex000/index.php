<?php
$var1 = "8";
$var2 = 5;
$array = [['A', 'B', 'C'], ['D', 'E', 'F'], ['G', 'H', 'I']];
var_dump($array);
$obj = new stdClass();
$obj->pessoa = new stdClass();
$obj->pessoa->nome = "Cristian";
$obj->pessoa->idade = 21;
var_dump($obj);
phpinfo();
phpinfo();
printf("%s\n", $var1);
?>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="author" content="Cristian Pessotto" />
    <meta name="description" content="Site Com HTML e PHP" />
    <meta name="keywords" content="HTML,  CSS,  PHP" />
    <link href="#" rel="stylesheet" />
    <link href="#" rel="icon" type="image/png" size="16x16" />
    <title>My Web Site</title>
    <script>
    </script>
</head>

<body>
    <!--! Cabeçalho da Página -->
<header>
    <h1>
        Dados da Pessoa
    </h1>
    <p>
        <?php
        var_dump($obj);
        ?>
    </p>
</header>
<!--! Conteúdo da Página -->
<main>
    <section></section>
    <section></section>
</main>
<!--! Rodapé da Página -->
<footer></footer>
</body>

</html>
