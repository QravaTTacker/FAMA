<?php
require_once __DIR__ . "/ContaBank.php";
require_once __DIR__ . "/../Client.php";

class ContaCorrente extends ContaBank
{
    private $SACAR = 0;
    private $DEPOSITAR = 1;
    private $saldo;
    private $movimentos;
    private Client $autor;

    function __construct(Client $autor = null, float $saldoInicial = 0.0)
    {
        if (!is_null($autor)) {
            $this->autor = $autor;
            $this->saldo = $saldoInicial;
            $this->movimentos = 0;
        } else {
            new Exception("Cliente não informado");
        }
    }

    public function getType(): string
    {
        return "Corrente";
    }

    public function getAutor(): Client
    {
        return $this->autor;
    }

    public function getSaldo(): float
    {
        return $this->saldo;
    }

    public function getSaldoFormat(): string
    {
        return number_format($this->saldo, 2, ".", ",");
    }

    public function getMovimentos(): int
    {
        return $this->movimentos;
    }

    public function setAutor(Client $newAutor): bool
    {
        if (!is_null($newAutor) and $this->autor->getCPF() != $newAutor->getCPF()) {
            $this->autor = $newAutor;
            return true;
        }
        return false;
    }

    private function setSaldo(float $value, int $option): bool
    {
        if ($option == $this->DEPOSITAR) {
            if ($value > 0) {
                $this->movimentos++;
                $this->saldo += $value;
                return true;
            }
        } else if ($option == $this->SACAR) {
            if ($this->getSaldo() >= $value) {
                $this->movimentos++;
                $this->saldo -= $value;
                return true;
            }
        }
        return false;
    }

    public function depositar(float $value): bool
    {
        return $this->setSaldo($value, $this->DEPOSITAR);
    }

    public function sacar(float $value): bool
    {
        return $this->setSaldo($value, $this->SACAR);
    }

    public function pagarConta(Divida $divida, int $parcelas): bool
    {
        return false;
    }

    public  function __toString(): string
    {
        return "Autor: {$this->autor->getName()} ({$this->autor->getCPF()})\nConta {$this->getType()} -> R\${$this->getSaldoFormat()}\nMovimentações: {$this->getMovimentos()}";
    }
}
