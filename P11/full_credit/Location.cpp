#include "Location.h"
#include <iostream>
#include <string>

Location::Location(std::string filename, int line)
	: _filename{filename}, _line{line} {}

std::ostream& operator<<(std::ostream& ost, const Location& location){
	ost << "" << location._filename << " line: " << location._line;
	return ost;
} 

inline bool Location::operator==(const Location& location)const{ 
	return this->_filename == location._filename && this->_line == location._line;
}
inline bool Location::operator<(const Location& location)const{ 
	if(_filename < location._filename) return true;
	if(_filename == location._filename && _line < location._line) return true;
	return false;
}
inline bool Location::operator!=(const Location& location)const{ 
	return !(*this == location);
}
inline bool Location::operator<=(const Location& location)const{ 
	return *this < location || *this == location;
}
inline bool Location::operator> (const Location& location)const{ 
	return !(*this <= location);
}
inline bool Location::operator>=(const Location& location)const{ 
	return !(*this < location);
}


