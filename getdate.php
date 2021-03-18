<?php
include "Calender.php";
$day = $_POST["Day"];
$month = $_POST["Month"];

$calendar = new Calender();
$result = $calendar->getCalender($month, $day);
?>
<h1 id="res">
    <?php echo $result ?>
</h1>