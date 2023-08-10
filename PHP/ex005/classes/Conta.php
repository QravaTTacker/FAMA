<?php

/**
 * Classe de uma Conta genérica que permite realizar depósitos ou saques
 * 
 * @author QravaTTacker <fake@gmail.com>
 * @since 1.0.0
 * @copyright 2023 QravaTTacker
 */
class Conta
{

    /**
     * Atributo `nome` da classe Conta 
     * 
     * @var string
     */
    private string $nome;

    /**
     * Atributo `saldo` da classe Conta
     * 
     * @var float
     */
    private float $saldo;
    /**
     * Atributo `id` da classe Conta
     * 
     * @var int
     */
    private int $id;

    /**
     * Método construtor da class Conta
     * 
     * @param string $nome nome da conta
     * @param float $saldo_inicial valor inicial da conta
     * @param int $id id da conta
     */
    public function __construct(string $nome, float $saldo_inicial, int $id)
    {
        $this->nome = $nome;
        $this->saldo = $saldo_inicial;
        $this->id = $id;
    }

    /**
     * Método responsável por captar o nome da conta
     * 
     * @return string nome da conta
     */
    public function getNome(): string
    {
        return $this->nome;
    }

    /**
     * Método responsável por captar o saldo da conta
     * 
     * @return float saldo da conta
     */
    public function getSaldo(): float
    {
        return $this->saldo;
    }

    /**
     * Método responsável por capta o id da conta
     * 
     * @return int id da conta
     */
    public function getId(): int
    {
        return $this->id;
    }

    /**
     * Método que realiza um saque na conta
     * 
     * @param float $valor_saque valor do saque
     * @return bool validação do saque 
     */
    function saque(float $valor_saque): bool
    {
        if ($this->saldo >= $valor_saque and $valor_saque > 0.0) {
            $this->saldo -= $valor_saque;
            return true;
        }
        return false;
    }

    /**
     * Método que realiza um depósito na conta
     * 
     * @param float $valor_depositado valor do depositado 
     * @return bool validação do depósito
     */
    public function depositar(float $valor_depositado): bool
    {
        if ($valor_depositado > 0) {
            $this->saldo += $valor_depositado;
            return true;
        }
        return false;
    }

    /**
     * Método que retorna uma string formatada do saldo
     * 
     * @return string saldo formatado em notação BRL
     */
    public function getSaldoFormat(): string
    {
        return "R$ " . number_format($this->saldo, 2, ",", ".");
    }
}
