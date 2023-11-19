#include "Location.h"
#include <iostream>
#include <string>

Location::Location(std::string filename, int line)
	: _filename{filename}, _line{line} {}

std::ostream& operator<<(std::ostream& ost, const Location& location){
	ost << location._filename << " line: " << location._line;
	return ost;
} 

int Location::compare(Location other){
	int fileComp = _filename.compare(other._filename);
	if(fileComp != 0)
		return fileComp;
	if(_line < other._line)	return -1;
	if(_line > other._line) return 1;
	return 0;
}


