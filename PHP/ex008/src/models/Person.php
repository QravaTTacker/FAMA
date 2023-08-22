<?php

namespace Ex008\Models;

class Person
{

    private string $name;

    public function __construct(string $name = "name")
    {
        $this->name = $name;
    }

    public function getName()
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
