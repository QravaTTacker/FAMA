<?php
function separar($count): void
{
  for ($i = 0; $i < $count; $i++)
    echo "="; 
  echo "\n";
}

function atividade_1(): int
{
  $A = (int) readline('Primeiro valor: ');
  $B = (int) readline('Segundo valor: ');
  $soma = $A + $B;
  echo "O resultado é ", ($soma > 20 ? $soma + 8 : $soma - 5), "\n";
  return $soma;
}

function atividade_2($valor): string
{
  if ($valor % 2 == 0 && $valor % 5 == 0)
    return (string) $valor . " é divisível por 10, 5 e 2";
  if ($valor % 5 == 0)
    return (string) $valor . " é divisível por 5";
  if ($valor % 2 == 0)
    return (string) $valor . " é divisível por 2";
  return (string) $valor . " não é divisível por nenhum valor previsto :/";
}

function atividade_3(): void
{
  $nome = trim(readline("Digite seu nome: "));
  $idade = (int) readline("Digite sua idade: ");
  do {
    $sexo = strtolower(trim(readline("Sexo [M/F]: ")));
  } while ($sexo != "f" && $sexo != "m");
  echo $nome, ($sexo == "f" && $idade >= 25) ? " ACEITA!\n" : " NÃO ACEITA!\n";
}

function troca(int &$from, &$to): void
{
  $aux = $to;
  $to = $from;
  $from = $aux;
}

function atividade_4(int $A, int $B, int $C): void
{
  if ($A < $B) {
    troca($A, $B);
  }
  if ($A < $C) {
    troca($A, $C);
  }
  if ($B < $C) {
    troca($B, $C);
  }
  printf("%d %d %d\n", $A, $B, $C);
}

function atividade_5(float $A, float $B, float $C): string
{
  if (
    $A > $B + $C ||
    $B > $A + $C ||
    $C > $A + $B ||
    $A <= 0 || $B <= 0 || $C <= 0
  )
    return "Não forma um triângulo!";

  if ($A == $B && $B == $C)
    return "Triângulo equilátero";
  if ($A != $B && $B != $C && $C != $A)
    return "Triângulo Escaleno";
  else
    return "Triângulo Isósceles";
}

function atividade_6(int $valor_mes): string
{
  $array = [
    1 => "Janeiro", 2 => "Fevereiro", 3 => "Março",
    4 => "Abril", 5 => "Maio", 6 => "Junho",
    7 => "Julho", 8 => "Agosto", 9 => "Setembro",
    10 => "Outubro", 11 => "Novembro", 12 => "Dezembro"
  ];
  if ($valor_mes > 12 || $valor_mes < 1)
    return "Mês inválido";
  return $array[$valor_mes];
}

function atividade_7(): void
{
  echo "==================== biblioteca ====================\n";
  $nome = trim(readline("Digite seu nome: "));
  $livro = trim(readline("Digite o nome do livro: "));
  do {
    $dias = 0;
    $papel = strtolower(trim(readline("Papel na universidade [Aluno ou Professor]: ")));
    if ($papel == "aluno") {
      $dias = 3;
      break;
    } else if ($papel == "prof" || $papel == "professor") {
      $dias = 10;
      break;
    }
  } while (true);
  echo "Tudo pronto $nome! seu livro intitulado como \"$livro\" será reservado por $dias dias!\n";
}

function atividade_8(int $limite): void
{
  for ($i = 1; $i <= $limite; $i++) {
    $produto = $limite * $i;
    echo "$i * $limite = $produto\n";
  }
}

function atividade_9(int $repeats): void
{
  echo str_repeat("SOL ", abs($repeats)), "\n";
  //for($i = 0; $i < $repeats; $i++)...
}

function atividade_10(): void
{
  $soma_par = 0;
  $total_negativos = 0;
  for ($i = 0; $i < 5; $i++) {
    $valor = (float) readline(((string) $i + 1) . "º valor: ");
    // $valor = mt_rand(-10, 10);
    if ($valor > 0)
      $soma_par += $valor;
    else
      $total_negativos++;
  }
  echo "Soma de todos os pares é de $soma_par.\n";
  echo "Quantidade de números negativos é de $total_negativos.\n";
}

function atividade_11(int $valor): void
{
  for ($i = 0; $i <= 10; $i++)
    printf("%.2f * %.2f = %.2f\n", $i, $valor, ($i * $valor));
}

function atividade_12(string $palavra): void
{
  for ($i = 0; $i < strlen($palavra); $i++) {
    for ($j = 0; $j <= $i; $j++)
      echo strtoupper(trim($palavra)) . " ";
    echo "\n";
  }
}

function atividade_13(): void
{
  $contador = 0;
  do {
    $valor = (int) readline("Entre com um valor [0 para sair]: ");
    if ($valor >= 100 && $valor <= 200)
      $contador++;
  } while ($valor != 0);
  echo $contador, " é a quantidade de valores entre 100 e 200\n";
}

