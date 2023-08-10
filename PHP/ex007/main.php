<?php
require_once __DIR__ . "/classes/Client.php";
require_once __DIR__ . "/classes/contas/ContaCorrente.php";

$conta = new ContaCorrente(
    new Client(
        "Cristian",
        "123.456.789-10"
    ),
    1024.0
);

echo "{$conta->getSaldoFormat()} -> {$conta->depositar(0.5)}\n";
echo "{$conta->getSaldoFormat()} -> {$conta->sacar(1024.0)}\n";
echo "{$conta->getSaldoFormat()}\n";

echo "------------------------\n";
echo "$conta\n";

$outro = new Client(
    "Lindonjonson",
    "123.456.789-11"
);

$outraConta = new ContaCorrente($outro);
echo "$outraConta\n";
