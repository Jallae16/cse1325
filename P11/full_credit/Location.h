#ifndef __LOCATION_H
#define __LOCATION_H

#include <iostream>
#include <string>

class Location{
	public:
		Location(std::string filename, int line);
		
		inline bool operator==(const Location& location){ return compare(location) == 0;}
		inline bool operator!=(const Location& location){ return compare(location) != 0;}
		inline bool operator< (const Location& location){ return compare(location) <  0;}
		inline bool operator> (const Location& location){ return compare(location) >  0;}
		inline bool operator<=(const Location& location){ return compare(location) <= 0;}
		inline bool operator>=(const Location& location){ return compare(location) >= 0;}
		
		friend std::ostream& operator<<(std::ostream& ost, const Location& location);
		
	private:
		std::string _filename;
		int _line;
		int compare(Location location);
};

#endif
