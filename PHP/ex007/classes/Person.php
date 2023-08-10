<?php

abstract class Person
{
    private $name;
    private $CPF;
    public abstract function getCPF(): string;
    public abstract function getName(): string;
    public abstract function setName(string $newName): bool;
}
