<?php
require_once __DIR__ . "/../Client.php";

abstract class ContaBank
{
    public abstract function getType(): string;
    public abstract function getAutor(): Client;
    public abstract function getSaldo(): float;
    public abstract function getSaldoFormat(): string;
    public abstract function getMovimentos(): int;
    public abstract function setAutor(Client $newAutor): bool;
    public abstract function depositar(float $value): bool;
    public abstract function sacar(float $value): bool;
    public  abstract function __toString(): string;
}
