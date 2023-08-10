<?php

require_once __DIR__ . "/classes/Conta.php";

$line = str_Repeat("=", 30) . "\n";

$RED = "\033[31;1m";
$GREEN = "\033[32;1m";
$SEM = "\033[m";

$valor_saque = intval(readLine("Valor do saque: "));
$valor_deposito = doubleval(readline("Valor do depósito: "));

print "type: " . $GREEN . gettype($valor_saque) . $SEM . "\n";
print "type: " . $GREEN . gettype($valor_deposito) . $SEM . "\n";

$conta = new Conta($name = "Cristian", $saldo = 1024.50, $id = 8);

printf("Nome: %s\n", $conta->getNome());
printf("Saldo: %.2f\n", $conta->getSaldo());
printf("Id: %d\n", $conta->getId());

print $line;
printf(
    "Saque de R$%.2f -> %s\n",
    $valor_saque,
    ($conta->saque($valor_saque)
        ? $GREEN . "efetuado"
        : $RED . "negado") . $SEM
);

printf("Saldo: %s\n", $conta->getSaldoFormat());

print $line;
printf(
    "Depósito de R$%.2f -> %s\n",
    $valor_deposito,
    ($conta->depositar($valor_deposito)
        ? $GREEN . "efetuado"
        : $RED . "negado") . $SEM
);

printf("Saldo: %s\n", $conta->getSaldoFormat());
