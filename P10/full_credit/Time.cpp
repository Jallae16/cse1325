#include "Time.h"
#include <iostream>
#include <string>
#include <vector>
#include <exception>
#include <regex>
#include <algorithm>

Time::Time(int hour, int minute, int second)
	: _hour{hour}, _minute{minute}, _second{second} {
	
	}

int Time::compare(const Time& time){
	if(_hour < time._hour) return -1;
	if(_hour > time._hour) return 1;
	if(_minute < time._minute) return -1;
	if(_minute > time._minute) return 1;
	if(_second < time._second) return -1;
	if(_second > time._second) return 1;
}

std::ostream& operator<<(std::ostream& os, const Time& time){
	os << time._hour << " " << time._minute << " " << time._second;
	return os;
}

std::istream& operator>>(std::istream& is, Time& time){
	is >> time._hour;
	is >> time._minute;
	is >> time._second;
	if(1 > time._hour || time._hour > 24)
		throw std::runtime_error("Invalid Hour");
}


