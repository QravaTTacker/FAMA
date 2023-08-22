<?php

require_once __DIR__ . '/vendor/autoload.php';

use Ex008\Models\Person;

/**
 * 
 * index() -> Método que mostro todos os dados do banco.
 * 
 * criar() -> Retornar uma view para criar um cliente.
 * 
 * salvar() -> Cria ou atualiza o registro no banco de dados.
 * 
 * editar() -> View para editar um cliente.
 *
 * mostrarUm() -> Se necessário.
 * 
 * excluir() -> Esse remove um registro.
 * 
 */

$p = new Person("Ana");

echo "Nome na criação " . $p->getName() . "\n";
$p->setName("Maria");
echo "Novo nome agora é " . $p->getName() . "\n";
