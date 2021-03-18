
    <?php
    include "Calender.php";
    $day = $_POST["day"];
    $month = $_POST["month"];

    $calendar = new Calender();
    $result = $calendar->getCalender($month, $day);
    echo $result;
    ?>
