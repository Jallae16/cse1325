#include "Location.h"


Location::Location(std::string filename, int line)
	: _filename{filename}, _line{line} {}

std::ostream& operator<<(std::ostream ost, const Location location){
	ost << location._filename << " line: " << location._line;
	return ost;
} 

int Location::compare(Location location){
	if(!(_filename.compare(location._filename))) return 1;
	if(_filename.compare(location._filename)) return -1;
	return _line - location._line;
}


