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
