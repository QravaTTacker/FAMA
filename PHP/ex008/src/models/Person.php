<?php

namespace ex008\models;

class Person
{

    private string $name = 'none';

    public function __construct(string $name)
    {
        $this->name = $name;
    }

    public function getName(): string
    {
        return $this->name;
    }

    public function setName(string $newName): bool
    {
        if (empty($newName)) {
            return false;
        }
        $this->name = $newName;
        return true;
    }
}
