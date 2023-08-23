<?php

namespace Ex009\Controllers;

use Ex009\Models\Page;

class HomeController
{
    public static function getContent(): string
    {
        return Page::content();
    }
}