function atividade_14(): void
{
  $chico = 150;
  $juca = 110;
  $anos = 0;
  while ($juca <= $chico) {
    $anos++;
    $chico += 2;
    $juca += 3;
    echo "Ano ", $anos, " -> Chico: ", $chico, " || Juca: ", $juca, "\n";
  }
  echo "Levou ", $anos, " para Juca ultrapassar a altura de Chico\n";
}

function atividade_15(float $massa): void
{
  $tempo = 0;
  while ($massa >= 0.1) {
    printf("tempo: %4ds | massa: %.2f\n", $tempo, $massa);
    $massa -= ($massa * 0.25);
    $tempo += 30;
  }
  if ($tempo >= 3600) {
    $hora = intdiv($tempo, 3600);
    $minuto = intdiv($tempo, 60) % 60;
    $segundo = $tempo % 60;
    echo "Levou ", $hora, " hora(s), ", $minuto, " minuto(s) e ", $segundo, " segundo(s) para a massa ser inferior a 0.10T\n";
  } else if ($tempo >= 60) {
    $minuto = intdiv($tempo, 60);
    $segundo = $tempo % 60;
    echo "Levou ", $minuto, " minuto(s) e ", $segundo, " segundo(s) para a massa ser inferior a 0.10T\n";
  } else {
    $segundo = $tempo;
    echo "Levou ", $segundo, " segundo(s) para a massa ser inferior a 0.10T\n";
  }
}

function atividade_16(): void
{
  $red = "\033[31;1m";
  $green = "\033[32;1m";
  $null = "\033[m";
  for ($i = 0; $i < 15; $i++) {
    $array[$i] = mt_rand(0, 100);
    printf("%3d %s", $array[$i], ($array[$i] % 2 == 0 ?  $green . "par\n" : $red . "ímpar\n") . $null);
  }
}

function valores(array $array): array
{
  $maior = $array[0];
  $menor = $array[0];
  for ($i = 1; $i < sizeof($array); $i++) {
    if ($maior < $array[$i])
      $maior = $array[$i];
    if ($menor > $array[$i])
      $menor = $array[$i];
  }
  return ["maior" => $maior, "menor" => $menor];
}

function atividade_17(): void
{
  for ($i = 0; $i < 20; $i++) {
    $array[$i] = mt_rand(0, 100);
    echo $array[$i], " ";
  }
  $soma = 0;
  $total_pares = 0;
  for ($i = 0; $i < sizeof($array); $i++) {
    $soma += $array[$i];
    if ($array[$i] % 2 == 0)
      $total_pares++;
  }
  $polos = valores($array);
  echo "\nMaior: ", $polos["maior"], "\n";
  echo "Menor: ", $polos["menor"], "\n";
  printf("%g%% dos valores são pares!\n", (float) 100 / (sizeof($array) / $total_pares));
  printf("Média dos valores: %g\n", $soma / sizeof($array));
}

function remove_nulls(array &$array): void
{
  $newArray = [];
  for ($i = 0; $i < sizeof($array); $i++)
    if (!is_null($array[$i]))
      $newArray[$i] = $array[$i];
  $array = $newArray;
}

function print_array(array &$array, string $title): void
{
  remove_nulls($array);
  if (!empty($array)) {
    $body = "[";
    for ($i = 0; $i < sizeof($array) - 1; $i++) {
      $body .= ($array[$i] . ", ");
    }
    echo $title, ($body . $array[sizeof($array) - 1] . "]"), " -> ", sizeof($array), "\n";
  } else {
    echo $title, "[] -> 0\n";
  }
}

function contains(int $value, array $array): bool
{
  if (!empty($array)) {
    $inicio = 0;
    $fim = sizeof($array) - 1;
    while ($inicio <= $fim) {
      $meio = intdiv(($fim + $inicio), 2);
      if ($value == $array[$meio])
        return true;
      else if ($value > $array[$meio])
        $inicio = $meio + 1;
      else
        $fim = $meio - 1;
    }
  }
  return false;
}

// Função para identificar os valores que se repetem para o vetor A e B. 
function comuns(array $A, array $B): array
{
  $comuns = [];
  $k = 0;
  for ($i = 0; $i < sizeof($A); $i++)
    for ($j = 0; $j < sizeof($B); $j++)
      if ($A[$i] == $B[$j]) {
        $comuns[$k++] = $A[$i];
        break;
      }
  return $comuns;
}


// Caso a contagem de um elemento é superior a 1, dizemos que este etá duplicado.  
function duplicado(array $array, int $value): bool
{
  $count = 0;
  for ($i = 0; $i < sizeof($array) && $count < 2; $i++)
    if ($array[$i] == $value)
      $count++;
  if ($count >= 2)
    return true;
  return false;
}

//Armazena os valores que estão repetidos no próprio vetor.
function repetidos(array &$array, array $origin): void
{
  for ($i = 0; $i < sizeof($origin); $i++)
    if (duplicado($origin, $origin[$i])) // Itera para cada valor.
      $array[sizeof($array) + $i] = $origin[$i];
}

