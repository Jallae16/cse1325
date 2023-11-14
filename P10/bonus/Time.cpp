#include "Time.h"
#include <iostream>
#include <string>
#include <vector>
#include <exception>
#include <regex>
#include <algorithm>
#include <iomanip>
#include <cstdlib>

Time::Time(int hour, int minute, int second)
	: _hour{hour}, _minute{minute}, _second{second} {
	rationalize();
	}
Time::Time()
    :_hour{0}, _minute{0}, _second{0} {}

int Time::compare(const Time& time)const{
	if(_hour != time._hour) return _hour - time._hour;
	if(_minute != time._minute) return _minute - time._minute;
	return _second - time._second;
}

std::ostream& operator<<(std::ostream& os, const Time& time){
	os << std::setfill('0') << std::setw(2) << time._hour << ':'
	   << std::setfill('0') << std::setw(2) << time._minute << ':'
	   << std::setfill('0') << std::setw(2) << time._second;
	return os;
}

std::istream& operator>>(std::istream& is, Time& time){
	char col1, col2;
	is >> time._hour >> col1 >> time._minute >> col2 >> time._second;
	if(!is.fail() && col1 == ':' && col2 == ':')
		time.rationalize();
	else
		is.setstate(std::ios::failbit);
	return is;
}

Time Time::operator+(int seconds) const{
	Time res(*this);
	res._second += seconds;
	res.rationalize();
	return *this;
}

Time operator+(int seconds, Time time){
	return time;
}

Time Time::operator++(int){
	Time time{*this};
	++(*this);
	return time;
}

Time& Time::operator++(){
	++_second;
	rationalize();
	return *this;
}

Time Time::operator+(Time time){
	Time res(*this);
	res._hour += time._hour;
	res._minute += time._minute;
	res._second += time._second;
	res.rationalize();
	return res;
}

void Time::rationalize(){
	if(_hour == 23 && _minute == 59 && _second == 60){
		_hour = 0; _minute = 0; _second = 0;
	}
	else if(_second < 0){
		if(_minute > 0 && _hour > 0){
			_minute--;
			_second = 60 + _second;
			_hour = (_hour + _minute/60 + _second/3600) % 24;
		}
		else if(_minute == 0 && _hour > 0){
			_minute = 59;
			_second = 60 + _second;
			_hour--;
		}
		else if(_minute == 0 && _hour == 0){
			_minute = 59;
			_second = 60 + _second;
			_hour = 23;
		}
		else{
			_minute--;
			_second = 60 + _second;
			_hour = (_hour + _minute/60 + _second/3600) % 24;
		}
	}
	else if(_minute < 0){
		if(_hour == 0){
			_minute = 60 + _minute;
			_hour = 23;
			_second %= 60;
		}
		else{
			_minute = 60 + _minute;
			_hour--;
			_second %= 60;
		}
	}
	else if(_hour < 0){
		_hour = 23 + _hour;
		_minute = (_minute + _second/60) % 60;
		_second %= 60;
	}
	else{
		_hour = (_hour + _minute/60 + _second/3600) % 24;
		_minute = (_minute + _second/60) % 60;
		_second %= 60;
	}
}

