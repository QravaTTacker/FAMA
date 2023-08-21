<?php

require_once __DIR__ . '/vendor/autoload.php';

use  ex008\models\Person;

$person = new Person('Maria');

echo $person->getName() . "\n";
printf("Result: %s", $person->setName('') != 0 ? 'true' : 'false');
