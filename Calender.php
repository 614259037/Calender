<?php

class Calender
{
    public function getCalender($month, $day)
    {
        $date = "2021-" . $month . "-" . $day;
        $dayOfWeek = date("l", strtotime($date));
        return $dayOfWeek;
    }
}
