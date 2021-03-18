<?php
include "Calender.php";
include "formCalender.php";

use PHPUnit\Framework\TestCase;

class Test_calender extends TestCase
{
    private $calendar;
    public function setUp(): void
    {
        $this->calendar = new Calender();
    }

    public function testDate1()
    {
        $this->assertEquals('Wednesday', $this->calendar->getCalender(02, 03));
    }
    public function testDate2()
    {
        $this->assertEquals('Friday', $this->calendar->getCalender(01, 15));
    }
    public function testDate3()
    {
        $this->assertEquals('Tuesday', $this->calendar->getCalender(04, 20));
    }
}
