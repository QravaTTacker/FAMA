<?php
require_once __DIR__ . "/Person.php";

class Client extends Person
{
    private $name;
    private $CPF;

    function __construct(string $name, string $CPF)
    {
        $this->name = $name;
        $this->CPF = $CPF;
    }

    public function getCPF(): string
    {
        return $this->CPF;
    }

    public function getName(): string
    {
        return $this->name;
    }

    public function setName(string $newName): bool
    {
        if (!empty($newName) and $newName != $this->name) {
            $this->name = $newName;
            return true;
        }
        return false;
    }

    public function __toString(): string
    {
        return "Autor: $this->name ($this->CPF)";
    }
}