function remove_repetidos(array &$array): void
{
  $newArray[0] = $array[0];
  $k = 1;
  for ($i = 1; $i < sizeof($array); $i++)
    if ($array[$i] != $array[$i - 1])
      $newArray[$k++] = $array[$i];
  $array = $newArray;
}

function atividade_18(): void
{

  $size = 10;
  $arrayA = [];
  $arrayB = [];
  $array_diferentes = [];

  for ($i = 0; $i < $size; $i++) {
    $arrayA[$i] = mt_rand(0, 50);
    $arrayB[$i] = mt_rand(0, 10);
    $array_diferentes[$i] = null;
  }

  // $arrayA = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  // $arrayB = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

  //Array para armazenar todos os valores que se repetem entre os dois vetores.
  // -> A[1, 2, 5, 9] & B[2, 3, 5, 7] = C[2, 5]
  $array_comuns = comuns($arrayA, $arrayB);

  //Armazena os valores que estão repetidos no vetor A.
  // -> A[1, 2, 3, 3, 4, 4, 5, 5, 9] = A[3, 3, 4, 4, 5, 5]
  repetidos($array_comuns, $arrayA);

  //Armazena os valores que estão repetidos no vetor B.
  // -> B[1, 2, 3, 3, 4, 4, 5, 5, 9] = B[3, 3, 4, 4, 5, 5]
  repetidos($array_comuns, $arrayB);

  //Apenas para busca binária.
  // -> [1, 1, 1, 2, 2, 4, 8, 8]
  sort($array_comuns, SORT_NUMERIC);

  //Remove todos os valores repetidos, pois eles não serão necessários.
  // -> [1, 2, 4, 8]
  remove_repetidos($array_comuns);

  /**
   *  A[k] ->  R-r-R-r-R-r-R-r-R-r-R-r-R-r-R-r-R-r
   *           | | | | | | | | | | | | | | | | | |
   *  B[k] ->  r R r R r R r R r R r R r R r R r R
   * 
   *  C[i] -> R-r-R-r-R-r-R-r-R-r
   */

  $k = 0; // Para os valores de A e B.
  $i = 0; // Para os valores do vetor criado.
  do {
    // Adiciona o valor A se ele não for duplicado.
    if (!contains($arrayA[$k], $array_comuns)) {
      $array_diferentes[$i] = $arrayA[$k];
      $i++;
    }

    // Adiciona o valor B se ele não for duplicado e se %i ainda está no limite dos valores.
    if (!contains($arrayB[$k], $array_comuns) && $i < $size) {
      $array_diferentes[$i] = $arrayB[$k];
      $i++;
    }
  } while ($i < $size && ++$k < $size);

  // Mostra o vetor, A, B, os valores que são repetidos e um o vetor com valores de A e B (não repetidos)
  print_array($arrayA, "Vetor A: ");
  print_array($arrayB, "Vetor B: ");
  print_array($array_comuns, "Comuns: ");
  print_array($array_diferentes,  "Diferentes: ");
}

function atividade_19(): void
{
  $size = 5;
  $matriz = [[], [], [], [], []];
  for ($i = 0; $i < $size; $i++) {
    for ($j = 0; $j < $size; $j++) {
      $matriz[$i][$j] = mt_rand(0, 99);
      if ($i == $j)
        printf("%3d ", $matriz[$i][$j]);
      else
        print "    ";
    }
    echo "\n";
  }
}
function atividade_20(): void
{
  $size = 5;
  $matriz = [[], [], [], [], []];
  echo "Toda a Matriz\n";
  for ($i = 0; $i < $size; $i++) {
    for ($j = 0; $j < $size; $j++) {
      $value = $matriz[$i][$j] = mt_rand(0, 99);
      printf("%3d ", $value);
    }
    echo "\n";
  }

  echo "\nValores Pares\n";
  for ($i = 0; $i < $size; $i++) {
    for ($j = 0; $j < $size; $j++) {
      $value = $matriz[$i][$j];
      if ($value % 2 == 0)
        printf("%3d ", $value);
      else
        print "    ";
    }
    echo "\n";
  }

  echo "\nValores Ímpares\n";
  for ($i = 0; $i < $size; $i++) {
    for ($j = 0; $j < $size; $j++) {
      $value = $matriz[$i][$j];
      if ($value % 2 == 1)
        printf("%3d ", $value);
      else
        print "    ";
    }
    echo "\n";
  }
}

separar(20);
atividade_1();
separar(20);
echo atividade_2(500), "\n";
separar(20);
atividade_3();
separar(20);
atividade_4(1, 2, 3);
separar(20);
echo atividade_5(4, 5, 8), "\n";
separar(20);
echo atividade_6(12), "\n";
separar(20);
atividade_7();
separar(20);
atividade_8(10);
separar(20);
atividade_9(3);
separar(20);
atividade_10();
separar(20);
atividade_11(8);
separar(20);
atividade_12("sonho");
separar(20);
atividade_13();
separar(20);
atividade_14();
separar(20);
atividade_15(1.0);
separar(20);
atividade_16();
separar(20);
atividade_17();
separar(20);
atividade_18();
separar(20);
atividade_19();
separar(20);
atividade_20();
separar(20);
