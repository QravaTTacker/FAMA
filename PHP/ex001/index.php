<?php
$titleHome = "Meu Segundo Site Usando PHP";
?>

<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="author" content="Cristian Pessotto" />
    <meta name="description" content="PHP Home" />
    <meta name="keywords" content="HTML,  CSS,  PHP" />
    <link href="#" rel="stylesheet" />
    <link href="#" rel="icon" type="image/png" size="16x16" />
    <title>My Web Site</title>
    <script>
    </script>
    <style>
        body {
            background-color: plum;
        }
    </style>
</head>

<body>
    <!--! Cabeçalho da Página -->
    <header>
        <h1>
            <?php echo $titleHome; ?>
        </h1>
        <p>Click <a href="home-page.html">aqui</a> para ir para minha segunda página</p>
    </header>
    <!--! Conteúdo da Página -->
    <main>
        <section>
        </section>
        <section></section>
    </main>
    <!--! Rodapé da Página -->
    <footer></footer>
</body>

</html>