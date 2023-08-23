<?php

require_once __DIR__ . '/../vendor/autoload.php';

use Ex009\Views\Home;

$title = Home::render();

?>

<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="author" content="Cristian Pessotto" />
    <meta name="description" content="Descrição" />
    <meta name="keywords" content="HTML,  CSS,  JS" />
    <!-- <link href="css/style.css" rel="stylesheet" /> -->
    <!-- <link href="icons/name.png" rel="icon" type="image/png" size="16x16" /> -->
    <title><?= Home::render() ?></title>
    <style>
        body {
            background-color: #2d2b38;
        }
    </style>
</head>

<body>
    <!--! Cabeçalho da Página -->
    <header>
        <!--Code-->
    </header>
    <!--! Conteúdo da Página -->
    <main>
        <section>
            <?php echo "<h2 style='background-color: #ef5350; display: inline;'>" . home::render() . "</h2>" ?>
        </section>
        <section></section>
    </main>
    <!--! Rodapé da Página -->
    <footer></footer>
</body>

</html>