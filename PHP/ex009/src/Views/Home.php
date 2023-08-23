<?php

namespace Ex009\Views;

use Ex009\Controllers\HomeController;

class Home
{
    public static function render(): string
    {
        return HomeController::getContent();
    }
}
