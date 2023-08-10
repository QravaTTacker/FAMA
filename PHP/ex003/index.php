<!DOCTYPE html>
<html lang="pt-BR" />

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="author" content="Cristian Pessotto" />
    <meta name="description" content="Atividade Avaliativa de Desenvolvimento Web - Faculdade FAMA 3° período" />
    <meta name="keywords" content="HTML,  CSS,  PHP" />
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
    <link href="my-css/style.css/" rel="stylesheet" />
    <link href="icons/fama-logo.png" rel="icon" type="image/png" size="16x16" />
    <title>Ordenação de Dados</title>
</head>

<body>

    <!--! Cabeçalho da Página -->
    <header>
        <nav class="my-nav navbar bg-body-tertiary">
            <div class="container-fluid">
                <h1>
                    <span class="my-nav-text navbar-text">
                        Atividade Avaliativa de WEB <span class="my-text-min">by Cristian Pessotto</span>
                    </span>
                </h1>
            </div>
        </nav>
    </header>

    <!--! Conteúdo da Página -->
    <main>
        <!--! Primeira Seção (Apresentação) -->
        <section class="my-section container">
            <h2 class="title">O que fazer?</h2>
            <p class="my-text">
                Use essa página para compartilhar uma <strong>lista de nomes</strong> e ela retornará a lista em <strong>ordem alfabética</strong>! 😏
            </p>
        </section> <!--! Término da Primeira Seção (Apresentação) -->

        <!--! Segunda Seção (Input dos dados) -->
        <section class="my-section container">
            <h2 class="title">Entrada de dados</h2>
            <!--! Formulário de Dados -->
            <form method="get" action="index.php">
                <label class="my-label" for="dados">Nomes: </label>
                <input class="my-input" type="text" name="dados" id="dados" placeholder="Digite aqui..." required>
                </input>
                <input class="my-input-submit" type="submit" value="Ordenar" required></input>
            </form>
            <p>
                <span>Obs</span>: Separe os nomes com uma <em>vírgula!</em>
            </p>
        </section> <!--! Término da Segunda Seção (Input dos dados) -->

        <!--! Terceira Seção (Output dos dados) -->
        <section class="my-section container">
            <h2 class="title-inline title">Saída de dados</h2>
            <?php
            if (isset($_GET['dados'])) {
                $nomes = explode(",", $_GET['dados']);

                foreach ($nomes as $key => $nome) {
                    // Se não tiver nenhum nome, trim retorna uma string vazia -> true para empty().
                    if (!empty(trim($nome))) {
                        $nomes[$key] = trim($nome);
                    } else {
                        unset($nomes[$key]);
                    }
                }

                if (!empty($nomes)) {
                    sort($nomes, SORT_STRING);
                    foreach ($nomes as $key => $nome) {
                        $key++;
                        echo "$key $nome <br>";
                    }
                } else {
                    echo "<strong>Não há nomes<strong> 😐";
                }
            }
            ?>

        </section> <!--! Término da Terceira Seção (Output dos dados) -->
    </main>

    <script src="bootstrap/js/bootstrap.min.js"></script>
</body>

</html>