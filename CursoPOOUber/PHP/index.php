<?php

require_once('Car.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('Account.php');

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND546"), "Chevrolet", "Spark");
$uberX->PrintDataCar();

$uberPool = new UberPool("TYU532", new Account("Andrea Herrera", "ANDa546"), "Dodge", "Attitude");
$uberPool->PrintDataCar();
?>